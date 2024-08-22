import java.util.Arrays;

public class CyclicSort {
    static void sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(i!=arr[i]-1){
                int temp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
                i--; 
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,4,7,3,1,2,6};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
