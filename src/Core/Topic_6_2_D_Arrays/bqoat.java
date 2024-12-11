package Core.Topic_6_2_D_Arrays;

public class bqoat {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for(int i = 0;i<5;i++){
            for(int j = 0;j<5;j++){
                arr[i][j] = 10;
            }
        }
        for(int[] ele : arr){
            for(int x: ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }



}
