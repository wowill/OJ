package _»ù´¡JPalindromesEasyVersion;

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
		String str;
		StringBuffer sb = new StringBuffer();
		StringBuilder sc;
		int n;
		n = in.nextInt();
		str = in.nextLine();
		while(n > 0)
		{
			str = in.nextLine();
			sb.append(str);
			if(str.equals(sb.reverse().toString()))
				System.out.println("yes");
			else
				System.out.println("no");
			n--;
			sb.delete(0, sb.length());
		}
	}
}

/*

4
level
abcde
noon
haha


*/