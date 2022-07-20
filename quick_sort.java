 class quick_sort {
    static int partition(int arr[],int low,int high){
        int pivot = arr[low];
        int smallCount = 0;
        for(int i = low+1;i<arr.length;i++){
            if(arr[i]<pivot){
                smallCount+=1;
            }
        }
        int pivotIndex = smallCount+low;
        arr[low] = arr[pivotIndex];
        arr[pivotIndex] = pivot;
        int i = low;
        int j = high;
        while(i<pivotIndex && j>pivotIndex){
            if(arr[i]<=pivot){
                i++;
            }
            if(arr[j]>pivot){
                j--;
            }
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        return pivotIndex;
    }
    static void QuickSort(int arr[],int low,int high){
        if(low>=high){
            return ;
        }
        int p = partition(arr,low,high);
        QuickSort(arr, low, p);
        QuickSort(arr, p+1, high);
    }
    public static void main(String[] args) {
        int arr[] = {5,2,1,4,3};
        int low = 0;
        int high = arr.length-1;
        QuickSort(arr,low,high);
        for(int x: arr){
            System.out.println(x);
        }
    }
}
