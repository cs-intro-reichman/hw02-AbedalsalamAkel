/*
#feedback
1. Try to use a meaningful names for variable. for example in this code:
n_next instead of n2
2. beside that,
great written code!
*/

public class InOrder {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 10); 
        System.out.print(n); 
        while (true) {
            int n2 = (int) (Math.random() * 10); 
            
            if (n2 >= n) {
                System.out.print(" " + n2); 
                
              n = n2 ; 
            } else {
                
                break;
            }
        }

        System.out.println(); 
    }
}
