package Core.Topic_5_Strings;

import java.util.Scanner;

public class stringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        StringBuilder s = new StringBuilder();
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            }
            else {
                s.append(chars[i - 1]);
                if (count > 1) {
                    s.append(count);
                }
                count =1;
            }
        }
        s.append(chars[chars.length-1]);
        if(count>1) s.append(count);
        for(int i = 0;i<s.length();i++){
            chars[i] = s.charAt(i);
        }
        System.out.println(s.length());

    }
}
