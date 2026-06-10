package day6.bai19;

public class Main {
    public static void main(String[] args) {
        MyTrie myTrie = new MyTrie();
        myTrie.insert("Java");
        myTrie.insert("Javascript");
        myTrie.insert("Python");


        System.out.println(myTrie.search("Java"));
        System.out.println(myTrie.startsWith("Ja"));

        System.out.println(myTrie.getAllWords());

        System.out.println(myTrie.delete("Python"));
        System.out.println(myTrie.getAllWords());

    }
}
