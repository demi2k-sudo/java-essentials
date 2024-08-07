public class OrderAgnostic {
    static int search(int arr[], int key){
        int start = 0;
        int end = arr.length - 1;
        int mid;
        if(arr[start]<arr[end]){
            while(start<=end){
                // mid = (start+end)/2;
                mid = start + (end-start)/2;
    
                if(arr[mid]>key) end = mid -1;
                else if(arr[mid]<key) start = mid+1;
                else return mid;
            }
        }
        else{
            while(start<=end){
                // mid = (start+end)/2;
                mid = start + (end-start)/2;
    
                if(arr[mid]<key) end = mid -1;
                else if(arr[mid]>key) start = mid+1;
                else return mid;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,4,6,7,9,12};
        int key = 4;
        System.out.println(search(arr, key));
        int arr1[] = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(search(arr1, key));
    }
}
