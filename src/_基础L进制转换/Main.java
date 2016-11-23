package _基础L进制转换;

import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	static String c[] = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		int a, b;
		while(in.hasNext())
		{
			a = in.nextInt();
			b = in.nextInt();
			toChange(a, b);
		}

	}
	static void toChange(int src, int dis)
	{
		String str = "";
		StringBuffer sb;
		int i = 0;
		int num = Math.abs(src);
		while(num > 0)
		{
			str += c[num%dis];
			num /= dis;
		}
		if(src < 0) str += "-";
		sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}
}

/*

3
a1b2c3d4
Linle@ACM
^~^@^@!%


*/