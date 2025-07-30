import java.util.*;

public class Greater {

    public static int printGreter(int a, int b) {
       if (a>b) {
        return a;
       } else {
        return b;
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int greater = printGreter(num1, num2);
        System.out.println("Greater number is:" + greater);

    }
}