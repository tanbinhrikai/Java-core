package bai17;

public class Stack<T> {

    private Object[] elements;
    private int size;

    public Stack(int capacity) {
        this.elements = new Object[capacity];
        this.size = 0;
    }

    public void push(T item) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = item;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        T value = (T) elements[--size];
        elements[size] = null;
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        return (T) elements[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void resize() {
        Object[] newArr = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newArr, 0, size);
        elements = newArr;
    }
}