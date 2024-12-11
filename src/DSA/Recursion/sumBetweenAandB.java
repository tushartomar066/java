package DSA.Recursion;

import java.util.Scanner;

public class sumBetweenAandB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sum(a,b ,0));

    }

    private static int sum(int a, int b ,int sum) {
           if(a==b){
               sum+=b;
               return sum;
           }
          return sum(a+1 ,b,sum+a);
    }
}
