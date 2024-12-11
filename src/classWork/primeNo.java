    package classWork;

    public class primeNo {
        public static void main(String[] args) {
           int[] arr = new int[101];
           arr[1] = 1;
           for(int i = 2;i<=Math.sqrt(101);i++){
               if(arr[i]==0){
                   for(int j = i*i;j<=100;j+=i){
                       arr[j] =1;
                   }
               }

           }
           for(int i = 1;i<=100;i++){
               if(arr[i]==0){
                   System.out.print(i+ " ");
               }
           }
        }
    }
