package bai12;

public class Main {
    public static void main(String[] args) {
        Object user = new SinhVien("An", 20);

        double phi = switch (user) {

            case SinhVien sv when sv.tuoi() < 22 -> 50_000;

            case SinhVien sv -> 100_000;

            case NhanVien nv -> 200_000;

            case null -> throw new NullPointerException(
                    "User null"
            );

            default -> 150_000;
        };

        System.out.println(phi);





        // Exhaustive switch

        Nguoi nguoi = new HocSinh("Bao");

        String loai = switch (nguoi) {
            case HocSinh hs -> "Hoc sinh";
            case GiaoVien gv -> "Giao vien";
        };

        System.out.println(loai);


        int diem = 8;

        String xepLoai = switch (diem) {

            case 9, 10 -> "Xuat sac";

            case 7, 8 -> {

                System.out.println(
                        "Dang tinh xep loai..."
                );

                yield "Gioi";
            }

            default -> "Khac";
        };

        System.out.println(xepLoai);


    }


}
