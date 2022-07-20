class binary_search {
    static int bs(int arr[],int key){
        int low = 0;
        int high = arr.length - 1;
        while(low<high){
            int mid = low + (high-low)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid]>key){
                high = mid-1;
            }
            else if(arr[mid]<key){
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int res  = bs(arr,2);
        System.out.println(res);
    }
    
}
