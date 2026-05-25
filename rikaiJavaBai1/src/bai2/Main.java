package bai2;

public class Main {
    public void  main(){
        byte byteValue =100;
        short shortValue = 200;
        int intValue = 6000;
        long longValue = 100000;
        float floatValue = 3.1444477f;
        double doubleValue  = 3.568298483823884;
        char charValue = 'a';
        boolean booleanValue = true;

        System.out.printf("byte: %d | min=%d | max=%d",byteValue,Byte.MIN_VALUE,Byte.MAX_VALUE);
        System.out.printf("short: %d | min=%d | max=%d",shortValue,Short.MIN_VALUE,Short.MAX_VALUE);
        System.out.printf("int: %d | min=%d | max=%d",intValue,Integer.MIN_VALUE,Integer.MAX_VALUE);
        System.out.printf("long: %d | min=%d | max=%d",longValue,Long.MIN_VALUE,Long.MAX_VALUE);
        System.out.printf("float: %f | min=%f | max=%f",floatValue,Float.MIN_VALUE,Float.MAX_VALUE);
        System.out.printf("double: %f | min=%f | max=%f",doubleValue,Double.MIN_VALUE,Double.MAX_VALUE);
        System.out.printf("char: %c | min=%c | max=%c",charValue,Character.MIN_VALUE,Character.MAX_VALUE);
        System.out.printf("boolean: %b " ,booleanValue);
    }
}
