package 贪心之填充正方形;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	static StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
	static int nextInt() throws IOException{st.nextToken(); return (int) st.nval;}
	static double nextDouble() throws IOException{st.nextToken(); return st.nval;}
	static String next() throws IOException{st.nextToken(); return st.sval;}
	static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	
	public static void main(String[] args) throws IOException {
		
		int t = nextInt();
		char[][] grid = new char[11][11];
		for(int i = 0; i < t; i++)
		{
			int n = nextInt();
			for(int j = 0; j < n; j++)
				for(int k = 0; k < n; k++)
					grid[j][k] = next().charAt(0);
			for(int j = 0; j < n; j++)
				for(int k = 0; k < n; k++)
					if(grid[j][k] == '.')
						for(char ch = 'A'; ch <= 'Z'; ch++)
						{
							boolean ok = true;
							if(k > 0 && grid[j][k - 1] == ch) ok = false;
							if(k < n-1 && grid[j][k + 1] == ch) ok = false;
							if(j > 0 && grid[j - 1][k] == ch) ok = false;
							if(j < n - 1 && grid[j+1][k] == ch) ok = false;
							if(ok)
							{
								grid[j][k] = ch;
								break;
							}
						}
			System.out.println("Case " + i + ":");
			for(int j = 0; j < n; j++)
			{
				for(int k = 0; k < n; k++)
					System.out.print(grid[j][k]);
				System.out.println();
			}
		}
	}

}


/*



*/