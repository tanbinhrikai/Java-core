package bai17;

public class Main {
    public static void main(String[] args) {

        Multimap<String, Integer> mm = new Multimap<>();

        mm.put("A", 1);
        mm.put("A", 2);
        mm.put("B", 3);
        mm.put("C", 4);
        mm.put("C", 5);

        System.out.println("A: " + mm.get("A"));
        System.out.println("B: " + mm.get("B"));
        System.out.println("C: " + mm.get("C"));

        mm.removeValue("A", 1);
        System.out.println("A after remove 1: " + mm.get("A"));

        System.out.println("Keys: " + mm.getKeys());

        System.out.println("Values: " + mm.getValues());
    }
}