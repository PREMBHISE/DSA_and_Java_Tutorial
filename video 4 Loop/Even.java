import java.util.*;
public class Even{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number (n): ");
        int a = sc.nextInt();

        // for (int i = 0; i<=a; i++) {
        //     if (i % 2 == 0) {
        //         System.out.println(i);
        //     }
        // }

        for (int i = 2; i<= a; i += 2){
            System.out.print(i + " ");
        }

    }
}