class Peak {
    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start<end){
            
             int mid = start + (end-start)/2;
            
            if(nums[mid]<nums[mid+1]){
                start = mid+1;
            }
            if(nums[mid]>nums[mid+1]){
                end = mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,5,4,3,2};
        System.out.println(findPeakElement(arr));
    }
}