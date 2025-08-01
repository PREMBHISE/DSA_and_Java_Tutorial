import java.util.*;
public class Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        // method 1 
        // int marks[] = new int[3];
        // marks[0] = 97;
        // marks[1] = 98;
        // marks[2] = 95;

        //method 2
        // int marks[] = {98, 97, 95};
        // System.out.print(marks[0]);
        // System.out.print(marks[1]);
        // System.out.print(marks[2]);

        //taking an array as input and printing its element
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        //print the number in array output
        for(int i=0; i< numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
    }
}