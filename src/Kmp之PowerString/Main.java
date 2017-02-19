package Kmp֮PowerString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int maxn = 1001;
	static int next[];
//	static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
//	static int nextInt() throws IOException{in.nextToken(); return (int) in.nval;}
//	static String next() throws IOException{in.nextToken(); return (String)in.sval;}
	
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String str;
		char p[];
		int n;
		while(in.hasNext())
		{
			str = in.next();
			if(str.charAt(0) == '.') break;
			p = str.toCharArray();
			n = p.length;
			next = new int[n+1];
			GetNext(p);
			if(n % (n-next[n]) == 0)
				System.out.println(n/(n-next[n]));
			else
				System.out.println("1");
		}
	}
	
	static int GetNext(char p[])
	{
		int pLen = p.length;
		next[0] = -1;
		int k = -1;
		int j = 0;
		while(j < pLen)
		{
			if(k == -1 || p[k] == p[j])
			{
				++k;
				++j;
				next[j] = k;
			}
			else
				k = next[k];
		}
		return j;
	}
}



/*









*/