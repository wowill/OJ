package _基础G首字母变大写;

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
		String str, s[];
		while(in.hasNext())
		{
			str = in.nextLine();
			s = str.split(" ");
			for(int i = 0; i < s.length; i++)
			{
				
				s[i] = String.valueOf(s[i].charAt(0)).toUpperCase() + s[i].substring(1);
				if (i == 0)
					System.out.print(s[i]);
				else
					System.out.print(" "+s[i]);;
			}
			System.out.println();
		}
	}
}
