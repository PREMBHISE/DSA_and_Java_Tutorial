public class VoewlRemoval {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("HelloWorld");

        for(int i=0; i<sb.length(); i++) {
            char ch = sb.charAt(i);
            if("aeiouAEIOU".indexOf(ch) != -1) {
                sb.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(sb);
    }
}           