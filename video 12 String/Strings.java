public class Strings {
    public static void main(String[] args) {
        String firstname = "Tony";
        String Secondname = "Stark";

        String fullname = (firstname + " " + Secondname);
        // System.out.println(fullname);
        // System.out.println(fullname.length());

        for(int i=0; i<fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }
    }
}