package _基础V不容易系列之二;

import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		int t, n;
		t = in.nextInt();
		while(t > 0)
		{
			n = in.nextInt();
			System.out.println(sheep(n));
			t--;
		}

	}
	static int sheep(int num)
	{
		if(num == 1)
		{
			return (3-1)*2;
		}
		return (sheep(num-1)-1)*2;
	}
}

/*

3
a1b2c3d4
Linle@ACM
^~^@^@!%


*/