package BigInteger_nyoj_45;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BigInteger res;
		int n, k;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		for (int i = 0; i < n; i++)
		{
			res = BigInteger.valueOf(2);
			k  = in.nextInt();
			res = res.pow(2*k);
			res = res.subtract(BigInteger.ONE);
			res = res.divide(BigInteger.valueOf(3));
			System.out.println(res);
		}
	}
}
