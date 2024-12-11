package Core.Topic_3_Methods;

import java.util.Scanner;

public class areaOfCircle {
    public double Area(int radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        areaOfCircle obj = new areaOfCircle();
        System.out.println(obj.Area(radius));
    }
}
