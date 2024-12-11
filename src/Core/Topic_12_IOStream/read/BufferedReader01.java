package Core.Topic_12_IOStream.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader01 {

    public static void main(String[] args) {

        // DEMO
//        try (BufferedReader fir = new BufferedReader(new InputStreamReader(System.in))) {
//            int letters;
//            while ((letters = fir.read()) != -1) {
//                System.out.print((char) letters);
//            }
//            System.out.println();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }


        //  printing whole line

//        try (BufferedReader fir = new BufferedReader(new InputStreamReader(System.in))) {
//            String letters;
//            while ((letters = fir.readLine()) != null) System.out.println(letters);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }


        try (BufferedReader fd = new BufferedReader(new FileReader("C:\\Users\\Public\\Documents\\firstProgram\\src\\Core.Topic_12_IOStream\\read\\input.txt"))) {
        String letter = "";
        while((letter = fd.readLine()) != null){
            System.out.println(letter);
        }
            fd.close();



        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }


}
