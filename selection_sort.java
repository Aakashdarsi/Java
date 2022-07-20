

class selection_sort {
public static void main(String[] args) {
    int arr[] = {5,2,1,4,3};
    for(int i=0;i<arr.length;i++){
        int min_index = i ;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[min_index]){
                min_index = j;
            }
        }
        if(arr[min_index]<arr[i]){
            arr[i] = arr[i]+arr[min_index];
            arr[min_index] = arr[i] - arr[min_index];
            arr[i] = arr[i] - arr[min_index];
        }
    }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
}    
}
