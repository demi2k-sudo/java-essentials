import java.util.Arrays;

public class SetMismatch {
    public static int[] findErrorNums(int[] nums) {
        int temp;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=i+1){
                int correct = nums[i]-1;
                if(nums[i]!=nums[correct]){
                    temp = nums[correct];
                    nums[correct] = nums[i];
                    nums[i] = temp;
                    i--;
                }
            }
        }
        for(int i=0; i<nums.length;i++) if(nums[i]!=i+1) return new int[]{nums[i],i+1};
        return new int[]{};
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,5,5};
        System.out.println(Arrays.toString(arr));
        int ans[] = findErrorNums(arr);
        System.out.println("The missing number is : "+ans[1]+"\nThe duplicate number is : "+ans[0]);
    }
}