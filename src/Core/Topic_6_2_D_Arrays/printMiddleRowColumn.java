package Core.Topic_6_2_D_Arrays;

public class printMiddleRowColumn {
        public static void main(String[] args) {
        int arr[][] = {{3, 8, 1, 12, 10},
                {7, 10, 5, 13, 99},
                {6, 4, 9, 14, 98},
                {22, 45, 67, 89, 97},
                {54, 78, 95, 88}
        };
        int middle_row = (arr.length / 2);
        int middle_column = (arr[0].length / 2);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (j == middle_column || i == middle_row) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
