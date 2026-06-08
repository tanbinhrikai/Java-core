package bai19;

public class DanhSachXoaVong<T> {


    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public void addFirst(T data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        size++;
    }


    public void addLast(T data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        size++;
    }


    public boolean contains(T data) {
        if (head == null) return false;

        Node cur = head;
        do {
            if (cur.data.equals(data)) return true;
            cur = cur.next;
        } while (cur != head);

        return false;
    }


    public void remove(T data) {
        if (head == null) return;

        Node cur = head;
        Node prev = tail;

        do {
            if (cur.data.equals(data)) {

                if (cur == head) {
                    head = head.next;
                    tail.next = head;
                } else if (cur == tail) {
                    prev.next = head;
                    tail = prev;
                } else {
                    prev.next = cur.next;
                }

                size--;
                return;
            }

            prev = cur;
            cur = cur.next;

        } while (cur != head);
    }


    public void rotate(int k) {
        if (head == null || k == 0) return;

        for (int i = 0; i < k; i++) {
            head = head.next;
            tail = tail.next;
        }
    }


    public T josephus(int k) {
        if (head == null || k <= 0) return null;

        Node cur = head;
        Node prev = tail;

        while (size > 1) {

            for (int i = 1; i < k; i++) {
                prev = cur;
                cur = cur.next;
            }

            System.out.println("Remove: " + cur.data);
            prev.next = cur.next;

            if (cur == head) head = cur.next;
            if (cur == tail) tail = prev;

            cur = cur.next;
            size--;
        }

        head = tail = cur;
        tail.next = head;

        return cur.data;
    }


    public void print() {
        if (head == null) return;

        Node cur = head;
        do {
            System.out.print(cur.data + " ");
            cur = cur.next;
        } while (cur != head);

        System.out.println();
    }

    public static void main(String[] args) {

        DanhSachXoaVong<Integer> cll = new DanhSachXoaVong<>();

        cll.addLast(1);
        cll.addLast(2);
        cll.addLast(3);
        cll.addLast(4);
        cll.addLast(5);

        System.out.print("Original: ");
        cll.print();

        cll.rotate(2);
        System.out.print("After rotate(2): ");
        cll.print();

        DanhSachXoaVong<Integer> cll2 = new DanhSachXoaVong<>();
        cll2.addLast(1);
        cll2.addLast(2);
        cll2.addLast(3);
        cll2.addLast(4);
        cll2.addLast(5);

        System.out.println("\nJosephus result:");
        int last = cll2.josephus(2);

        System.out.println("Survivor: " + last);
    }
}