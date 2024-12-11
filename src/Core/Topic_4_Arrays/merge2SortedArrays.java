package Core.Topic_4_Arrays;

public class merge2SortedArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr2 = {2,5,6};
        int[] temp = new int[arr.length+arr2.length];
        int k = 0;
        int i = 0;
        int j = 0;
        while(i<arr.length && j<arr2.length){
            if(arr[i]<arr2[j]){
                temp[k] = arr[i];
                k++;
                i++;
            }
            else{
                temp[k] = arr2[j];
                k++;
                j++;
            }
        }
        if(i==arr.length){
            while(j<arr2.length){
                temp[k] = arr2[j];
                k++;
                j++;
            }
        }
        if(j==arr2.length){
            while(j<arr.length){
                temp[k] = arr[i];
                k++;
                i++;
            }
        }
        for(int ele : temp){
            System.out.print(ele + " ");
        }
    }
}
