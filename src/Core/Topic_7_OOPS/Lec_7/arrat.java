package Core.Topic_7_OOPS.Lec_7;

public class arrat {
    int[] arr;

    public arrat(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            assert false;
            arr[i] = nums[i];
        }
    }
    public void sem(){
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
    }

    public int summer(int left, int right) {
        return arr[right];
    }

    public static void main(String[] args) {
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        arrat nc = new arrat(arr2);
        int result = nc.summer(3, 6);
        System.out.println(result);
    }
}
