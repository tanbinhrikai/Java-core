package bai9;

import java.util.ArrayDeque;

public class Main {
    public static String open = "([{";
    public static String close = "}])";

    public static void main(String[] args) {

        String s1 = "()[]{}";
        String s2 = "([)]";
        String s3 = "(((())))";
        String s4 = "(()";
        String s5 = ")(";

        System.out.println(checkCanBang(s1));
        System.out.println(checkCanBang(s2));
        System.out.println(checkCanBang(s3));
        System.out.println(checkCanBang(s4));
        System.out.println(checkCanBang(s5));
    }
    public static boolean checkCanBang(String input){
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i=0; i<input.length(); i++){
            char c = input.charAt(i);
            if(open.contains(String.valueOf(c))){
                stack.push(c);
                continue;
            }
            if(close.contains(String.valueOf(c))){
                if(stack.isEmpty()) return false;
                Character open = stack.pop();
                boolean isMatch = check(open,c);
                if (!isMatch){
                    return false;
                }

            }

        }
        return stack.isEmpty();
    }

    public static boolean check(char open, char close){
        return (open == '(' && close == ')')
                || (open == '{' && close == '}')
                || (open == '[' && close == ']');
    }

}
