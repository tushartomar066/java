package classWork;

import java.util.Scanner;

public class longestAndShortest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String maxS = "", minS = "";
        int maxV = Integer.MIN_VALUE, minV = Integer.MAX_VALUE;
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {

            String temp = arr[i];
            if(temp.length()>maxV){
                maxV = temp.length();
                maxS = arr[i];
            }
            if(temp.length()<minV){
                minV = temp.length();
                minS = arr[i];
            }
        }
        System.out.println(maxS);
        System.out.println(minS);

    }
}
