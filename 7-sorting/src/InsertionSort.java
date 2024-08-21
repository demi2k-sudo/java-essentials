import java.util.Arrays;

public class InsertionSort {
    
    static void insert(int arr[], int index, int data, int end){
        for(int i=end; i>=index; i--){
            arr[i+1] = arr[i];
        }
        arr[index] = data;
    }
    
    static void sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                int j;
                for(j=i-1;j>=0;j--){
                    if(arr[j]<arr[i]) break;
                }
                insert(arr, j+1, arr[i], i-1);
            }
        }
    }    

    public static void main(String[] args) {
        int arr[] = {3,34,5,1,87,3,12};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
