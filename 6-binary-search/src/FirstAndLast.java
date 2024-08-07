import java.util.Arrays;

public class FirstAndLast {
    static int search(int arr[], int key, boolean searchFirstElement){
        int start = 0;
        int end = arr.length - 1;
        int mid;
        int ans = -1;
        while(start<=end){
            // mid = (start+end)/2;
            mid = start + (end-start)/2;

            if(arr[mid]>key) end = mid -1;
            else if(arr[mid]<key) start = mid+1;
            else{
                if(searchFirstElement){
                    ans = mid;
                    end = mid-1;
                }
                else{
                    ans = mid;
                    start = mid+1;
                }
            }
        }
        
        return ans;
    }
    
    static int[] getFirstAndLast(int[] arr, int key){
        return new int[]{search(arr, key, true), search(arr, key, false)};
    }

    public static void main(String[] args) {
        int arr[] = {0,1,1,1,1,2,2,2,2,5,5,5,5,6,7,8,8,8,9,9,9,9};
        int key = 9;
        System.out.println(Arrays.toString(getFirstAndLast(arr, key)));
    }
}
