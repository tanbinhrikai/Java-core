package bai11;

import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public <T extends  Number> double tinhTong(List<T> list){
        int sum = 0;
        for (Number num : list) {
            sum += num.intValue();
        }
        return sum;
    }

    public void inDanhSach(List<?> list){
        for (Object obj : list) {
            System.out.println(obj.toString());
        }
    }

    public <T extends Comparable<T>> T timMax(List<T> list){
        if(list.isEmpty()){
            return null;
        }
        T max = list.get(0);
        for (T item : list) {
            if(item.compareTo(max) > 0){
                max = item;
            }
        }
        return max;
    }


    public void copy(List<? super  Integer> dest ,List<? extends Integer> src){
        for(Integer i : src){
            dest.add(i);
        }
    }
}
