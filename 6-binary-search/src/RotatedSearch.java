public class RotatedSearch {
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

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid=0;
        if(nums[start]<nums[end]) return binarySearch(nums,start,end,target,true);
        while(start<end){
            mid = start + (end-start)/2;
            if(nums[mid]>nums[mid+1]) break;
            else if(nums[mid-1]>nums[mid]) {
                mid = mid-1;
                break;
            }
            else if(nums[mid]>nums[start]){
                start = mid+1;
            }
            else if(nums[mid]<nums[start]){
                end = mid-1;
            }
        }
        int firstHalf = binarySearch(nums, 0, mid, target, true);
        if(firstHalf==-1) return binarySearch(nums, mid+1, nums.length-1, target, true);
        else return firstHalf;
    }
    
    public static void main(String[] args) {
        int a[] = {6,7,8,1,2,3,4,5};
        System.out.println(search(a, 8));
    }
}
