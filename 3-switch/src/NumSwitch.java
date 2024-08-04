import java.util.Scanner;

public class NumSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        switch(s){
            case 1: 
            case 2:
            case 3:
            case 4:
            case 5:
            {
                System.out.println("Work day");
                break;
            }
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Not a day");
        }
    }
}
