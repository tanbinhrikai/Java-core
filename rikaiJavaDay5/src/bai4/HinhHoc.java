package bai4;

public abstract class HinhHoc {
    public abstract double dientich();
    public abstract double chuvi();
    public abstract String   tenHinh();
    final void moTa(){
        System.out.println("in thông tin hinh học");
    }

    static  HinhHoc lonNhat(HinhHoc[]  hinhHocs){
        HinhHoc max = hinhHocs[0];
        for (HinhHoc hinhHoc : hinhHocs){
            if(            hinhHoc.dientich() > max.dientich()
            ){
                max = hinhHoc;
            }
        }
        return  max;
    }
}
