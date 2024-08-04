public class Equal{
    public static void main(String[] args){
        String a = "Kunal";
        String b = "Kunal";
        System.out.println(a==b);
        
        a = new String("Kunal");
        b = new String("Kunal");
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}