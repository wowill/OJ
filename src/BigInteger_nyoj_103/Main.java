package BigInteger_nyoj_103;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int t;
		BigInteger x, y, res;
		Scanner in = new Scanner(System.in);
		t = in.nextInt();
		for(int i = 1; i <= t; i++)
		{
			x = in.nextBigInteger();
			y = in.nextBigInteger();
			res = x.add(y);
			System.out.println("Case "+i+":");
			System.out.println(x + " + " + y + " = " +res);
			
		}
	}
}
