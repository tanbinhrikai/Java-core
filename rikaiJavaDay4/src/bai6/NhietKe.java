package bai6;

public class NhietKe implements  Comparable {
    private double nhietDo;
    private final double MIN = 0;
    private final double MAX = 30;
    private static   int soLanCanhBao = 0;


    public void setNhietDo(int nhietDo){
        if(nhietDo< MIN || nhietDo > MAX){
            System.out.println("nhiệt độ đang ở múc cảnh bao");
            soLanCanhBao++;
            return;
        }
        this.nhietDo = nhietDo;

    }
    public NhietKe(double nhietDo){
        this.nhietDo = nhietDo;
    }

    public NhietKe chuyendoidonvi(String donvi){
        if(donvi.equals("F")){
            double result  = 9.0/5*this.nhietDo + 32;
            System.out.println("sang do f : " + result);
            return new NhietKe(result);
        }else{
            double result  = 273.15 + this.nhietDo;
            System.out.println("sang do k : "+ result);
            return new NhietKe(result);
        }

    }


    @Override
    public int compareTo(Object o) {
        NhietKe nhietKe = (NhietKe) o;
        if(this.nhietDo > nhietKe.nhietDo){
            return  1;
        }else if (this.nhietDo < nhietKe.nhietDo){
            return  - 1;
        }else {
            return  0;
        }
    }
}
