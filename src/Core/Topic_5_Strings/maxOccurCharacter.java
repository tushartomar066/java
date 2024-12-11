package Core.Topic_5_Strings;

import java.util.Scanner;

public class maxOccurCharacter {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int x = str.charAt(i);
            x = x - 97;
            arr[x]++;
        }
        int max = -1234;
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idx = i;
            }
        }
        char ele = (char) (idx + 97);
        System.out.println(ele);
    }
}
