import java.util.*;
public class AddOddNum {
    public static void printOddSum(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum += i;
        }
        System.out.println("Sum of odd number from 1 to " + n + " is: " + sum);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        printOddSum(num);
    }
}