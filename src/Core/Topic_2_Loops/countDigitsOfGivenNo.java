package Core.Topic_2_Loops;

import java.util.Scanner;

public class countDigitsOfGivenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long num = n;
        int count = 0;
        while(num!=0){
            count++;
            num = num/10;
        }
        System.out.println(count);
    }
}
