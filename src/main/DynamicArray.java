package main;

import java.util.Arrays;

public class DynamicArray<E> implements DynamicStruct<E> {

    private int size;
    private Object[] data;

    public DynamicArray() {
        this(10);
    }

    public DynamicArray(int initialCapacity) {
        data = new Object[initialCapacity];
        size = 0;
    }

    public void add(E value) {
        if (size >= data.length) {
            data = grow(data);
        }
        data[size++] = value;
    }

    public E get(int index) {
        return (E) data[index];
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= data.length)
            throw new IndexOutOfBoundsException();
        size--;
        E value = (E) data[index];
        System.arraycopy(data, index + 1, data, index, size);
        return value;
    }

    private Object[] grow(Object[] originalArray) {
        return Arrays.copyOf(originalArray, originalArray.length * 2);
    }

    @Override
    public String toString() {
        return "{" + Arrays.toString(data) + '}';
    }
}
