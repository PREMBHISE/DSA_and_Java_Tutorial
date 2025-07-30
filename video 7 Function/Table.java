import java.util.*;
public class Table {
    public static void printTable(int n) {
        System.out.println("Multiplication table of" + n + ":");
        for(int i=1; i<=10; i++){
            System.out.println(n + "x" + i + "=" + (n*i));

        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        printTable(num);
    }
}