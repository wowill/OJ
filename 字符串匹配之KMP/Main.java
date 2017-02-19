package ×Ö·û´®Æ¥ÅäÖ®KMP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
	static int maxn = 50000;
	static int next[] = new int[maxn];
	static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
	static int nextInt() throws IOException{in.nextToken(); return (int) in.nval;}
	static String next() throws IOException{in.nextToken(); return in.sval;}
	
	public static void main(String[] args) throws IOException {
	
		
	}
	
	static void GetNext(char p[], int next[])
	{
		int pLen = p.length;
		next[0] = -1;
		int k = -1;
		int j = 0;
		while(j < pLen - 1)
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
		}
		if(j == pLen) 
			return i - j;
		else 
			return -1;
	}
	
}



/*









*/