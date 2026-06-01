package bai17;

import java.util.Objects;

public class Stack <T>{
    private Object[] elements;
    private  int capacity;
   private int size;


    public Stack(int capacity ){
        this.capacity = capacity;
        elements = new Object[capacity];
        this.size = 0;
    }


    public void push(T element){
        if(size == capacity){
            System.out.println("Stack is full");
            Object[] newElements = new Object[capacity*2];
            System.arraycopy(elements, 0, newElements, 0, size);
            this.elements = newElements;
            return;
        }
        elements[size] = element;
        size++;

    }

    public T pop(){
        this.elements[--size] = null;
        return (T)elements[size];
    }

    public T peek(){
        return (T)elements[size];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }
}
