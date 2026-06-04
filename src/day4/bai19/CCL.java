package day4.bai19;

public class CCL<T> {
    Node<T> head;
    Node<T> tail;
    int size = 0;

    private class Node<T> {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }
    }

    public void addLast(T item) {
        if(head == null) {
            size = 1;
            head = new Node<>(item);
            tail = head;
        }
        else {
            tail.next = new Node<>(item);
            tail = tail.next;
            tail.next = head;
            size++;
        }
    }

    public void addFirst(T item) {
        if(head == null) {
            size = 1;
            head = new Node<>(item);
            tail = head;
        }
        else {
            Node<T> temp = head;
            head = new Node<>(item);
            head.next = temp;
            size++;
        }
    }


    public void remove(T dt) {
        Node<T> temp = head;
        Node<T> prev = null;
        while(temp != null) {
            prev = temp;
            temp = temp.next;
            if(temp.data.equals(dt)) {
                if(temp.next != null) {
                    prev.next = temp.next;
                    tail = temp.next;
                }
                else {
                    prev.next = null;
                    tail = prev;
                }
                size--;
                break;
            }
        }
    }

    public boolean contains(T dt) {
        Node<T> temp = head;
        while(temp != null) {
            if(temp.data.equals(dt)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void rotate(int k) {
//        for(int i = 0; i < k; i++) {
//            Node<T> temp = head;
//
//            Node<T> prevTail = temp;
//            while(temp != null) {
//                prevTail = temp;
//                if(prevTail.next == tail) {
//                    break;
//                }
//                temp = temp.next;
//            }
//
//            head = tail;
//            tail = prevTail;
//            tail.next = head;
//        }

        k = k % size;

        Node<T> temp = head;
        for(int i = 1; i < k; i++) {
            temp = temp.next;
        }

        head = temp.next;
    }

    public T josephus(int k) {
        Node<T> temp = head;

        while (temp.next != temp) {
            Node<T> current = null;
            for(int i = 1; i < k; i++) {
                current = temp;
                temp = temp.next;
            }
            current.next = temp.next;
            temp = current.next;
        }

        return temp.data;
    }

    public void print() {
        Node<T> temp = head;
        while (temp != null && size > 0) {
            System.out.print(temp.data + " ");
            temp = temp.next;
            size--;
        }
    }
}
