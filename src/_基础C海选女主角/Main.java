package _基础C海选女主角;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		int n, m, temp;
		while(in.hasNext())
		{
			m = in.nextInt();
			n = in.nextInt();
			int maxI = 0, maxJ = 0, maxV = 0;
			for(int i = 1; i <= m; i++)
			{
				for(int j = 1; j <= n; j++)
				{
					temp = in.nextInt();
					if(Math.abs(maxV) < Math.abs(temp))
					{
						maxV = temp;
						maxI = i;
						maxJ = j;
					}
				}
			}
			System.out.println(maxI+" "+maxJ+" "+maxV);
		}
		
		
	}
}
