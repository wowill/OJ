package BigInteger_nyoj_73;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BigInteger x, y;
		Scanner in = new Scanner(System.in);
		x = in.nextBigInteger();
		y = in.nextBigInteger();
		while(!x.equals(BigInteger.ZERO) && !y.equals(BigInteger.ZERO))
		{
			if(x.compareTo(y) > 0) System.out.println("a>b");
			else if(x.compareTo(y) < 0) System.out.println("a<b");
			else System.out.println("a==b");
			x = in.nextBigInteger();
			y = in.nextBigInteger();
			
		}
	}
}
