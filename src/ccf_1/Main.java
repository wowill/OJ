package ccf_1;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a[];
		int n, x;
		int maxVal = 0, maxIndex = Integer.MAX_VALUE;
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		n = in.nextInt();
		a = new int[10001];
		for(int i = 0; i < n; i++)
		{
			x = in.nextInt();
			a[x]++;
			if(maxVal <= a[x])
			{
				maxVal = a[x];
				if(i == 0 || a[maxIndex] < maxVal ||  maxIndex > x)
					maxIndex = x;
			}
		}
		System.out.println(maxIndex);
	}
}

/*



 */



