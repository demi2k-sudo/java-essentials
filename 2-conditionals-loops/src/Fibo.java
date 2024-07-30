import java.util.Scanner;

public class Fibo{
    
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int n = num;

        int a =0;
        int b =1;
        
        while(n>0){
            int temp = b;
            b = a+b;
            a = temp;
            n--;
        }
        System.out.println("While : "+b);
        a = 0;
        b = 1;
        for(int i=0; i<num; i++){
            int temp = b;
            b = a+b;
            a = temp;
        }
        System.out.println("For : "+b);
    }
}