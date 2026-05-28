package day4.bai6;

public class NhietKe implements Comparable<NhietKe> {
    private double nhietDo;
    private final double MIN = 36;
    private final double MAX = 37;

    private static int soLanCanhBao = 0;

    public NhietKe(double nhietDo) {
        this.nhietDo = nhietDo;
    }

    public NhietKe() {

    }


    public void setNhietDo(double nhietDo) {
        if(nhietDo >= MIN && nhietDo <= MAX) {
            this.nhietDo = nhietDo;
            System.out.printf("nhietDo = %.2f°C (binh thuong)%n", this.nhietDo);
        }
        else {
            this.nhietDo = nhietDo;
            System.out.printf("nhietDo = %.2f°C -> Canh bao: Cao hon nguong an toan!%n", this.nhietDo);
            soLanCanhBao++;
        }
    }

    public NhietKe chuyenDoiDonVi() {
        return new NhietKe(this.nhietDo * 1.8 + 32);
    }

    public static int getSoLanCanhBao() {
        return soLanCanhBao;
    }

    public double getNhietDo() {
        return nhietDo;
    }

    @Override
    public int compareTo(NhietKe o) {
        return 0;
    }
}
