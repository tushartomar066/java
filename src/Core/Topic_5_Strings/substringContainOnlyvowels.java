package Core.Topic_5_Strings;

import java.util.ArrayList;

public class substringContainOnlyvowels {
    public static void main(String[] args) {
        String str = "tuesharacimrzvriou";
        ArrayList<String> vowelArray = new ArrayList<>();
        StringBuilder tempString = new StringBuilder();
        int j = 0;
        while (j < str.length()) {
            if (str.charAt(j) == 'A' || str.charAt(j) == 'a' || str.charAt(j) == 'E' || str.charAt(j) == 'e' || str.charAt(j) == 'I' || str.charAt(j) == 'i' || str.charAt(j) == 'O' || str.charAt(j) == 'o' || str.charAt(j) == 'U' || str.charAt(j) == 'u') {
                tempString.append(str.charAt(j));
            } else {
                if (tempString.length() != 0) {
                    vowelArray.add(tempString.toString());
                    tempString.setLength(0);
                }
            }
            j++;
        }

        // To add the last substring if it ends with vowels
        if (tempString.length() != 0) {
            vowelArray.add(tempString.toString());
        }
        System.out.print("[");
        for (String ele : vowelArray) {
            System.out.print(" '" + ele + "' ");
        }
        System.out.print("]");
    }
}