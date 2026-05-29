package bai10;

public enum VaiTro {
    ADMIN("quan tri vien", 4 , true),
    SINHVIEN("sinh vien", 1,false);


    VaiTro(String name, int muc, boolean chinh_sua) {
        this.name = name;
        this.muc = muc;
        this.chinh_sua = chinh_sua;
    }

    private String name;
    private int muc;
    private boolean chinh_sua;


    public static VaiTro getByName(String name){
        for(VaiTro v : VaiTro.values()){
                if(v.name.equalsIgnoreCase(name)){
                    return  v;
                }
        }
        return null;
    }

    public static VaiTro getByMucDo(int mucdo){
        for(VaiTro v: VaiTro.values()){
            if(v.muc == mucdo){
                return  v;
            }
        }
        return  null;
    }
}
