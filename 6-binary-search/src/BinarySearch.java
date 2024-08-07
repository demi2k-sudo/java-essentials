public class BinarySearch {
    
    static int search(int arr[], int key){
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while(start<=end){
            // mid = (start+end)/2;
            mid = start + (end-start)/2;

            if(arr[mid]>key) end = mid -1;
            else if(arr[mid]<key) start = mid+1;
            else return mid;
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,4,6,7,9,12};
        int key = 4;
        System.out.println(search(arr, key)); 
    }
}
