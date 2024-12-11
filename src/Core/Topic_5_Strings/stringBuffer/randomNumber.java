package Core.Topic_5_Strings.stringBuffer;

import java.util.Random;

public class randomNumber {
    public static void main(String[] args) {
        int n = 15;
        String str = Generate(n);
        System.out.println(str);
    }

    public static String Generate(int n) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            Random random = new Random();
            int x = 97 + ((int) (random.nextFloat() * 26));
            buffer.append((char) x);
        }
        return buffer.toString();
    }
}
