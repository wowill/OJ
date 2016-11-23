package bc_2;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		int t, n, k;
		String str;
		int[] res, a;
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		t = in.nextInt();
		while(t > 0)
		{
			map.clear();
			boolean flag = true;
			n = in.nextInt();
			res = new int[n+10];	
			int all = n;
			for(int i = 0; i < n; i++)
			{
				k = in.nextInt();
				if(map.get(k) == null)
				{
					map.put(k, 1);
				}
				else
				{
					map.put(k, map.get(k)+1);
				}
			}
			k = 0;
			while(flag)
			{
				flag = true;
				for(Integer v : map.values())
				{
					if(v%2 != 0)
					{
						flag = false;
					}
				
				}
				
				if(flag)
				{
					for(Integer i : map.keySet())
					{
						map.put(i, map.get(i)/2);
					}
					res[k++] = all/2;
					all = all/2;
				}
				
			}
			res[k] = n;
			Arrays.sort(res);
			System.out.print(res[res.length-k-1]);
			for(int i = res.length-k; i < res.length; i++)
					System.out.print(" "+res[i]);
			System.out.println();
			t--;
		}
	}
}

	
/*
1                         1
1+1+1                     3
qqq 3+2+1                 6
qqqq 4+3+2+1     		  10
qqqqq 5+4+3+2+1           15
*/