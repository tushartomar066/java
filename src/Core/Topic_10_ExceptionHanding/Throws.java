package Core.Topic_10_ExceptionHanding;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws {
    public static void main(String[] args) throws Exception {
        method2();
    }

    private static void method2() throws Exception {
        method1();
    }

     // throws means yeh exception fek skta hai
    public static void method1() throws FileNotFoundException {
        FileReader f1 = new FileReader("1.txt");
    }
}
