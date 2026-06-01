package bai13;

public class GiaThanhVien implements ChienLuocGia{
    @Override
    public double tinhGia(double giaGoc) {
        return  giaGoc - giaGoc*0.1;
    }
}
