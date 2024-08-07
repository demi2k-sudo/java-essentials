import java.lang.reflect.Array;
import java.util.Arrays;

public class Search2D {
    static int[] linearSearch(int a[][],int key){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                if(a[i][j]==key){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        int a[][] = {
            {1,7,4,34},
            {1,6},
            {4,7,8}
        };
        int key = 34;
        int location[] = linearSearch(a,key);
        System.out.println(Arrays.toString(location)); 
    }    
}
