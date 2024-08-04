import java.util.ArrayList;

public class Reverse {
    static void reverseArray(ArrayList<Integer> arr){
        int l = 0;
        int r = arr.size()-1;
        while(r>l){
            int temp = arr.get(l);
            arr.set(l,arr.get(r));
            arr.set(r,temp);
            r--;
            l++;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(5);
        a.add(3);
        a.add(4);
        a.add(1);
        a.add(0);
        System.out.println(a);
        reverseArray(a);
        System.out.println(a); 
    }
}
