package _基础P人见人爱A的B次方;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		int n, a[], b[], t, r[];
		n = in.nextInt();
		while(n > 0)
		{
			a = new int[3];
			b = new int[3];
			r = new int[3];
			for(int i = 0; i < 3; i++) a[i] = in.nextInt();
			for(int i = 0; i < 3; i++) b[i] = in.nextInt();
			for(int i = 2; i >= 0; i--)
			{
					if(i- 1 >= 0) 
					{
						r[i] += (a[i] + b[i])%60;
						r[i-1] += (a[i] + b[i])/60;
					}
					else
					{
						r[i] += (a[i] + b[i]);
					}
			}
			System.out.print(r[0]);
			for(int i = 1; i < 3; i++)
			{
				System.out.print(" "+r[i]);
			}
			System.out.println();
			n--;
		}
	}
}

/*

2
1 2 3 4 5 6
34 45 56 12 23 34

*/