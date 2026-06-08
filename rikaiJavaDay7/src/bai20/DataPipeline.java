package bai20;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

public class DataPipeline {

    public static void main(String[] args) throws IOException {

        Path input = Path.of("diem.csv");
        Path outputCsv = Path.of("ket_qua.csv");
        Path outputJson = Path.of("baocao.json");

        List<Student> students = Files.lines(input)
                .skip(1)

                .map(DataPipeline::parse)
                .filter(Objects::nonNull)

                // tính avg
                .map(DataPipeline::withAvg)

                .toList();

        Map<String, Long> byMajor = students.stream()
                .collect(Collectors.groupingBy(
                        Student::major,
                        Collectors.counting()
                ));

        List<String> csvLines = new ArrayList<>();
        csvLines.add("id,name,major,math,physics,chemistry,avg");

        for (Student s : students) {
            csvLines.add(
                    s.id() + "," +
                            s.name() + "," +
                            s.major() + "," +
                            s.math() + "," +
                            s.physics() + "," +
                            s.chemistry() + "," +
                            s.avg()
            );
        }

        Files.write(outputCsv, csvLines);

        String json = buildJson(students, byMajor);
        Files.writeString(outputJson, json);

        System.out.println("Done pipeline!");
        System.out.println("Students: " + students.size());
        System.out.println("By major: " + byMajor);
    }

    private static Student parse(String line) {
        try {
            String[] p = line.split(",");

            return new Student(
                    p[0],
                    p[1],
                    p[2],
                    Double.parseDouble(p[3]),
                    Double.parseDouble(p[4]),
                    Double.parseDouble(p[5]),
                    0
            );
        } catch (Exception e) {
            return null;
        }
    }

    private static Student withAvg(Student s) {
        double avg = (s.math() + s.physics() + s.chemistry()) / 3;

        return new Student(
                s.id(),
                s.name(),
                s.major(),
                s.math(),
                s.physics(),
                s.chemistry(),
                avg
        );
    }

    private static String buildJson(List<Student> students, Map<String, Long> byMajor) {

        String studentJson = students.stream()
                .map(s -> """
                        {
                          "id":"%s",
                          "name":"%s",
                          "major":"%s",
                          "avg":%.2f
                        }
                        """.formatted(s.id(), s.name(), s.major(), s.avg()))
                .collect(Collectors.joining(","));

        String majorJson = byMajor.entrySet().stream()
                .map(e -> "\"" + e.getKey() + "\":" + e.getValue())
                .collect(Collectors.joining(","));

        return """
                {
                  "totalStudents": %d,
                  "students": [%s],
                  "byMajor": {%s}
                }
                """.formatted(students.size(), studentJson, majorJson);
    }
}