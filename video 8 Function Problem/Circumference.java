import java.util.*;
public class Circumference {
    public static double getradius(double n) {
        return 2 * Math.PI * n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        double Circuference = getradius(num);
        System.out.println("Circumference of the circle is: " + Circuference);

    }
}