import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter number of terms (n): ");
       int n = sc.nextInt();

       int a = 0, b = 1;

       System.out.println("Fibonacci series up to " + n + " terms:");

       for(int i=1; i<=n; i++) {
        System.out.print(a + " ");

        int next = a + b;
        a = b; 
        b = next;
       }

    }
}