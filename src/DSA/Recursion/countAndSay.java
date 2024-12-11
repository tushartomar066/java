package DSA.Recursion;

import java.util.Scanner;

public class countAndSay {
    public static String countsay(int n){
        if(n==1) return "1";
       String s = countsay(n-1)+"@";
        int i = 0,j=0;
        String ans = "";
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;
            else{
                int length = j-i;
                ans+=length;
                ans+=s.charAt(i);
                i=j;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String str = countsay(n);
        System.out.println(str);
    }
}
