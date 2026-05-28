package bai1;

public class SinhVien {
    private String  masv ;
    private String hoten;
    private int tuoi;
    private double diemTb;

    static int soluong ;


    public SinhVien() {
        soluong++;
    }

    public  SinhVien(String masv,String hoten,int tuoi, double diemTb){
        this.masv = masv;
        this.hoten = hoten;
        this.setTuoi(tuoi);
        this.diemTb = diemTb;
        soluong++;
    }



    public String getMasv(){
        return  this.masv;
    }

    public void setTuoi(int tuoi){
        if(tuoi>18&& tuoi<30){
            this.tuoi = tuoi;
        }else {
            System.out.println("tuooir khong hop le");
        }
    }

    @Override
    public String toString(){
        String result =   "SinhVien"+"{ma="+this.masv+", ten="+this.hoten+"}";
        return result;
    }

    @Override
    public boolean equals(Object o){
        SinhVien sinhVien = (SinhVien) o;
        return this.masv.equals(sinhVien.masv);
    }

    @Override
    public int hashCode(){
        return masv.hashCode();

    }

}
