package Core.Topic_5_Strings;


import java.util.Scanner;


public class toggleCharacter {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringBuilder str = new StringBuilder(sc.nextLine());

        for (int i = 0; i < str.length(); i++) {

            int ascii = (int) str.charAt(i);

            if (ascii >= 65 && ascii <= 90) {


                int temp = str.charAt(i) + 32;

                char ch = (char) temp;

                str.setCharAt(i, ch);


            } else if (ascii >= 97 && ascii <= 122) {

                int temp = str.charAt(i) - 32;

                char ch = (char) temp;

                str.setCharAt(i, ch);

            }


        }
        System.out.println(str);

    }
}
