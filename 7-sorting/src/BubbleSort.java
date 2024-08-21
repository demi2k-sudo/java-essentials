
import java.util.Arrays;

public class BubbleSort {

    static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=1; j<arr.length;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,5,3,5,1,4,3,5,3,4,10,6,75,3};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
