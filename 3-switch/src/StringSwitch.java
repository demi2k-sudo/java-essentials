import java.util.Scanner;

public class StringSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        switch(s){
            case "Tony": {
                System.out.println("Iron Man");
                break;
            }
            case "Steve":
                System.out.println("Captain America");
                break;
            default:
                System.out.println("Invalid User");
        }
    }
}
