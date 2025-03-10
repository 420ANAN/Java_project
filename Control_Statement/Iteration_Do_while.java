public class Iteration_Do_while {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        int i = 0;
        do{
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
            i++;
        }while(i<10);
    }
    
}
