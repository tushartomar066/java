package Core.Topic_6_2_D_Arrays;

public class setMatrixZeros {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}};
        for (int j = 1; j < arr[0].length; j++) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i][j] == 0) {
                    arr[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == 0) {
                for (int j = 1; j < arr[0].length; j++) {
                    arr[i][j] = 0;
                }
            }
        }
        for (int j = 0; j < arr[0].length; j++) {
            if (arr[0][j] == 0) {
                for (int i = 1; i < arr.length; i++) {
                    arr[i][j] = 0;
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
