package bai15;

import java.nio.file.attribute.UserPrincipal;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static Map<String,Map<Integer, List<String>>> lichHoc = new HashMap<String, Map<Integer, List<String>>>();
    public static void main(String[] args) {

        addMon("Tuan1", 2, "Toan");
        addMon("Tuan1", 2, "Ly");
        addMon("Tuan1", 3, "Hoa");
        addMon("Tuan1", 3, "Toan");
        addMon("Tuan1", 5, "Anh");

        addMon("Tuan2", 2, "Van");
        addMon("Tuan2", 4, "Toan");
        addMon("Tuan2", 4, "Ly");

        System.out.println("Mon hoc Tuan1 - ngay 2: " + getMonHoc("Tuan1", 2));
        System.out.println("Mon hoc Tuan2 - ngay 4: " + getMonHoc("Tuan2", 4));

        System.out.println("So mon Toan trong Tuan1: " + countMonInWeek("Tuan1", "Toan"));

        printTimeAble();
    }

    public static void addMon(String tuan,int ngay , String monhoc){
        lichHoc.computeIfAbsent(tuan,key->new HashMap<>())
                .computeIfAbsent(ngay,key->new ArrayList<>())
                .add(monhoc);
    }

    public static List<String> getMonHoc(String tuan,int ngay){
        return lichHoc.getOrDefault(tuan,new HashMap<>()).getOrDefault(ngay,new ArrayList<>());
    }

    public static int countMonInWeek(String tuan,String mon){
        int count = 0;
       Set<Map.Entry<Integer, List<String>>> entrySet= lichHoc.getOrDefault(tuan,new HashMap<>()).entrySet();

       for (Map.Entry<Integer,List<String>> entry:entrySet){
           List<String> monHocs = entry.getValue();
           for (String monhoc:monHocs){
               if(monhoc.equals(mon)){
                   count++;
               }
           }
       }
       return count;
    }

    public static void printTimeAble(){
        Set<Map.Entry<String, Map<Integer, List<String>>>> entrySetByWeek = lichHoc.entrySet();
        for (Map.Entry<String, Map<Integer, List<String>>> entry:entrySetByWeek){
            System.out.println("lich hoc cua " + entry.getKey());
            for (Map.Entry<Integer, List<String>> entry2:entry.getValue().entrySet()){
                System.out.println("thu "+ entry2.getKey()+":");
                String dsMonHoc = entry2.getValue().stream()
                        .collect(Collectors.joining(","));
                System.out.printf(dsMonHoc);
                System.out.println("");

            }
        }
    }
}
