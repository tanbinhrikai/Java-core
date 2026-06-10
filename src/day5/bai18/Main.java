package day5.bai18;

public class Main {
    public static void main(String[] args) {
        EspressoThuong espressoThuong = new EspressoThuong();
        System.out.println("EspressoThuong: " + espressoThuong.gia());


        ThemSua sua = new ThemSua(espressoThuong);
        System.out.println(sua.moTa() + " " + sua.gia());

        Da da = new Da(new Duong(new ThemSua(espressoThuong)));
        System.out.println(da.moTa() + " " + da.gia());

            CaPheChay caPheChay = new CaPheChay();
        System.out.println(new Da(new Duong(caPheChay)).moTa() + " " + new Da(new Duong(caPheChay)).gia());

    }
}
