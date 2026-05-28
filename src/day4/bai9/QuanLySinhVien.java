package day4.bai9;

import java.util.Arrays;

public class QuanLySinhVien {
    private SinhVien students[];
    private int size;

    public QuanLySinhVien() {
        this.size = 0;
        this.students = new SinhVien[size];
    }

    public void them(SinhVien sv) {
        size++;
        students = Arrays.copyOf(students, size + 1);
        students[size - 1] = sv;
    }

    public void xoa(SinhVien sv) {
        int idx = -1;
        for (int i = 0; i < size; i++) {
            if (sv.getMaSV().equals(students[i].getMaSV())) {
                idx = i;
                break;
            }
        }

        if (idx != -1) {
            for (int i = idx; i < size - 1; i++) {
                students[i] = students[i + 1];
            }

            students[size - 1] = null;
            size--;

            students = Arrays.copyOf(students, size);
        }

//        if(idx != -1) {
//            SinhVien[] newList = new SinhVien[size - 1];
//            int j = 0;
//            for(int i = 0; i < size; i++) {
//                if(i != idx) {
//                    newList[j] = students[i];
//                    j++;
//                }
//            }
//            students = newList;
//            size--;
//        }
    }

    public SinhVien tim(String maSV) {
        for (int i = 0; i < size; i++) {
            if (maSV.equals(students[i].getMaSV())) {
                return students[i];
            }
        }
        return null;
    }

    public void sapXepTheoDiem() {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (students[i].getScore() > students[j].getScore()) {
                    swap(i, j);
                } else if (Math.abs(students[i].getScore() - students[j].getScore()) < 0.00001) {
                    String names1[] = students[i].getHoTen().split("\\+s");
                    String names2[] = students[j].getHoTen().split("\\+s");

                    String name1 = names1[names1.length - 1];
                    String name2 = names2[names2.length - 1];

                    if (name1.charAt(0) > name2.charAt(0)) {
                        swap(i, j);
                    }

                }
            }
        }
    }

    private void swap(int i, int j) {
        SinhVien temp = students[i];
        students[i] = students[j];
        students[j] = temp;
    }

    public void inBangDiem() {
        System.out.println("=== BANG DIEM SINH VIEN ===");
        System.out.print("STT\t\tMa SV\t\tHo ten\t\tDiem\t\tXepLoai \n");
        for (int i = 0; i < size; i++) {
            System.out.printf("%s\t\t%s", i + 1, students[i]);
        }
    }

    public void thongKe() {
        double maxScore = 0;
        double minScore = students[0].getScore();
        double sum = 0;

        int xuatXac = 0;
        int gioi = 0;
        int kha = 0;
        int trungBinh = 0;
        int yeu = 0;
        for(int i = 0; i < size; i++) {
            double score = students[i].getScore();
            if(score > maxScore) {
                maxScore = score;
            }

            if(score < minScore) {
                minScore = score;
            }

            if(score >= 9) xuatXac++;
            else if(score >= 8) gioi++;
            else if(score >= 6.5) kha++;
            else if(score >= 5) trungBinh++;
            else yeu++;

            sum += students[i].getScore();
        }
        System.out.println("THONG KE");
        System.out.printf("MIN SCORE = %.2f | MAX SCORE = %.2f | TRUNG BINH = %.2f %n", minScore, maxScore, sum / (double) size);
        inCotHistogram("Xuat sac", xuatXac);
        inCotHistogram("Gioi", gioi);
        inCotHistogram("Kha", kha);
        inCotHistogram("Trung binh", trungBinh);
        inCotHistogram("Yeu", yeu);
    }

    public void inCotHistogram(String nhan, int soLuong) {
        System.out.printf("%s (%d): ", nhan, soLuong);
        for(int i = 0; i < soLuong; i++) {
            System.out.print("■");
        }
        System.out.println("");
    }

}
