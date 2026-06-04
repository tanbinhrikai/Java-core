package day4.bai20;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ThuVien {
    private List<Sach> quanLySach;
    private List<DocGia> quanLyDocGia;
    private List<PhieuMuon> phieuMuons;

    public ThuVien() {
        this.quanLySach = new ArrayList<>();
        this.quanLyDocGia = new ArrayList<>();
        this.phieuMuons = new ArrayList<>();
    }

    private class PhieuMuon {
        DocGia docGia;
        Sach sach;
        Date ngayMuon;

        public PhieuMuon(DocGia docGia, Sach sach, Date ngayMuon) {
            this.docGia = docGia;
            this.sach = sach;
            this.ngayMuon = ngayMuon;
        }
    }

    public void themSach(Sach sach) {
        quanLySach.add(sach);
    }

    public void themDocGia(DocGia docGia) {
        quanLyDocGia.add(docGia);
    }

    public void muonSach(String maDocGia, String isbn) {
        // Kiem tra neu con sach thi cho muon
        Sach searched = this.timSach(isbn);

        if (searched != null) {
            if (searched.getSoLuong() > 0) {
//                quanLyDocGia.add(new DocGia(maDocGia));
                searched.setSoLuong(searched.getSoLuong() - 1);
                searched.setDaChoMuon(searched.getDaChoMuon() + 1);
                System.out.println("OK. Con " + searched.getSoLuong() + " quyen");
            } else {
                System.out.println("Het sach roi em");
            }
        }
    }

    public void traSach(String maDocGia, String isbn) {
        Sach searched = timSach(isbn);

        if(searched != null) {
            searched.setSoLuong(searched.getSoLuong() + 1);
            System.out.println("Tra sach Ok. Con " + searched.getSoLuong() + " quyen");
        }
    }

    public Sach timSach(String keyword) {
        for(int  i =0; i < quanLySach.size(); i++) {
            String isbn = quanLySach.get(i).getIsbn();
            String tieuDe = quanLySach.get(i).getTieuDe();
            if(keyword.equalsIgnoreCase(isbn) || tieuDe.contains(keyword)) {
                return quanLySach.get(i);
            }
        }
        return null;
    }

    public void inDanhSach() {
        for(Sach s : quanLySach) {
            System.out.println(s);
        }

        for(DocGia d : quanLyDocGia) {
            System.out.println(d);
        }
    }

}
