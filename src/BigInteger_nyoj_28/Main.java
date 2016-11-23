package BigInteger_nyoj_28;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger x, y;
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		long start = System.currentTimeMillis();
		x = BigInteger.valueOf(1);
		for(int i = 1; i <= n; i++)
		{
			y =  BigInteger.valueOf(i);
			x = x.multiply(y);
		}
		System.out.println(x);
		long end = System.currentTimeMillis();
//		Float time = (float) ((end-start)/1000);
		long runTime = end - start;
		System.out.println(runTime);
		
	}

}
