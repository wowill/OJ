package pat_1057;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str;
		int res = 0, cnt_one = 0, cnt_zero = 0;
		char c;
		str = in.nextLine();
		for(int i = 0; i < str.length(); i++)
		{
			c = str.charAt(i);
			if(c >= 'A' && c <= 'Z') res += c - 'A' + 1;
			if(c >= 'a' && c <= 'z') res += c - 'a' + 1;
		}
		while(res != 0)
		{
			if(res%2 == 0) cnt_zero++;
			else cnt_one++;
			res /= 2;
		}
		
		System.out.println(cnt_zero+" "+cnt_one);
	}
}