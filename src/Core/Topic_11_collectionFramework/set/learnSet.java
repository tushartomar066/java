package Core.Topic_11_collectionFramework.set;

import java.util.ArrayList;
import java.util.HashSet;

public class learnSet {
    public static void main(String[] args) {
        HashSet<Integer> st = new HashSet<>();
        st.add(1);
        st.add(7);
        st.add(8);
        st.add(9);
        st.add(5);
        st.add(10);
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(90);
        arr.add(80);
        arr.add(70);
        st.addAll(arr);
        System.out.println(st);
//        st.retainAll(arr);
        System.out.println(st.contains(arr));
        System.out.println(st.retainAll(arr));

    }
}
