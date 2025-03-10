public class Fibonacci_while {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        int i = 0;
        while(i<10){
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
            i++;
        }
    }
    
}
