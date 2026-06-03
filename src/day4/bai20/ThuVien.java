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
        Sach searched = null;
        for(int i = 0; i < quanLySach.size(); i++) {
            if(isbn.equalsIgnoreCase(quanLySach.get(i).getIsbn())) {
                searched = quanLySach.get(i);
                break;
            }
        }
        if(searched != null) {
            if(searched.getSoLuong() > 0) {
//                quanLyDocGia.add(new DocGia(maDocGia));
                searched.setSoLuong(searched.getSoLuong() - 1);
                searched.setDaChoMuon(searched.getDaChoMuon() + 1);
                System.out.println("OK. Con " + searched.getSoLuong() + " quyen");
            }
            else {
                System.out.println("Het sach roi em");
            }
        }
    }

    public void traSach(String maDocGia,  String isbn) {

    }

    public void timSach(String keyword) {

    }

    public void inDanhSach() {

    }

}
