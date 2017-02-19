package pat_5_5;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		int a[], n, sum = 0;
		n = in.nextInt();
		a = new int[n];
		for(int i = 0; i < n; i++)
		{
			a[i] = in.nextInt();
		}
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				for(int k = 0; k < n; k++)
				{
					if(i!=j && i!=k && j != k)
						sum += a[i]*100 + a[j]*10 + a[k];
 				}
			}
		}
			
		System.out.println(sum);
	}
}

/*


*/