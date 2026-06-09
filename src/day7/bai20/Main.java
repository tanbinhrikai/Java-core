package day7.bai20;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String inputFile = "diem.csv";
        String outputFile = "ket_qua.csv";
        String reportFile = "baocao.json";

        AtomicInteger totalLinesRead = new AtomicInteger(0);
        AtomicInteger totalCountError = new AtomicInteger(0);
        AtomicInteger totalParse = new AtomicInteger(0);

        Path inputPath = Paths.get(inputFile);

        try (Stream<String> lines = Files.lines(inputPath)) {
            List<KetQuaSinhVien> ketQuaSinhViens = lines
                    .peek(line -> totalLinesRead.incrementAndGet()) // peek liec nhin trom du lieu
                    .skip(1)
                    .map(SinhVien::fromCSV)
                    .peek(opt -> {
                        if (opt.isEmpty()) totalCountError.incrementAndGet();
                    })
                    .flatMap(Optional::stream)
                    .map(sv -> new KetQuaSinhVien(sv.msv(), sv.hoTen(), sv.khoa(), sv.tinhDiemTrungBinh()))
                    .peek(l -> totalParse.incrementAndGet())
                    .toList();

            Map<String, Long> thongKeTheoKhoa = ketQuaSinhViens.stream()
                            .collect(
                                    Collectors.groupingBy(KetQuaSinhVien::khoa,
                                            Collectors.counting())
                            );

            // write csv file
            writeCSVOutput(outputFile, ketQuaSinhViens);

            // write json file
            String khoaJson = thongKeTheoKhoa.entrySet().stream()
                    .map(e -> String.format("    \"%s\": %d", e.getKey(), e.getValue()))
                    .collect(Collectors.joining(",\n"));
            String jsonTemplate = """
            {
              "tong_so_dong_doc": %d,
              "sinh_vien_hop_le": %d,
              "dong_loi_loai_bo": %d,
              "thong_ke_khoa": {
            %s
              }
            }
            """.formatted(totalLinesRead.get(), totalParse.get(), totalCountError.get(), khoaJson);
            Files.writeString(Paths.get(reportFile), jsonTemplate);

            System.out.println("===THONG KE NHANH===");
            System.out.println("Input: " + inputFile + " (" + totalLinesRead + " dong)");
            System.out.println("Pipeline:");
            System.out.printf("[1] Doc %d dong%n", totalLinesRead.get());
            System.out.printf("[2] Parse %d SinhVien%n", totalParse.get());
            System.out.printf("[3] Filter: %d dong loi loai bo%n", totalCountError.get());
            System.out.printf("[4] Tinh diem TB: %d SV%n", totalParse.get());
            System.out.println(String.format("[5] Group by khoa: %s", thongKeTheoKhoa.entrySet().stream().map(
                    entry -> entry.getKey() + " = " + entry.getValue()
            ).collect(Collectors.joining(", "))));
            System.out.println(String.format("[6] Output: ket_qua.csv + baocao.json"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void writeCSVOutput(String outputPathStr, List<KetQuaSinhVien> list) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputPathStr))) {
            writer.write("maSV,hoTen,khoa,diemTB"); // Viết header mới
            writer.newLine();
            for (KetQuaSinhVien kq : list) {
                writer.write(kq.toCSVRow());
                writer.newLine();
            }
        }
    }
}
