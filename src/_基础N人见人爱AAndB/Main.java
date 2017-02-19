package _基础N人见人爱AAndB;

import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		BigInteger a = in.nextBigInteger();
		BigInteger b = in.nextBigInteger();
		BigInteger r;
		String str;
		while(!a.toString().equals("0") && !b.toString().equals("0"))
		{
			
			r = a.pow(b.intValue());
			str = r.toString();
			
			if(str.length() > 3)
			{
				str = str.substring(str.length()-3);
				System.out.println(Integer.parseInt(str));
			}
			else System.out.println(str);
			
			a = in.nextBigInteger();
			b = in.nextBigInteger();
		}
	}
}

/*

2 3
12 6
6789 10000
0 0

*/