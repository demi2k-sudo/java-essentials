import java.util.Scanner;

public class Reverse {

    static int reverseNumber(int n){
        int answer = 0;
        while(n!=0){
            answer = answer*10+(n%10);
            n/=10;
        }
        return answer;
    }

    static String reverseString(String s){
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to Reverse : ");
        int num = in.nextInt();
        System.out.println(reverseNumber(num));
        System.out.print("Enter a String to Reverse : ");
        String s = in.next();
        System.out.println(reverseString(s));
    }
    
}
