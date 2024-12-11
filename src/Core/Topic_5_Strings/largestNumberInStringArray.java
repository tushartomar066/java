package Core.Topic_5_Strings;

import java.util.Scanner;

public class largestNumberInStringArray {
    public static void main(String[] args) {
        String[] str = new String[5];
        Scanner sc = new Scanner(System.in);

        //taking input

        for (int i = 0; i < 5; i++) {
            str[i] = sc.nextLine();
        }

        //declare the maxString and initialized with first element of array

        String maxString = str[0];
        for (int i = 1; i < str.length; i++) {
            maxString = maxOf(maxString, str[i]);
        }
        System.out.println(maxString);
    }

    // function jo max string return krega

    public static String maxOf(String a, String b) {
        String temp1 = purifier(a);
        String temp2 = purifier(b);
        if (temp1.length() > temp2.length()) return temp1;
        if (temp1.length() < temp2.length()) return temp2;
        for (int i = 0 ; i< temp1.length() ; i++){
            if(temp1.charAt(i)!=temp2.charAt(i)){
                if(temp1.charAt(i)>temp2.charAt(i)) return a;
                else return b;
            }

        }
        return temp1;
    }

    // function which will remove the preceding zeros

    public static String purifier(String s){
        for (int i = 0 ; i<s.length() ; i++){
            if(s.charAt(i)!='0') return s.substring(i);
        }
        return s;
    }

}
