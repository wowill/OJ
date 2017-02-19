package _基础B发工资啦;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		int a[] = {100, 50, 10, 5, 2, 1};
		int n, cnt, num;
		while(in.hasNext())
		{
			cnt = 0;
			n = in.nextInt();
			if(n == 0) break;
			for(int i = 0; i < n; i++)
			{
				num = in.nextInt();
				for(int j = 0; j < 6; j++)
				{
					while(num >= a[j])
					{
						num -= a[j];
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}
}
