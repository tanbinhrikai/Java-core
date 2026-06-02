package bai2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<String,Map<String,Double>> mapDiem = new HashMap<>();
    public static void main(String[] args) {
        String[] names = {"le xuan cong","ha thi nhi","nguyen thi thu" , "ha thi thuong" , "vo thi to loan"};
        String[] monhocs = {"toan","ly","hoa","van"};
        int number = 20;
        for(int i = 1;i<=number;i++){
            String tenSv = names[(int) (Math.random() *  names.length)];
            String monhoc = monhocs[(int)(Math.random()*monhocs.length)];
            int diem =(int) (Math.random() * 10) + 1;
            addDiem(tenSv,monhoc, (double) diem);
        }

        System.out.println("sau khi them vao la : ");
        inBangDiemAll();


        String tenSv = names[(int) (Math.random() *  names.length)];
        System.out.println("diem tb mon hoc cua "+ tenSv);
        System.out.println(getDtb(tenSv));

        String monhoc = monhocs[(int)(Math.random()*monhocs.length)];
        System.out.println("sinh vien cao diem nhat cua mon "+ monhoc);
        System.out.println(timSvDiemCaoNhat(monhoc));



    }

    public static void addDiem(String tenSv, String monhoc, Double diem){
//        Map<String,Double> diemMon  = mapDiem.get(tenSv);
//        if(diemMon == null){
//            Map<String, Double> diemMonHoc = new HashMap<>();
//
//            diemMonHoc.put(monhoc, diem);
//
//            mapDiem.put(tenSv, diemMonHoc);
//            return;
//        }
//        diemMon.put(monhoc, diem);


        // nhanh hơn
        mapDiem.computeIfAbsent(tenSv, k -> new HashMap<>())
                .put(monhoc, diem);


    }


    public  static  double getDtb(String tenSv){
        double dtb = 0;
        double sum = 0;
        Map<String,Double> diem = mapDiem.get(tenSv);
        if(diem == null){
            System.out.println("khong tim thay sinh vien ten  "+ tenSv);
            return  0;
        }
        for(Double d : diem.values()){
            sum += d;
        }
        dtb = sum/diem.size();
        return dtb;
    }

    public static String timSvDiemCaoNhat(String monhoc){
        String result = "";
        double max= 0;
        for(Map.Entry<String,Map<String,Double>> entry : mapDiem.entrySet()){
            String tenSv = entry.getKey();
            Map<String,Double> diem = entry.getValue();
            Double diemMon = diem.getOrDefault(monhoc,0.0);
            if(diemMon > max){
                max = diemMon;
                result = tenSv + "\t" + diemMon + "\n";
            }

        }
        if(max==0){
            result = "chua co ai co diem mon nay ca";
        }

        return result;
    }

    public static void  inBangDiemAll(){
        mapDiem.forEach((key, value) ->{
            System.out.println(" \n bang diem cua "+ key );
            for(Map.Entry<String,Double> entry : value.entrySet()){
                String monhoc = entry.getKey();
                Double diem = entry.getValue();
                System.out.printf("mon %s - diem : %f \n", monhoc, diem);
            }
        } );
    }


}
