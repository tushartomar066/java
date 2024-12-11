package Core.Topic_11_collectionFramework.list;

import java.util.*;
import java.util.List;

public class learnLinkedList {
    public static void main(String[] args) {
        List<Integer> lst = new LinkedList<>();
        lst.add(1);
        lst.add(7);
        lst.add(8);
        lst.add(9);
        lst.add(5);
        lst.add(10);
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(90);
        arr.add(80);
        arr.add(70);
        lst.addAll(arr);
        System.out.println(lst);
        System.out.println(lst.getFirst());
    }

}
