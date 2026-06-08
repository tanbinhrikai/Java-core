package bai11;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(calculateSum(List.of(1, 2, 3)));
        System.out.println(calculateSum(List.of(1.5, 2.5)));

        System.out.println(
                findMax(List.of("apple", "mango", "banana"))
        );

        List<Integer> sourceNumbers = List.of(1, 2, 3);
        List<Number> destinationNumbers = new ArrayList<>();

        copy(destinationNumbers, sourceNumbers);

        printList(destinationNumbers);
    }

    public static <T extends Number> double calculateSum(List<T> numbers) {
        double total = 0;

        for (T number : numbers) {
            total += number.doubleValue();
        }

        return total;
    }

    public static void printList(List<?> items) {
        for (Object item : items) {
            System.out.println(item);
        }
    }

    public static <T extends Comparable<T>> T findMax(List<T> items) {

        if (items.isEmpty()) {
            return null;
        }

        T maxValue = items.get(0);

        for (T item : items) {
            if (item.compareTo(maxValue) > 0) {
                maxValue = item;
            }
        }

        return maxValue;
    }

    public static void copy(
            List<? super Integer> destination,
            List<? extends Integer> source
    ) {
        for (Integer value : source) {
            destination.add(value);
        }
    }
}