import java.util.Arrays;

public class SelectionSort {

    static void sort(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,5,3,5,1,5,3,4,10,6,75,3};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
