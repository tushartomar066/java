package Core.Topic_12_IOStream.read;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sumWithoutScannerClass {
    public static void main(String[] args) {
        // agr hm string me put kr dete hai toh wo as it is utha lega console se jo input me diya hai wrna int me dete hai toh wo console me input ki value ko ascii me badal ke store krta hai
        try (BufferedReader fir = new BufferedReader(new InputStreamReader(System.in))) {
            // Read two numbers as strings
            String input1 = fir.readLine();  // Read first line of input
            String input2 = fir.readLine();  // Read second line of input

            // Convert the inputs to integers
            int a = Integer.parseInt(input1);
            int b = Integer.parseInt(input2);

            // Calculate the sum of the two numbers
            int sum = a + b;

            // Print the result
            System.out.println("Sum: " + sum);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
