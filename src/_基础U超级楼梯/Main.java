package _»ù´¡U³¬¼¶Â¥Ìİ;

import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	static int type = 0, n;
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		int t, a[] = new int[41];
		t = in.nextInt();
		while(t > 0)
		{
			type = 0;
			n = in.nextInt();
//			fact(1);
			a[1] = 1;
			a[2] = 1;
			for(int i = 3; i < 41; i++)
				a[i] = a[i-1] + a[i-2];
			
			System.out.println(a[n]);
			t--;
		}

	}
	static void fact(int num)
	{
		if(num > n) return ;
		if(num == n-1)
		{
			type++;
			return ;
			
		}
		
		fact(num+1);
		fact(num+2);
		return ;
	}
}

/*




*/