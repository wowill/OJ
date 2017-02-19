package _»ù´¡TÇ×ºÍÊý;

import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		int t, n, m, top;
		t = in.nextInt();
		while(t > 0)
		{
			int s1 = 1, s2 = 1;
			n = in.nextInt();
			m = in.nextInt();
			top = n;
			for(int i = 2; i < top; i++)
			{
				if(n%i == 0)
				{
					s1 += i;
					top = n/i;
					s1 += top;
				}
			}
			top = m;
			for(int i = 2; i < top; i++)
			{
				if(m%i == 0)
				{
					s2 += i;
					top = m/i;
					s2 += top;
				}
			}
			if(s1 == m && s2 == n) System.out.println("YES");
			else System.out.println("NO");
			t--;
		}

	}
}

/*

3 3 1 2 3 1 4 7
3 7 2 5 8 2 3 4 5 6 7 8 
0 0

*/