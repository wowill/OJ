package _»ù´¡ILowestCommonMultiplePlus;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		int n, cnt, a[];
		while(in.hasNext())
		{
			n = in.nextInt();
			a = new int[n];
			int res = 0;
			int num;
			for(int i = 0; i < n; i++)
			{
				a[i] = in.nextInt();
				if(i != 0)
				{
					a[i] = lcm(a[i], a[i-1]);
				}
			}
			System.out.println(a[n-1]);
		}
	}
	
	static int gcd(int a, int b)  
	{  
	    return b == 0 ? a : gcd(b, a%b);  
	}  
	static int lcm(int a, int b)  
	{  
	    return a/gcd(a, b)*b;  
	}  
}
