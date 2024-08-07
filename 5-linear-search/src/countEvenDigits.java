public class countEvenDigits {
    static boolean hasEvenDigits(int n){
        return ((int)(Math.log10(n)+1)%2==0);
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int i:nums){
            if(hasEvenDigits(i)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int a[] = {12,75476,8766,12,7567,132};
        System.out.println(findNumbers(a));
    }
}