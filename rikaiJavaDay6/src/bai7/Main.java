package bai7;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<BenhNhan> queue = new LinkedList<BenhNhan>();
        PriorityQueue<BenhNhan> priorityQueue = new PriorityQueue<>();
        String[] names = {"le xuan a" , "le xuan b", "le xuan c" , "le xuan d","le xuan f"};
        for(int i = 0;i<=4;i++){
            int mucDo = (int) (Math.random()*4 + 1);
            BenhNhan benhNhan = new BenhNhan(names[i], mucDo);
            queue.add(benhNhan);
            priorityQueue.add(benhNhan);
        }
        System.out.println("benh nhanh trong hang do");

        for(BenhNhan benhNhan : queue){
            System.out.println(benhNhan.toString());
        }
        themBenhNhanMoi(priorityQueue);

        System.out.println("benh nhanh trong hang doi uu tien");
        while (!priorityQueue.isEmpty()){
            BenhNhan benhNhan = priorityQueue.poll();
            System.out.println(benhNhan.toString());
        }

    }

    public static void themBenhNhanMoi(PriorityQueue<BenhNhan> priorityQueue){
        priorityQueue.offer(new BenhNhan("le xuan a" , 1));
    }

}
