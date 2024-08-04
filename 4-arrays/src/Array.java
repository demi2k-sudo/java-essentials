import java.util.Arrays;
import java.util.Scanner;

public class Array {

    static void change(int[][] arr, int i, int j, int value){
        arr[i][j] = value;
    }

    public static void main(String Args[]){
        int[][] arr = new int[3][];
        
        Scanner in = new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.print("len : ");
            int n;
            n = in.nextInt();
            arr[i] = new int[n];
            for(int j = 0; j<n;j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
        System.out.print("Enter the location to change : ");
        int i = in.nextInt();
        int j = in.nextInt();
        System.out.print("Enter the value to change : ");
        int val = in.nextInt();
        change(arr,i,j,val);
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
