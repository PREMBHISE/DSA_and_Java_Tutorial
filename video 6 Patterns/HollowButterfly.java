public class HollowButterfly {
    public static void main(String[] args) {
        int n = 5;

        // upper side
        for (int i = 1; i <= n; i++) {
            // left side
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            
                }
                //space
            for (int j =1; j<=2 * (n-i); j++) {
                System.out.print(" ");
            }
            //right side
            for(int j=1; j<=i; j++) {
                if(j == 1 || j == i) 
                    System.out.print("*");   
                else
                    System.out.print(" ");        
            }
            System.out.println();
        }

        //Lower Part
         for (int i = n; i >= 1; i--) {
            // left side
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            
                }
                //space
            for (int j =1; j<=2 * n-i; j++) {
                System.out.print(" ");
            }
            //right side
            for(int j=i; j>=1; j--) {
                if(j == i || j == 1) 
                    System.out.print("*");   
                else
                    System.out.print(" ");        
            }
          System.out.println();  
        }
    }
}