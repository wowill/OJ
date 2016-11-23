package _»ù´¡WÃÜÂë;

import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		int t, n, m, top;
		String str;
		char c[];
		t = in.nextInt();
		in.nextLine();
		while(t > 0)
		{
			int cnt = 0;
			boolean f1 = false, f2 = false, f3 = false, f4 = false;
			str = in.nextLine();
			c = new char[str.length()];
			c = str.toCharArray();
			for(int i = 0; i < c.length; i++)
			{
				if(!f1 && Character.isLowerCase(c[i]))
				{
					cnt++;
					f1 = true;
				}
				if(!f2 && Character.isDigit(c[i]))
				{
					cnt++;
					f2 = true;
				}
				if(!f3 && Character.isUpperCase(c[i]))
				{
					cnt++;
					f3 = true;
				}
				if(!f4 && (c[i] == '~' || c[i] == '!' || c[i] == '@' || c[i] == '#' || c[i] == '$' || c[i] == '%' || c[i] == '^'))
				{
					cnt++;
					f4 = true;
				}
			}
			if(cnt >= 3 && str.length() >= 8 && str.length() < 16)
				System.out.println("YES");
			else
				System.out.println("NO");
			t--;
		}

	}
}

/*

3
a1b2c3d4
Linle@ACM
^~^@^@!%


*/