import java.util.*;
public class ReplaceChar {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());

        for(int i=0; i<sb.length(); i++) {
            if(sb.charAt(i) == 'e') {
                sb.setCharAt(i, 'i');

            }
        }
        System.out.println(sb);
    }
}