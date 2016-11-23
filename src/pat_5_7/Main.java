package pat_5_7;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		int n, k, i, x, sum = 0;
		n = in.nextInt();
		k = in.nextInt();
		for(i = 1; i <= n; i++)
		{
			x = in.nextInt();
			if(x < k) sum += x;
			else
			{
				sum += x;
				break;
			}
		}
		if(i > n )
			System.out.println("0");
		else
			System.out.println(sum);
			
	}
}

/*


*/