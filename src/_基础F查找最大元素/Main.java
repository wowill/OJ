package _基础F查找最大元素;

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
		int n;
		String str;
		Pattern p = Pattern.compile("^[A-Za-z_$]+[A-Za-z_$\\d]+$");
		Matcher m;
		n = in.nextInt();
		str = in.nextLine();
		while(n > 0)
		{
			boolean flag = false;
			str = in.nextLine();
			m = p.matcher(str);
			while(m.find())
			{
				flag = true;
				System.out.println("yes");
			}
			if(!flag) System.out.println("no");
			n--;
		}
	}
}
