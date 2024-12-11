package Core.Topic_6_2_D_Arrays;

public class spiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int rowMin = 0;
        int rowMax = arr.length - 1;
        int colMax = arr[0].length - 1;
        int colMin = 0;
        while (colMin<=colMax && rowMin<=rowMax) {
            for (int i = colMin; i <= colMax; i++) {
                System.out.print(arr[rowMin][i] + " ");
            }
            System.out.println();
            rowMin++;
            if(rowMin > rowMax || colMin > colMax)break;
            for (int i = rowMin; i <= rowMax; i++) {
                System.out.print(arr[i][colMax] + " ");
            }
            System.out.println();
            colMax--;
            if(rowMin > rowMax || colMin > colMax)break;
            for (int i = colMax; i >= colMin; i--) {
                System.out.print(arr[rowMax][i] + " ");
            }
            System.out.println();
            rowMax--;
            if(rowMin > rowMax || colMin > colMax)break;
            for (int i = rowMax; i >= rowMin; i--) {
                System.out.print(arr[i][colMin] + " ");
            }
            colMin++;
            if(rowMin > rowMax || colMin > colMax)break;
        }

    }
}
