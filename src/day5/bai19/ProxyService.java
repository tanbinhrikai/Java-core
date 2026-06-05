package day5.bai19;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProxyService implements DichVuSach {
    private DichVuSach realService = new RealService();
    private Map<String, Sach> cache = new HashMap<>();
    private boolean coQuyenTruyCap;

    public ProxyService(boolean coQuyenTruyCap) {
        this.coQuyenTruyCap = coQuyenTruyCap;
    }

    @Override
    public Sach timTheoISBN(String isbn) {
        if(!coQuyenTruyCap) {
            System.out.println("[LOG]: KHong co quyen truy cap");
            return null;
        }

        System.out.println("[LOG] Request: Tim theo isbn " + isbn);
        if (cache.containsKey(isbn)) {
            System.out.println("[CACHE] HIT -> TRa ve ngay lap tuc");
            return cache.get(isbn);
        }
        long start = System.currentTimeMillis();
        Sach sach = realService.timTheoISBN(isbn);
        long end = System.currentTimeMillis();
        System.out.println("[CACHE] Miss -> goi RealService (" + (end - start) + ")");
        cache.put(isbn, sach);
        System.out.println("[LOG] Tra ve: " + sach.getName());
        return sach;
    }

    @Override
    public List<Sach> timTheoTenTacGia(String ta) {
        return List.of();
    }
}
