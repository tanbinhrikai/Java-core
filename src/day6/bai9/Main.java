package day6.bai9;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] arg) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.push(1);
        arrayDeque.push(2);
        arrayDeque.push(3);

        System.out.println(arrayDeque.pop());
        System.out.println(arrayDeque.pop());
        System.out.println(arrayDeque.pop());

        arrayDeque.offer(1);
        arrayDeque.offer(2);
        arrayDeque.offer(3);

        System.out.println(arrayDeque.poll());
        System.out.println(arrayDeque.poll());
        System.out.println(arrayDeque.poll());

//        String dauNgoac = "{[()]}";
        String dauNgoac = "{[()]}";
        ArrayDeque<Character> characters = new ArrayDeque<>();
        boolean canBang = true;
        for (int i = 0; i < dauNgoac.length(); i++) {
            if (
                    (dauNgoac.charAt(i) == ')' && characters.pop() != '(')
                            ||
                            (dauNgoac.charAt(i) == ']' && characters.pop() != '[')
                    ||
                            (dauNgoac.charAt(i) == '}' && characters.pop() != '{')
            ) {
                canBang = false;
                break;
            }
            if (dauNgoac.charAt(i) != ')' && dauNgoac.charAt(i) != ']' && dauNgoac.charAt(i) != '}') {
                characters.push(dauNgoac.charAt(i));
            }
        }
        if (canBang) {
            System.out.println(dauNgoac + " Can bang!");
        } else {
            System.out.println(dauNgoac + " Khong can bang!");
        }
    }
}
