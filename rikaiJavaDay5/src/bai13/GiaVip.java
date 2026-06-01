package bai13;

public class GiaVip implements ChienLuocGia{
    @Override
    public double tinhGia(double giaGoc) {
        return giaGoc*0.8 -50000;
    }
}
