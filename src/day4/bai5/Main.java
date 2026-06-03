package day4.bai5;

public class Main {
    static void main() {
        int[][] points = {{0,0}, {4,0}, {4,3}, {0,3}};

        Polygon polygon = new Polygon(points);

        System.out.printf("Dien tich: %.2f %n", polygon.tinhDienTich());
        System.out.printf("Chu vi: %.2f %n", polygon.tinhChuVi());

        System.out.printf("Loi: %b", polygon.isConvex());

        System.out.println();
        int arr[] = {10, 20, 30, 40, 50};
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%d %d %d %n", arr[i], arr[(i + 1) % arr.length], arr[(i + 2) % arr.length]);
        }
    }
}
