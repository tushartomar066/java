package Core.Topic_5_Strings;

public class removeWhiteSpace {
    public static void main(String[] args) {

        String str = "TUSHAR SINGH TOMAR";

        // assign the result back to the str , string is immutable

        str = str.replaceAll("\\s", "");

        System.out.println(str);
    }
}
