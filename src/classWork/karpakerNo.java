package classWork;

import java.util.Scanner;

public class karpakerNo {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String square = Integer.toString(n * n);
        for (int i = 1; i < square.length(); i++) {
            int first = Integer.parseInt(square.substring(0, i));
            int second = Integer.parseInt(square.substring(i));
            if ((first + second) == n){
                System.out.println(true);
                break;
            }
        }
        System.out.println(false);

    }

}