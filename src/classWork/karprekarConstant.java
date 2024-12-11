package classWork;

import java.util.Arrays;


public class karprekarConstant {
    public static int count(int n) {
        int count_var = 0;
        while (n != 0) {
            count_var++;
            n = n / 10;
        }
        return count_var;
    }

    public static int kapa(int n) {
        int size = count(n);
        int[] arr = new int[size];

        int nums = n;
        for(int i = 0;i<size;i++) {
            arr[i] = n % 10;
            n /= 10;
        }
        Arrays.sort(arr);
        int aesc = 0, desc = 0;
        for (int j = 0; j < size; j++) {
            desc = desc * 10 + arr[j];
        }
        for (int j = size - 1; j >= 0; j--) {
            aesc = aesc * 10 + arr[j];
        }
        int diff = Math.abs(aesc - desc);
        if (diff == nums) return 0;
        return 1 + kapa(diff);
    }

    public static void main(String[] args) {
        int res = kapa(6174);
        if(res==0){
            System.out.println("true");
        }
        else System.out.println("false");
    }
}
