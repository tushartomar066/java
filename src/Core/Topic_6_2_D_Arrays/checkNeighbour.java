package Core.Topic_6_2_D_Arrays;

import java.util.Scanner;

public class checkNeighbour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[rows][col];
        int[][] resultant = new int[rows][col];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                int live = 0;
                //checking for live and dead neighbours
                if (j + 1 < col) {
                    // condition for checking right upper diagonal element & right down diagonal element
                    if (i - 1 >= 0) {
                        if (arr[i - 1][j + 1] != 0) live++;
                    }
                    if (i + 1 < rows) {
                        if (arr[i + 1][j + 1] != 0) live++;
                    }
                    if (arr[i][j + 1] != 0) live++;
                }
                if (j - 1 >= 0) {
                    // condition for checking left upper diagonal element & left down diagonal element
                    if (i - 1 >= 0) {
                        if (arr[i - 1][j - 1] != 0) live++;
                    }
                    if (i + 1 < rows) {
                        if (arr[i + 1][j - 1] != 0) live++;
                    }
                    if (arr[i][j - 1] != 0) live++;
                }
                if (i + 1 < rows) {

                    if (arr[i + 1][j] != 0) live++;
                }
                if (i - 1 >= 0) {
                    if (arr[i - 1][j] != 0) live++;

                }
                // now changing in array acc to conditions
                if (arr[i][j] == 1) {
                    if (live < 2 || live > 3) resultant[i][j] = 0;
                    else resultant[i][j] = arr[i][j];

                } else {
                    if (live == 3) {
                        resultant[i][j] = 1;
                    }

                }

            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(resultant[i][j] + " ");
            }
            System.out.println();
        }
    }
}


