package Core.Topic_12_IOStream.read;

import java.io.IOException;
import java.io.InputStreamReader;

public class basic {
    public static void main(String[] args) {
        // taking data in byte stream and printing it in char stream
        //isr is an instancne of InputReaderStream which takes input from system.in means keyboard
        try (InputStreamReader isr = new InputStreamReader(System.in)) {

//This line reads the first character from the input and stores its value in the variable letters. The read() method reads a single character (as an ASCII value) from the input stream.
            int letters = isr.read();

            while (isr.ready()) {
                System.out.print((char) letters + " ");
                letters = isr.read();
            }
            //try block automatically closes this stream ,  but here we are manually closing it
//            isr.close();
            System.out.println();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
