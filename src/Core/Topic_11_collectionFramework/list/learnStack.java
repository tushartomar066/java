package Core.Topic_11_collectionFramework.list;

import java.util.*;

public class learnStack {
    public static void main(String[] args) {

        /* all operation take O(1) t.c escept the search which take the O(n)*/
        Stack<Integer> st = new Stack<>();
        st.push(34);
        st.push(35);
        st.push(65);
        st.push(65);
        st.push(65);
        st.push(65);
        st.push(65);
        st.push(65);
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.contains(34));
        System.out.println(st.search(34));
        System.out.println(st.set(3,56));
        System.out.println(st);
        System.out.println(st.getFirst());

    }
}
