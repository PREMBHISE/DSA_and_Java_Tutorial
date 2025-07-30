import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.print("Enter 1 to continue or 0 to stop: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter student's marks (out of 100): ");
                int marks = scanner.nextInt();

                if (marks >= 90 && marks <= 100) {
                    System.out.println("This is Good");
                } else if (marks >= 60 && marks <= 89) {
                    System.out.println("This is also Good");
                } else if (marks >= 0 && marks < 60) {
                    System.out.println("This is Good as well");
                    System.out.println("Because marks don’t matter but our effort does.");
                } else {
                    System.out.println("Invalid marks! Please enter marks between 0 to 100.");
                }
            } else if (choice != 0) {
                System.out.println("Invalid choice! Please enter 1 or 0.");
            }

        } while (choice != 0);

        System.out.println("Program Ended. Thank you!");
    }
}
