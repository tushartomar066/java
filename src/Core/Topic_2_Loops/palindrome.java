package Core.Topic_2_Loops;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        //variables initialization
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse = 0, rem, temp;

        temp = num;
        //loop to find reverse number
        while (temp != 0) {
            rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp /= 10;
        }


        // palindrome if num and reverse are equal
        if (num == reverse)
            System.out.println(num + " is Palindrome");
        else
            System.out.println(num + " is not Palindrome");
    }
}
