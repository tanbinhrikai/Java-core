package bai9;

public class QuanLySinhVien {
    private SinhVien[] sinhviens ;
    private int size ;
    public QuanLySinhVien(int sizeInit){
        this.size = 0;
        this.sinhviens = new SinhVien[sizeInit];
    }


    public void them(SinhVien sinhVien){
        if(this.size == this.sinhviens.length){
            SinhVien[] newArrays = new SinhVien[this.sinhviens.length * 2];
            // coppy qua
            for(int i = 0;i< this.sinhviens.length;i++){
                newArrays[i] = this.sinhviens[i];
            }
            this.sinhviens = newArrays;
            return;
        }
        this.sinhviens[this.size] = sinhVien;
        size++;

    }


    public void xoa(String masv){
        int index  =  this.findMasv(masv);
        if(index < 0){
            System.out.println("khong ton tai sinh vien voi ma sv do , khong the xoa");
            return;
        }
        this.removeBySwapping(index);

        // xoa di doi o

    }


    public void sapXepTheoDiem(){
        for(int i=0;i<size-1;i++){
            for(int j = 0;j<size -1-i;j++){
                if(this.sinhviens[j].getDiem() <sinhviens[j+1].getDiem()){
                    SinhVien temp = sinhviens[j];
                    sinhviens[j] = sinhviens[j+1];
                    sinhviens[j+1] =temp;
                }
            }
        }
    }
    public  int findMasv(String masv){
        for(int i = 0;i< size ; i++){
            if(this.sinhviens[i].getMasv().equals(masv)){
                return  i;
            }
        }
        return  -1;
    }

    public void  xoaDiDoi(int index){
        if(index==this.size-1){
            this.sinhviens[index] = null;
            size--;
            return;
        }
        for(int i=index ; i<this.size-1;i++){
            this.sinhviens[i] = sinhviens[i+1];
        }
        sinhviens[size-1]= null;
        size--;

    }

    public void removeBySwapping(int index){
        int lastIndex = this.size - 1;
        this.hoanDoi(index,lastIndex);
        this.size--;

    }
    public void hoanDoi(int index,int lastIndex){
        sinhviens[index] = sinhviens[lastIndex];
        sinhviens[lastIndex] = null;

    }


    public void inBangDiem(){
        for(int i=0;i<size;i++){
            SinhVien sinhVien = sinhviens[i];
            System.out.println(" "  +  sinhVien.getMasv() + " " + sinhVien.getName() + sinhVien.getDiem() );
        }
    }


    public void thongke(){
        double min = sinhviens[0].getDiem();
        double max = sinhviens[0].getDiem();
        double sum = sinhviens[0].getDiem();
        double avg = 0;

        for(int i=1;i<size;i++){
            double diem = sinhviens[i].getDiem();
            sum+=diem;
            if(diem<min){
                min = diem;
            }
            if(diem>max){
                max = diem;
            }
        }
        avg = sum/size;

    }

}
