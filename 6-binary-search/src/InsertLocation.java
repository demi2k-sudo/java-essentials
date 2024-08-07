public class InsertLocation {
    public static int searchInsert(int[] arr, int key) {
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
        
        return start;//end+1;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,6};
        int key = 4;
        System.out.println(searchInsert(arr,key));
    }
}
