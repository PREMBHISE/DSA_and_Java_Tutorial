public class Uppercase {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("helloWord");

        for(int i=0; i< sb.length(); i++) {
            char ch = sb.charAt(i);
            if(ch >= 'a' && ch<= 'z') {
                sb.setCharAt(i, (char)(ch-32));
            }
        }

        System.out.println(sb);
    }
}