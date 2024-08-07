import java.util.ArrayList;
import java.util.Scanner;

/**
 * Linear
 */
public class Linear {

    static int LinearSearch(ArrayList<Integer> arr, int key){
        int ind = 0;
        for(int i:arr){
            if (i==key) return ind;
            ind++;
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i<10; i++) arr.add(i);
        System.out.print("Enter the element to search : ");
        Scanner in = new Scanner(System.in);
        int key = in.nextInt();
        int result = LinearSearch(arr, key);
        if(result==-1){
            System.out.println("The number you search is not found :(");
        }
        else{
            System.out.println("The number you search is found at index "+result);
        }
        in.close();
    }
}