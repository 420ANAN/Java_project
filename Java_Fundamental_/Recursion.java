import java.util.Scanner;

public class Recursion {
    static int f(int n){
        if(n<=1)
        return n;
        else 
        return f(n/2)+n/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(f(n));
        sc.close();


       
        

        
    }

}