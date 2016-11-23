package ccf_2;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String str, s1;
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		str = in.nextLine();
		s1 = str;
		str = str.replace("-", "");
		int x = str.charAt(9)-'0';
		int sum = 0;
		for(int i = 0; i < 9; i++)
		{
			sum += (str.charAt(i)-'0')*(i+1);
		}
		int result = sum % 11;
		if(result == 10) result = 40;
		if(result == x )
			System.out.println("Right");
		else
		{
			if(result != 40)
				System.out.println(s1.substring(0, 12)+result);
			else
				System.out.println(s1.substring(0, 12)+"X");
		}
	}
}
