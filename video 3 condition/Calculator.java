import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value:");
        int a = sc.nextInt();

        System.out.print("Enter b value:");
        int b = sc.nextInt();

        // System.out.print("Enter operator value:");
        // int operator = sc.nextInt();

        // switch(operator) {
        // case 1:
        // System.out.println("The addition of the a and b is: " a + b);
        // break;
        // case 2:
        // System.out.println("The substraction of the a and b is:" a - b);
        // }

        // if (operator == 1) {
        // System.out.println("The addition of two number is:" + (a + b));
        // }
        // else if (operator == 2){
        // System.out.println("The substraction of two number is:" + (a - b));
        // }

        System.out.println("Choos an operation:");
        System.out.println("1: Addition (+)");
        System.out.println("2: Substraction (-)");
        System.out.println("3: multiplication (*)");
        System.out.println("4: Division");
        System.out.println("5: Modulo (%)");

        System.out.println("Enter your choise (1 to 5): ");
        int choise = sc.nextInt();

        switch (choise) {
            case 1:
                System.out.println("Result is" + (a + b));
                break;
            case 2:
                System.out.println("Result is" + (a - b));
                break;
            case 3:
                System.out.println("Result is" + (a * b));
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Invalid Divison");
                } else {
                    System.out.println("Result is" + (a / b));
                }

                break;
            case 5:
                System.out.println("Result is" + (a % b));
                break;
        }

    }
}