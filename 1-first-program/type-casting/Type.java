public class Type {
    public static void main(String[] args){

        //explicit casting
        int num = (int) 8.024;
        System.out.println(num);

        //implicit casting
        byte b = 52;
        char c = 'c';
        short s = 1024;
        int i = 5000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b) + (i/c) - (d-s);
        System.out.println((f*b)+" "+(i/c)+" "+(d-s));
        System.out.println(result);
    }    
}
