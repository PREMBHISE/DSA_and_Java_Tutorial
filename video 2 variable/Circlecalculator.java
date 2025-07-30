import java.util.Scanner;

public class Circlecalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Radious input lena
        System.out.print("Enter the radius of the circle:");
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;

        double area = Math.PI * radius * radius;

        System.out.println("Circumference (Perimeter) of the circle:" + perimeter);
        System.out.println("Area of the circle:" + area);
    }
}