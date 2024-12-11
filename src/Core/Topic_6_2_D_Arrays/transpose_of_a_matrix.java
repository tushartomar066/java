package Core.Topic_6_2_D_Arrays;

public class transpose_of_a_matrix {

    //    https://www.geeksforgeeks.org/problems/transpose-of-matrix-1587115621/1
    public static void main(String[] args) {
        int[][] a = {
                {3, 8, 1},
                {7, 10, 5},
                {6, 4, 9}
        };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[j][i]);
            }
            System.out.println();
        }


    };
}

