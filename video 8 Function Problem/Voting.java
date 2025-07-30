import java.util.*;
public class Voting {
    public static boolean printage(int age) {
        return age >= 18;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(printage(age)) {
            System.out.println("Person is eligible to vote");
        } else {
            System.out.println("Person is NOT eligible to vote.");
        }
        

    }
}