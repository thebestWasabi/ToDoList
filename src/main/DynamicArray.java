package main;

import java.util.Arrays;

public class DynamicArray {

    private int size;
    private String[] data;

    public DynamicArray() {
        this(10);
    }

    public DynamicArray(int initialCapacity) {
        data = new String[initialCapacity];
        size = 0;
    }

    public void add(String value) {
        if (size >= data.length) {
            data = grow(data);
        }
        data[size++] = value;
    }

    private String[] grow(String[] originalArray) {
        return Arrays.copyOf(originalArray, originalArray.length * 2);
    }

    @Override
    public String toString() {
        return "{" + Arrays.toString(data) + '}';
    }
}
