package bai12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] numbersArray = {
                7, 2, 9, 1, 5,
                10, 3, 8, 6, 4
        };

        List<Integer> numbersList = new ArrayList<>(
                List.of(
                        7, 2, 9, 1, 5,
                        10, 3, 8, 6, 4
                )
        );

        Collections.sort(numbersList);

        System.out.println(numbersList);

        Arrays.sort(numbersArray);

        System.out.println(Arrays.toString(numbersArray));

        int index = Collections.binarySearch(
                numbersList,
                7
        );

        System.out.println(index);



        int frequency = Collections.frequency(
                numbersList,
                7
        );


        List<Integer> copiedList =
                Collections.nCopies(5, 7);

        System.out.println(copiedList);

        List<Integer> readOnlyList =
                Collections.unmodifiableList(
                        numbersList
                );

        System.out.println(readOnlyList);

        List<Integer> synchronizedList =
                Collections.synchronizedList(
                        new ArrayList<>(numbersList)
                );

        System.out.println(synchronizedList);

        try {
            readOnlyList.add(100);
        } catch (UnsupportedOperationException e) {
            System.out.println(
                    "can not add"
            );
        }
    }
}