package bai12;

public interface KiemTra <T>{
    boolean test(T item);
    default KiemTra<T> and(KiemTra<T> other){
        return (item ) -> test(item) && other.test(item);
    }
    default KiemTra<T> or(KiemTra<T> other){
        return item -> test(item) || other.test(item);
    }

    default KiemTra<T> negate(){
        return (item) -> !test(item);
    }


}
