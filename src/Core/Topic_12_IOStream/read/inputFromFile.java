package Core.Topic_12_IOStream.read;

import java.io.FileReader;
import java.io.IOException;

public class inputFromFile {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("src/Topic_10_IOStream/input.txt")) {
            int letters = fr.read();
            while (fr.ready()) {
                System.out.print((char) letters);
                letters = fr.read();
            }
            fr.close();
            System.out.println();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}