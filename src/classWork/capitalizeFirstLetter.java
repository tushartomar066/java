package classWork;

import java.util.Scanner;

public class capitalizeFirstLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        String temp = "";
        for (String ele : arr) {

            if (ele.length() > 0) {
                char check = ele.charAt(0);
                temp += Character.toUpperCase(check);

                if (ele.length() > 1) {
                    temp += (ele.substring(1).toLowerCase());
                }
            }
            temp+=" ";

        }
        System.out.println(temp);
    }
}
