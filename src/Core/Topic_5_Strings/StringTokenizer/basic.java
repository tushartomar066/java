package Core.Topic_5_Strings.StringTokenizer;

import java.util.StringTokenizer;

public class basic {
    public static void main(String[] args) {
        String str = "hello      tushar singh     tomar happy car bike hero ";
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            System.out.print(st.nextElement());
        }
    }
}
