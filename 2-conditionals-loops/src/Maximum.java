import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(Math.max(c, Math.max(a,b)));    
    }
}
