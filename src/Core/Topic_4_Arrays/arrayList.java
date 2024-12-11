package Core.Topic_4_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            int element = sc.nextInt();
            arr.add(element);

        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr.get(i) + " ");
        }
       
    }

}
