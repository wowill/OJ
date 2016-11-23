package bc_1;

import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		int t;
		long cnt;
		String str;
		Pattern p = Pattern.compile("[q]+");
		Matcher m;
		t= in.nextInt();
		str = in.nextLine();
		while(t > 0)
		{
			cnt = 0;
			str = in.nextLine();	
			m = p.matcher(str);
			while(m.find())
			{
//				System.out.println(m.group().length());
				cnt += fact(m.group().length());
			}
			System.out.println(cnt);
			t--;
		}
	}
	static long fact(int n)
	{
		int num = 0;
		if(num == 1) return 1;
		for(int i = n; i > 0; i--) num += i;
		return num;
	}
}

	
/*
1                         1
1+1+1                     3
qqq 3+2+1                 6
qqqq 4+3+2+1     		  10
qqqqq 5+4+3+2+1           15
*/