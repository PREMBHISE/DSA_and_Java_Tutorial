import java.util.*;
public class Findpower {
    public static double CalculatePower(double a, double b) {
        return Math.pow(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (x): ");
        int x = sc.nextInt();

        System.out.print("Enter exponent (n): ");
        int n = sc.nextInt();

        double Findpower = CalculatePower(x, n);
        System.out.println(x + " raised to the power " + n + " is: " + Findpower);

    }
}