import java.util.*;

public class Multiplication {
    public static int CalculateProduct(int a, int b) {
        int product = a * b;

        return product;
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The product of the 2 number is:" + CalculateProduct(a, b));
    }
}