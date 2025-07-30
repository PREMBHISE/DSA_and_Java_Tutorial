import java.util.*;
public class NumberCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zeros = 0;
        char choice;

        do{
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if(num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zeros++;
            }

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = sc.next().charAt(0);
        
        } while(choice == 'y' || choice == 'Y');

        System.out.println("\n---Result ---");
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zeros);
        
    }
}