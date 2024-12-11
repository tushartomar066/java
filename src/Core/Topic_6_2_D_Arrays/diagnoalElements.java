package Core.Topic_6_2_D_Arrays;

public class diagnoalElements {
    public static void main(String[] args) {
        int arr[][] = {{3, 8,  1,  12, 10},
                      {7,  10, 5,  13, 99},
                      {6,  4,  9,  14, 98},
                      {22, 45, 67, 89, 97},
                      {54, 78, 95, 88 ,33}
        };

        for(int i = 0;i<arr.length;i++){
            for(int j =  0;j<arr[0].length;j++){
                if(i==j) System.out.println(arr[i][j]);
                if(i+j==arr.length-1) System.out.println(arr[i][j]);
            }
        }





    }
}
