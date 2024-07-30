import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The Integer is "+input.nextInt());
        System.out.println("The Word is "+input.next());
        System.out.println("The Sentence is "+input.nextLine());
    }    
}
