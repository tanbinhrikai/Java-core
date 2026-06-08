package bai15;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,5,8,45,87);
        double average= numbers.stream()
                .collect(
                        Collectors.teeing(
                                Collectors.summingDouble(value -> value),
                                Collectors.counting(),
                                (sum,count)-> sum/count
                        )
                );
        System.out.println("average is "+average);


        Range minMax = numbers.stream()
                .collect(
                        Collectors.teeing(
                                Collectors.minBy(
                                        Comparator.comparingInt(value -> value)
                                ),
                                Collectors.maxBy(
                                        Comparator.comparingInt(value -> value)
                                ),
                                (min,max)-> new Range(min.get(),max.get())

                        )
                );

        System.out.println("min max is "+minMax);


        // chia thanh hai nhom

        Statistical statistical = numbers.stream()
                .collect(
                        Collectors.teeing(
                                Collectors.partitioningBy(integer -> integer > 10),
                                Collectors.counting(),
                                Statistical::new
                        )

                );
        System.out.println("statistic is "+statistical);




    }

}
