public class Strings{
    public static void main(String[] args) {

        // StringBuilder sb = new StringBuilder("Apna College");
        //     System.out.println(sb);

        // StringBuilder sb = new StringBuilder("Tony") ;
        //     //Set Char
        //     System.out.println(sb.charAt(0));

        //     //Get Char
        //     sb.setCharAt(0, 'P');
        //     System.out.println(sb);

        //     //Insert Char
        //     sb.insert(0, 'S');
        //     System.out.println(sb);

        //insert Char
        StringBuilder sb = new StringBuilder("Tony");

            sb.insert(2, 'n');
            System.out.println(sb);

        //Delete char
        sb.delete(2, 3);
        System.out.println(sb);

        //Append char means to add somthing at the end
        sb.append(" Stark");
        System.out.println(sb);

        System.out.println(sb.length());
    }
}