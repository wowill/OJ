package Kmp÷ÆºÙª≠≤ºÃı;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Scanner;

public class Main {
	static int maxn = 1001;
	static int next[] = new int[maxn];
//	static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
//	static int nextInt() throws IOException{in.nextToken(); return (int) in.nval;}
//	static String next() throws IOException{in.nextToken(); return (String)in.sval;}
	
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String ps, ss, str;
		char p[], s[];
		
		while(in.hasNext())
		{
			ss = in.next();
			if(ss.charAt(0) == '#') break;
			ps = in.next();
			s = ss.toCharArray();
			p = ps.toCharArray();
			GetNext(p);
			System.out.println(KmpSearch(s, p));
			
		}
		
	}
	
	static void GetNext(char p[])
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
	}
	
	static int KmpSearch(char s[], char p[])
	{
		int i = 0;
		int j = 0;
		int cnt = 0;
		int sLen = s.length;
		int pLen = p.length;
		while(i < sLen && j < pLen)
		{
			if(j == -1 || s[i] == p[j])
			{
				i++;
				j++;
			}
			else
				j = next[j];
			if(j == pLen)
			{
				j = 0;
				cnt++;
			}
		}
		return cnt;
	}
	
}



/*









*/