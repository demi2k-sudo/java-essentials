import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your favourite number : ");
        int num = input.nextInt();
        System.out.println("Your rollno is "+num);

        int a = 10;
        // a->identifier and 10->literal
        
        a = 10_000; //10,000
    }
}
