public class Divisors {
	public static void main (String[] args) {
		int y = Integer.parseInt(args[0]);
		int x = 1 ;
		while ( x <= y ){
		if ( y % x == 0 ) 
			{System.out.println(x);}
				x++ ;}
		
	}
}
