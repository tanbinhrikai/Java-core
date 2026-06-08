package bai18;

import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {

        long start1 = System.currentTimeMillis();

        long sum1 = LongStream.rangeClosed(1, 100_000_000)
                .sum();

        long end1 = System.currentTimeMillis();

        System.out.println("Sequential sum = " + sum1);
        System.out.println("Time = " + (end1 - start1) + " ms");

        long start2 = System.currentTimeMillis();

        long sum2 = LongStream.rangeClosed(1, 100_000_000)
                .parallel()
                .sum();

        long end2 = System.currentTimeMillis();

        System.out.println("Parallel sum = " + sum2);
        System.out.println("Time = " + (end2 - start2) + " ms");
    }
}
