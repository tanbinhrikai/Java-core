package bai8;

import java.util.List;

public class MyLinkedList<T> {
    private class  Node{
        T data;
        Node next;
        public Node(T data){
            this.data = data;
        }
    }

    private Node head;

    public void addFirst(T data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

    public void  addLast(T data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }else {
            Node temp = head;
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;

        }
    }

    public void removeFirst(){
        if(head== null){
            return;
        }
        this.head = head.next;

    }

    public void  removeLast(){
        if(head== null){
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = this.head;
        Node tam = null;
        while (temp.next!=null){
            tam = temp;
            temp = temp.next;
        }
        tam.next = null;

    }

    public T getIndex(int index){
        int i = 0;
        Node temp = head;
        while (i<index){
            temp = temp.next;
            i++;
        }
        if(temp==null){
            return null;
        }
        /*return temp.data;*/
    }


}
