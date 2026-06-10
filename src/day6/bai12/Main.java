package day6.bai12;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,1,4,1,5,9,2,6);

        // dung cho Collection Framework
        Collections.sort(list);
        System.out.println(list);

        // Arrays.sort mảng tĩnh (Array cố định), ví dụ: int[], String[]

        System.out.println(Collections.binarySearch(list, 5)); // mang da sap xep tra ve index
        System.out.println(Collections.frequency(list, 1));
        System.out.println(Collections.nCopies(3, "java")); // tra ve 1 list voi cac phan tu giong nhau

        // UnsupportedOperationException khi add
        try {
            List<Integer> listUnmodified = Collections.unmodifiableList(list);
            listUnmodified.add(5);
        } catch (UnsupportedOperationException e) {
            System.out.println(e);
        }

        List<Integer> safeList = Collections.synchronizedList(Arrays.asList(1,2,3,45));

    }
}
