package day4.bai4;

public class Main {
    static void main() {
        Sach s = new Sach.Builder()
                .tacGia("Jonsua kimmicb")
                .tieuDe("Sach day lam giau")
                .nam(2018)
                .build();

        System.out.println(s);
    }
}
