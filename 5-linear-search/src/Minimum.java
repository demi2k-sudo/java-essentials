public class Minimum {
    static int findMinimum(int a[]){
        int minimum = a[0];
        for(int i:a){
            if(i<minimum) minimum = i;
        }
        return minimum;
    }
    public static void main(String[] args) {
        int a[] = {5,3,6,3,9,1};
        int minimum = findMinimum(a);
        System.out.println("The minimum value in the array is "+minimum);
    }    
}
