public class DamkaBoard {
    public static void main(String[] args) {
    int x = Integer.parseInt(args[0]); 
        String z = "*";
    for (int i = 1; i < x; i++) {
        z = z + " *"; }
        for (int j = 0; j < x; j++)     { if ((j%2) == 0) {
    System.out.println(z + " "); }     
        else {
                    System.out.println(" " + z); }
    }     }
}

