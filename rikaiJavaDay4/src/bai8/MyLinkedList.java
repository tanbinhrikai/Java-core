package bai8;

public class MyLinkedList<T> {

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head;

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void removeLast() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node<T> temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    public T getIndex(int index) {
        if (index < 0) return null;

        int i = 0;
        Node<T> temp = head;

        while (temp != null && i < index) {
            temp = temp.next;
            i++;
        }

        return (temp != null) ? temp.data : null;
    }
}