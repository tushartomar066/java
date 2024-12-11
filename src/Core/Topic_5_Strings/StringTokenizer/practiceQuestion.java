package Core.Topic_5_Strings.StringTokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class practiceQuestion {

    /* test cases
hello world welcome
-

this is a test
,

singleword
,

tokenize this
|

another test case
->

a b c d e f g h i j k l m n o p q r s t u v w x y z
-
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String s = scanner.nextLine();


        String delim = scanner.nextLine();


        String result = tokenizeAndConcatenate(s, delim);
        System.out.println(result);

        scanner.close();
    }

    private static String tokenizeAndConcatenate(String s, String delim) {
        StringTokenizer str = new StringTokenizer(s);
        StringBuilder result = new StringBuilder();
        while(str.hasMoreTokens()){
            result.append(delim);
            result.append(str.nextToken());
        }
        String ans = result.toString();
        return ans.substring(delim.length());
    }

}
