import java.util.*;

class linear_search {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int arr[] = new int[10];
    for(int i = 0 ;i<arr.length;i++){
        arr[i] = s.nextInt();
    }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }

    s.close();
}    
}
