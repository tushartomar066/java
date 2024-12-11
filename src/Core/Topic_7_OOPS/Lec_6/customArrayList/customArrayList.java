package Core.Topic_7_OOPS.Lec_6.customArrayList;

import java.util.Arrays;

public class customArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;


    // initializing the array with the initil size
    public customArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    // function of adding the element in array
    public void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }


    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    public int remove(){
        int removed = data[--size];
        return removed;
    }
    public int get(int n){
        return data[n];
    }
    public int size(){
        return size;
    }
    public void set(int index , int value){
        data[index] = value;

    }

    @Override
    public String toString() {
        return "customArrayList{data=" + Arrays.toString(data) + ", size=" + size + "}";
    }


    public static void main(String[] args) {
        customArrayList arr = new customArrayList();
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
