package _»ù´¡MÑî»ÔÈý½Ç;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		int n, a[][];
		String str;
		while(in.hasNext())
		{
			str = "";
			n = in.nextInt();
			a = new int[n+1][n+1];
			for(int i = 1; i <= n; i++)
			{
				str = "";
				for(int j = 1; j <= i; j++)
				{
					if(j == 1 || j == i) a[i][j] = 1;
					else
						a[i][j] = a[i-1][j-1] + a[i-1][j];
					str += a[i][j] + " ";
				}
				System.out.println(str.trim());
			}
			System.out.println();
		}
	}
}
