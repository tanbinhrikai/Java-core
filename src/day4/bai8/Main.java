package day4.bai8;

public class Main {
    static void main() {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();

        linkedList.addFirst(1);
        linkedList.addFirst(2);

        linkedList.addLast(10);
        linkedList.addLast(5);

        linkedList.print();
        System.out.println("");

        linkedList.removeFirst();

        linkedList.print();
        System.out.println("");

        linkedList.removeLast();
        linkedList.print();
        System.out.println("");

        System.out.println(linkedList.get(1));

        System.out.println(linkedList.contains(1));

        linkedList.printReverse(linkedList.get(0));

        System.out.println("");
        Node<Integer> nodes[] = linkedList.toArray();
        for(int i = 0; i < nodes.length; i++) {
            System.out.println(nodes[i].getData());
        }

    }
}
