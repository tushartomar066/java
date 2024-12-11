package Core.Topic_6_2_D_Arrays;

public class add_2_matrix {
    public static void main(String[] args) {
        int[][] arr1 = {
                {3, 8, 1},
                {7, 10, 5},
                {6, 4, 9}
        };
        int[][] arr2 = {
                {3, 8, 1},
                {7, 10, 5},
                {6, 4, 9}
        };

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr1[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    };
}
