package day5.bai19;

public class Sach {
    private String isbn;
    private String name;
    private String tacGia;

    public Sach(String isbn, String name, String tacGia) {
        this.isbn = isbn;
        this.name = name;
        this.tacGia = tacGia;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }
}
