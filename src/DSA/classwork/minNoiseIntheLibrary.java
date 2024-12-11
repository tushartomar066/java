package DSA.classwork;

public class minNoiseIntheLibrary {
    public static void main(String[] args) {
        int arr[] = {4, 5, 1, 6, 2, 8, 4};
        int k = 3;
        int n = arr.length;
        int noise  = 0;
        for(int i = 0;i<k;i++){
            noise+=arr[i];
        }
        int index = 0;
        int currentNoise = noise;
        for(int i = k ; i<n ; i++){
            currentNoise += arr[i];
            currentNoise -= arr[i-k];
            if(currentNoise < noise){
                noise = currentNoise;
                index = i-k+1;
            }
        }
        System.out.println(index);
    }
}
