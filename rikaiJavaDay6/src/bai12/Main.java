package bai12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 1, 5, 10, 3, 8, 6, 4};

        List<Integer> list = new ArrayList<>(
                List.of(7, 2, 9, 1, 5, 10, 3, 8, 6, 4)
        );

        Collections.sort(list);
        System.out.println("collection sau khi sort");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        Arrays.sort(arr);
        System.out.println("array sau khi sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        int index = Collections.binarySearch(list, 7);
        System.out.println("index cua ptu 7 " + index);

        int count  = Collections.frequency(list, 7);
        System.out.println("count cu ptu 7 " + count);

        List<Integer> listNcopies  = Collections.nCopies(list.size(), 7);
        System.out.println("list nCopies");
        for (int i = 0; i < listNcopies.size(); i++) {
            System.out.println(listNcopies.get(i));
        }

        List<Integer> listReadOnly = Collections.unmodifiableList(list);

        List<Integer> listThreadSafe = Collections.synchronizedList(list);



    }

}
