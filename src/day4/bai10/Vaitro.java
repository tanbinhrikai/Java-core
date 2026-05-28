package day4.bai10;

public enum Vaitro {
    ADMIN("Quản trị", 4), GIAO_VIEN("Giáo viên", 3),
    SINH_VIEN("Sinh viên", 2), KHACH("Khách", 1);

    private final String ten;
    private final int mucDoTruyCap;
    Vaitro(String s, int i) {
        this.ten = s;
        this.mucDoTruyCap = i;
    }

    public String tenHienThi() {
        return ten;
    }

    public int getMucDoTruyCap() {
        return mucDoTruyCap;
    }

    public boolean coQuyenChinhSua() {
        return mucDoTruyCap >= 3;
    }

    public Vaitro getByTen(String ten) {
        for(Vaitro v : values()) {
            if(v.ten.equalsIgnoreCase(ten)) {
                return v;
            }
        }
        return null;
    }

    public Vaitro getByMucDo(int mc) {
        for(Vaitro v : values()) {
            if(v.mucDoTruyCap == mc) {
                return v;
            }
        }
        return null;
    }
}
