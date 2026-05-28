package day4.bai8;

import java.util.Arrays;

public class MyLinkedList<T> {
    Node<T> head = null;

    public void addFirst(T item) {
        if(head == null) {
            head = new Node<>(item, null);
            return;
        }

        Node<T> temp = head;
        head = new Node<>(item, temp);
    }

    public void addLast(T item) {
        if(head == null) {
            head = new Node<>(item, null);
            return;
        }
        Node<T> temp = head;
        while(temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(new Node<>(item, null));
    }

    public void removeFirst() {
        if(head != null) {
            head = head.getNext();
        }
    }

    public void removeLast() {
        Node<T> temp = head;
        while(temp.getNext() != null) {
            if(temp.getNext() != null && temp.getNext().getNext() == null) {
                break;
            }
            temp = temp.getNext();
        }
        temp.setNext(null);
    }

    public Node get(int index) {
        Node<T> temp = head;
        int i = 0;
        while(temp != null && i <= index) {
            if(i == index) {
                return temp;
            }
            temp = temp.getNext();
            i++;
        }
        return null;
    }

    public int size() {
        if(head == null) return 0;
        Node<T> temp = head;
        int i = 0;
        while(temp != null) {
            temp = temp.getNext();
            i++;
        }
        return i;
    }

    public boolean contains(T item) {
        Node<T> temp = head;
        while(temp != null) {
            if(temp.getData().equals(item)) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    public void print() {
        Node<T> temp = head;
        while(temp != null) {
            System.out.print(temp + " ");
            temp = temp.getNext();
        }
    }

    public void printReverse(Node<T> h) {
        if(h == null)
            return;
        Node<T> temp = h;
        printReverse(temp.getNext());
        System.out.print(temp + " " );
    }

    public Node<T>[] toArray() {
        Node<T>[] arr = new Node[size()];

        Node<T> current = head;
        int index = 0;
        while(current != null) {
            arr[index++] = current;
            current = current.getNext();
        }
        return arr;
    }

}
