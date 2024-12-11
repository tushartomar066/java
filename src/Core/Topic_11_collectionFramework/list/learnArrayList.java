package Core.Topic_11_collectionFramework.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class learnArrayList {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        arr.addAll(new ArrayList<>());
        System.out.println(arr);
        System.out.println(arr.get(4));
        System.out.println(arr.get(Integer.valueOf(3)));
        System.out.println(arr.isEmpty());
        Collections.sort(arr);
        System.out.println(  arr.getFirst());
    }


}
