package _»ù´¡SÈý½ÇÐÎ;

import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		int t, n;
		Double a, b, c;
		t = in.nextInt();
		while(t > 0)
		{
			a = in.nextDouble();
			b = in.nextDouble();
			c = in.nextDouble();
			if(a+b > c && a+c > b && b+c > a) System.out.println("YES");
			else System.out.println("NO");
			t--;
		}

	}
}

/*

3
a1b2c3d4
Linle@ACM
^~^@^@!%


*/