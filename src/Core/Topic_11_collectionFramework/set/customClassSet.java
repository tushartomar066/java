package Core.Topic_11_collectionFramework.set;

import Core.Topic_11_collectionFramework.customClass.students;

import java.util.HashSet;
import java.util.Set;

public class customClassSet {
    public static void main(String[] args) {
        students a = new students("tushar", 23);
        students b = new students("rachit", 98);
        Set<students> st = new HashSet<>();
        st.add(a);
        st.add(b);
        System.out.println(st);

    }
}
