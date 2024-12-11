package Core.Topic_6_2_D_Arrays;

public class rowHavingMaxSum {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 8, 1, 12},
                {7, 10, 5, 13},
                {6, 4, 9, 14},
                {22, 45, 67, 89}
        };
        int greatest = 0;
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
            if (sum > greatest) {
                idx = i;
                greatest = sum;
            }
        }
        System.out.println(greatest);
        System.out.println(idx);
    }
}
