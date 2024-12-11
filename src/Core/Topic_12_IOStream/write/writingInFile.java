package Core.Topic_12_IOStream.write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class writingInFile {
    public static void main(String[] args) {


        // to take inut in file writer

        try (FileWriter fr = new FileWriter("src/Topic_10_IOStream/read/write/output")) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            fr.write(str);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        // for adding the data in file we have to pass the true in the argument

        try (BufferedWriter bfw = new BufferedWriter(new FileWriter("src/Topic_10_IOStream/read/write/output", true))) {
            bfw.write(" appending more data");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        // for changing the whole input
//        try (BufferedWriter bfw = new BufferedWriter(new FileWriter("src/Topic_10_IOStream/read/write/output"))) {
//            bfw.write("changing the data");
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
    }
}
