package Core.Topic_5_Strings;

import java.util.Scanner;

public class updateOddsPositions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine());
        for (int i = 0 ;i<s.length() ;i++){
            if(i%2!=0){
                s.setCharAt(i,'#');
            }
        }
        System.out.println(s.length());
        System.out.println(s);
    }
}
