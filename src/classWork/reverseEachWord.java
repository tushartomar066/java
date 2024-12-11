package classWork;

import java.util.Scanner;

public class reverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        String finalAns = "";
        for(String ele:arr){
            String temp = "";
            for(int i = ele.length()-1;i>=0;i--){
                temp+=ele.charAt(i);
            }
            finalAns += temp;
            finalAns += " ";
        }
        System.out.println(finalAns);
    }
}
