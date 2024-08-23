public class MissingNumber {
    public static int missingNumber(int[] arr) {
        for(int i=0; i<arr.length; i++){
            if(arr[i]==arr.length){
                continue;
            }
            if(i!=arr[i]){
                int temp = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] =temp;
                i--;
            }
        }
        for(int i=0; i<arr.length; i++) if(arr[i]==arr.length) return i;
        return arr.length;
    }

    public static void main(String[] args) {
        int arr[] ={0,3,2,1,5};
        System.out.println(missingNumber(arr));
        int arr2[] ={3,0,4,1,2};
        System.out.println(missingNumber(arr2));
    }
}