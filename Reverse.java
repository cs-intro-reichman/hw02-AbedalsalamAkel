public class Reverse {
public static void main (String[] args){
String x = args[0];
int n = x.length();
for (int i = 0; i < n; i++) {
System.out.print(x.charAt((n - i) - 1)); }
System.out.println(""); if ((n%2) == 0) {
n--; }
System.out.println("The middle character is " + (x.charAt(n / 2))); }
}
