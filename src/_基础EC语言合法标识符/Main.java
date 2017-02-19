package _基础EC语言合法标识符;

import java.io.BufferedInputStream;
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
		String str, maxS;
		char c[], maxC = 'A';
		while(in.hasNext())
		{
			str = in.nextLine();
			c = str.toCharArray();
			Arrays.sort(c);
			maxC = c[c.length-1];
			maxS = String.valueOf(maxC);
			System.out.println(str.replace(maxS, maxS+"(max)"));
		}
	}
}
