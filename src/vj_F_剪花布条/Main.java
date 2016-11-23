package vj_F_¼ô»¨²¼Ìõ;

import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		String str, s[];
		char[] c;
		int cnt;
		while(in.hasNext())
		{
			cnt = 0;
			str = in.nextLine();
			if(str.equals("#")) break;
			s = str.split(" ");
//			if(s[1].)
			s[0] = s[0].replaceAll(s[1], " ");
			c = s[0].toCharArray();
			for(int i = 0; i < c.length; i++)
			{
				if(c[i] == ' ') cnt++; 
			}
			System.out.println(cnt);
		}
	}
}

/*


*/



