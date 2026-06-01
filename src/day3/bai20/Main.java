package day3.bai20;

import java.util.Arrays;

public class Main {

    static int size = 0;
    static String[] names = new String[size];
    static double[] scores = new double[size];

    static void themSinhVien(String ten, double score) {
        size++;
        names = Arrays.copyOf(names, size);
        scores = Arrays.copyOf(scores, size);

        names[size - 1] = ten;
        scores[size - 1] = score;
    }

    static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void swap(double[] arr, int i, int j) {
        double a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }
    static void xepHang() {
        for(int i = 0; i < size; i++) {
            for(int j = i+1; j < size; j++) {
                if(scores[i] < scores[j]) {
                    swap(names, i, j);
                    swap(scores, i, j);
                }
            }
        }
    }

    static int timKiem(String ten) {
        for(int i = 0; i < size; i++) {
            if(ten.equalsIgnoreCase(names[i])) {
                return i;
            }
        }
        return -1;
    }

    static void thongKe() {
        double min = scores[0];
        double max = scores[0];
        double sum = 0;
        int countXuatXac = 0;
        int countGioi = 0;
        int countKha = 0;
        for(int i = 0; i < size; i++) {
            if(getXepLoai(scores[i]).equalsIgnoreCase("Xuat xac"))
                countXuatXac++;
            if(getXepLoai(scores[i]).equalsIgnoreCase("GIoi"))
                countGioi++;
            if(getXepLoai(scores[i]).equalsIgnoreCase("Kha"))
                countKha++;
            if(scores[i] > max) max = scores[i];
            if(scores[i] < min) min =scores[i];
            sum += scores[i];
        }

        System.out.printf("max = %.2f | min = %.2f | xuat xac= %d | gioi = %d | kha = %d", max, min, countXuatXac, countGioi, countKha);

    }

    static String getXepLoai(double score) {
        if(score >= 9) return "XUat xac";
        else if(score >= 8.5) return "Gioi";
        else if(score >= 6.5)
            return "Kha";
        else if(score >= 5) return "TRung binh";
        else return "Yeu";
    }

    static void inDanhSach() {
        System.out.println("===BANG DIEM===");
        System.out.printf("STT\tTen\t\tDiem\t\tXep loai %n");
        for(int i = 0; i < size; i++) {
            System.out.printf("%d\t%s\t\t%.2f\t\t%s %n",
                    i + 1,
                    names[i],
                    scores[i],
                    getXepLoai(scores[i])
                    );
        }
    }

    static void main() {
        themSinhVien("An", 8.7);
        themSinhVien("Chi", 9.2);
        themSinhVien("HUy", 9.5);
        themSinhVien("Bao", 7.5);

        int i = timKiem("CHi");
        System.out.println(names[i] + " " + scores[i]);
        xepHang();
        inDanhSach();

        thongKe();
    }
}
