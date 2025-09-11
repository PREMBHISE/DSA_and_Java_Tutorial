public class Factorial {
    public static int calcfactorial(int n) {
        if(n == 1 || n == 0) {
            return 1;
        }
        int fact_nm1 = calcfactorial(n-1);
        int factn_n = n * fact_nm1;
        return factn_n;
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = calcfactorial(n);
        System.out.println(ans);
    }
}