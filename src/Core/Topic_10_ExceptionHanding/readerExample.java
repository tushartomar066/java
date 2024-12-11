package Core.Topic_10_ExceptionHanding;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readerExample {
    public static void main(String[] args) {
        BufferedReader reader = null;

        //sbsse phele buffer reader ka obj bnaya jo system ki resources ko use kr rha hai

        // ab try me hmara kaam ho rha hai try me kam hone k bad agr kisse ne issi me return lga rakha ho toh program terminate ho jayega aur buffer reader toh khula reh jayega
        try {
            reader = new BufferedReader(new FileReader("1.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);

            }

        } catch (IOException e) {
//            System.out.println(STR."IOException caught: \{e.getMessage()}");


            // to make sure ki yeh code hamara hamesha chale isliye use finally me dal dete hai


        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("error closing the reader " + e.getMessage());
            }
        }

    }
}
