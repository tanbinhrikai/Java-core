package day4.bai17;

import java.util.Arrays;

public class MyStack<T> {
    private Object[] elements;
    private int size = 0;
    private int capacity = 2;

    public MyStack() {
        this.elements = new Object[capacity];
    }

    private void ensureCapacity() {
        if (size == capacity) {
            elements = Arrays.copyOf(elements, capacity * 2);
        }
    }

    public void push(T item) {
        ensureCapacity();
        elements[size++] = item;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (size > 0) {
            T last = (T) elements[size - 1];
            size--;
            return last;
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        if (this.size > 0)
            return (T) elements[size - 1];
        return null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
    }

    public int size() {
        return size;
    }


}
