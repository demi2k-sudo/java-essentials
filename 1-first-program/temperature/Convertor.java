import java.util.Scanner;

public class Convertor {
    public static void main(String[] args) {
        System.out.print("Enter the celcius : ");
        Scanner input = new Scanner(System.in);
        double celcius =  input.nextDouble();
        double fahren = (celcius*9/5)+32;
        System.out.println("Result : "+fahren+" F");
    }    
}
