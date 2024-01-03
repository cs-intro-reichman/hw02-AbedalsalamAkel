public class Reverse {
    public static void main(String[] args) {
       
        String a = args[0];
        String r = "";

       
        for (int i = a.length() - 1; i >= 0; i--) {
            r += a.charAt(i);
        }

       
        System.out.println(r);

        if (a.length() > 0) {
            char middleCharacter = a.charAt(a.length() / 2);
            System.out.println("The middle character is " + middleCharacter);
        }
    }
}
