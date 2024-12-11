package DSA.BinarySearch.Assignment;

public class rowContainingMaxOnes {
    public static int count(int[][] arr , int i){
        if (arr[i][0] == 1) return arr[0].length;
        if (arr[i][(arr.length - 1)] == 0) return 0;
        int high = arr.length - 1;
        int low = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[i][mid] == 0) {
                if (mid != arr.length - 1) {
                    low = mid + 1;
                }
            }
            if (arr[i][mid] > 0) {
                high = mid - 1;
            }
        }
        return arr.length - low;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1, 1},
                {0, 0, 1, 1},
                {0, 1, 1, 1},
                {0, 0, 0, 0}
        };
        int maxOnes = 0;
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
           int result  = count(arr ,i);
           if(result>maxOnes) {
               maxOnes = result;
               idx = i;
           }
        }
        System.out.println(idx);

    }
}
