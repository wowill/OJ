package _基础X一直小蜜蜂;

import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	static int type = 0, n;
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		int t, a, b;
		long r[] = new long[51];
		t = in.nextInt();
		r[1] = 1; 
		r[2] = 2;
		for(int i = 3; i < 51; i++)
			r[i] = r[i-1] + r[i-2];
		while(t > 0)
		{
			a = in.nextInt();
			b = in.nextInt();
			System.out.println(r[b-a]);
			t--;
		}

	}
}

/*




*/