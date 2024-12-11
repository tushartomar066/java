package Core.Topic_12_IOStream.write;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class bassic {
    public static void main(String[] args) throws IOException {
        try(OutputStreamWriter osw = new OutputStreamWriter(System.out)){
            // sout has more preference than write method
            osw.write("hello world");
            osw.write("\n");
//            System.out.println();
            osw.write("A");
            osw.write("\n");
//            System.out.println();
            osw.write(101);
//            System.out.println();
            char[] arr = "hello world".toCharArray();
            osw.write("\n");
            System.out.println();
            osw.write(arr , 3, 5);
        }
    }
}
