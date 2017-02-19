package ¶þ·Ö²éÕÒ;
 

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static long cnt = 0;
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(a[k-1]);
	}
	
	
	
}


/*

5
2 4 5 3 1


2 4


*/
       