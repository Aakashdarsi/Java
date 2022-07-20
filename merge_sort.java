class merge_sort {
    static void merge(int arr[],int low,int mid,int high){
        int temp[] = new int[high-low+1];
        int i = low;
        int j = mid+1;
        int count = 0;
        while(i<=mid && j<=high){
            if(arr[i]<arr[j]){
                temp[count] = arr[i];
                count +=1;
                i+=1;
            }
            else{
                temp[count] = arr[j];
                j+=1;
                count+=1;
            }
        }
        while(i<=mid){
            temp[count] = arr[i];
            count+=1;
            i+=1;
        }
        while(j<=high){
            temp[count] = arr[j];
            count+=1;
            j+=1;
        }
        int c = 0;
        for(int b=low;b<=high;b++){
            arr[b] = temp[c];
            c+=1;
        }
    }
   
    static void ms(int arr[],int low,int high){
        if(low>=high){
            return ;
        }
        int mid = low + (high-low)/2;
        ms(arr,low,mid);
        ms(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void main(String[] args) {
        int arr[] = {5,2,1,4,3};
        ms(arr,0,arr.length-1);
        for(int x : arr){
            System.out.println(x);
        }
    }
}
