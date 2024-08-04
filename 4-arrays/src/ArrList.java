import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(5);
        a.add(2);
        a.add(6);
        System.out.println(a);

        ArrayList<ArrayList<Integer>> b = new ArrayList<ArrayList<Integer>>();
        
        //intialising 2D ArrayList
        for(int i=0; i<3; i++){
            b.add(new ArrayList<Integer>());
        }
        
        //adding elements in 2D ArrayList
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                b.get(i).add(j);
            }
        }
        System.out.println(b);
        b.set(0,a);
        System.out.println(b);
    }    
}
