package _����K����ͳ��;

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
		byte b[];
		int n;
		n = in.nextInt();
		str = in.nextLine();
		while(n > 0)
		{
			int cnt = 0;
			str = in.nextLine();
			b = str.getBytes();
			for(int i = 0; i < b.length; i++)
				if(b[i] < 0) cnt++;
			System.out.println(cnt/2);
			n--;
		}
	}
}

/*

10
WaHaHa! WaHaHa! ������ڲ�˵��Ҫ˵ֻ˵��ͨ��WaHaHa! WaHaHa!
���Ͼ�Ҫ��ĩ������Are you ready?
��


*/