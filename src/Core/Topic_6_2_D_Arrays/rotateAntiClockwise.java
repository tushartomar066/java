package Core.Topic_6_2_D_Arrays;

public class rotateAntiClockwise {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 8, 1},
                {7, 10, 5},
                {6, 4, 9}
        };

        // Step 1: Transpose the matrix
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr[0].length; j++){  // Note: j starts at i
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Step 2: Reverse each row to get the counterclockwise rotation
        for(int i = 0; i < arr.length; i++){
            int start = 0;
            int end = arr[i].length - 1;
            while(start < end){
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }

        // Step 3: Print the rotated matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
