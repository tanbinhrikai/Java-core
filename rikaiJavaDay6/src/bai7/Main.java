package bai7;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        PriorityQueue<Patient> patientQueue =
                new PriorityQueue<>();

        patientQueue.offer(new Patient("An", 5));
        patientQueue.offer(new Patient("Bao", 3));
        patientQueue.offer(new Patient("Chi", 1));
        patientQueue.offer(new Patient("Dao", 4));
        patientQueue.offer(new Patient("Em", 2));


        System.out.println(patientQueue.poll());
        System.out.println(patientQueue.poll());


        patientQueue.offer(
                new Patient("F", 1)
        );


        while (!patientQueue.isEmpty()) {
            System.out.println(patientQueue.poll());
        }
    }
}