package nyoj_27;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	static int n, r, a[];
	static void dfs(int top, int v)
	{
		if(v == 0)
		{
			for(int i = r; i > 0; i--)
			{
				System.out.print(a[i]);
			}
			System.out.println();
			return ;
		}
		else
		{
			for(int i = top; i >= v; i--)
			{
				a[v] = i;
				dfs(i-1, v-1);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		n = in.nextInt();
		r = in.nextInt();
		a = new int[10];
		dfs(n, r);
			
	}
}

/*


*/