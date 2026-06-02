package bai6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();

        for(int i = 1 ;i <=50;i++){
            numbers.add(i);
        }

        System.out.println("list sau khi them la"  );
        in(numbers);

        int number =(int) (Math.random() * 50);
        System.out.println("list sau khi xoa ptu " + number );

        remove(number,numbers);
        in(numbers);




    }

    public static void in(List<?> list){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    public static void remove(int number,List<Integer> list){
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            if(iterator.next() == number){
                iterator.remove();
            }
        }
    }

    public void delete(int ptu,List<Integer> list){
        list.removeIf(item ->item.equals(ptu));
    }

    public List<Integer> detach(int ptu,List<Integer> list){
        return  list.stream().filter(item -> item!=ptu)
                .toList();
    }
}
