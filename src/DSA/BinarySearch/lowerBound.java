package DSA.BinarySearch;

public class lowerBound {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,3,4,6,8,8};
        int high = arr.length - 1, target = 1, low = 0, lb = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                lb = Math.min(lb, mid);
                high = mid - 1;
            } else low = mid + 1;
        }
        System.out.println(lb);



    }
}
