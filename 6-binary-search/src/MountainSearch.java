public class MountainSearch {
    public static int binarySearch(int arr[], int start, int end, int target, boolean isAscending){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                if(isAscending) end = mid-1;
                else start = mid+1;
            }
            else if(arr[mid]<target){
                if(isAscending) start = mid+1;
                else end = mid-1;
            }
            else return mid;
        }
        return -1;
    }

    public static int findInMountainArray(int target, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid] < arr[mid+1]) start = mid+1;
            else if(arr[mid] > arr[mid+1]) end = mid;
        }    
        int firstHalf = binarySearch(arr, 0, start, target, true);
        if(firstHalf==-1) return binarySearch(arr, start, arr.length, target, false);
        else return firstHalf;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,3,1};
        System.out.println(findInMountainArray(2, a));
    }
}
