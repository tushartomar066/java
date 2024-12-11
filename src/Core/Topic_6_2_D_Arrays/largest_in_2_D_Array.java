package Core.Topic_6_2_D_Arrays;

public class largest_in_2_D_Array {
    public static void main(String[] args) {
        int[][] array = {
                {3, 8, 1},
                {7, 10, 5},
                {6, 4, 9}
        };
        int max = Integer.MIN_VALUE;
        for (int[] ele : array) {
            for (int x : ele) {
                if (x > max) max = x;
            }
        }
        System.out.println(max);
    }
}
