package bai1;

public abstract class NhanVien {
    private String name;
    private int luongCoBan;
    private  String phongBan;

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NhanVien(String name, int luongCoBan, String phongBan) {
        this.name = name;
        this.luongCoBan = luongCoBan;
        this.phongBan = phongBan;
    }

    public abstract int tinhLuong();
}
