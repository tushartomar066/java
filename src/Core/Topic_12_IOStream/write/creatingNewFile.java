package Core.Topic_12_IOStream.write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class creatingNewFile {
    public static void main(String[] args) {

        //CREATING THE NEW FILE
        try {
            File fs = new File("Shlok.txt");
            fs.createNewFile();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // STORING THE INPUT IN THE FILE
        try {
            FileWriter frw = new FileWriter("src/Topic_10_IOStream/shlok.txt");

            frw.write("कर्मण्येवाधिकारस्ते मा फलेषु कदाचन।\n" +
                    "मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्मणि॥\n" +
                    "\n");
            frw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
