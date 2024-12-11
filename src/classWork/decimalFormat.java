package classWork;

import java.text.DecimalFormat;

public class decimalFormat {
    public static void main(String[] args) {
        DecimalFormat dc=  new DecimalFormat("00.00");
        System.out.println(dc.format(7200.5));

    }
}
