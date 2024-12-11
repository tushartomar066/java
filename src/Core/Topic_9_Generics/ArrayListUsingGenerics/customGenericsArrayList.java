package Core.Topic_9_Generics.ArrayListUsingGenerics;

import java.util.Arrays;

public class customGenericsArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;


    // initializing the array with the initil size
    public customGenericsArrayList() {

        data = new Object[DEFAULT_SIZE];
    }

    // function of adding the element in array
    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }


    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove() {
        T removed = (T)data[--size];
        return removed;
    }

    public T get(int n) {
        //here we do type casting
        return (T)data[n];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;

    }

    @Override
    public String toString() {
        return "customArrayList{data=" + Arrays.toString(data) + ", size=" + size + "}";
    }


    public static void main(String[] args) {
        customGenericsArrayList<Integer> arr = new customGenericsArrayList<>();

        arr.add(5);
        arr.add(6);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(arr.remove());
        System.out.println(arr);
    }
}
