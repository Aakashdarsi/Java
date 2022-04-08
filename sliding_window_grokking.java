import java.util.*;

class sliding_window_grokking {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i =0 ;i< n ;i ++){
            arr[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int k = s.nextInt();
        result(arr,k);
        s.close();
        

        }
        static void result(int arr[],int k){
            double res[] = new double[arr.length-k+1];
            for(int i =0 ;i <=arr.length - k;i ++){
                double sum = 0;
                for(int j = i ; j < i+k ;j++){
                    sum += arr[j];
                }
                res[i] = sum/k;

            }
            System.out.println(Arrays.toString(res));
        }
       
        }
