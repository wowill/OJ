package pat_5_10;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		ArrayList<String> list = new ArrayList<String>();
		int n = 7, row;
		row = n/2;
		String str = "";
		for(int i = 1; i <= row; i++)
		{
			str = "";
			for(int j = i; j <= row+2; j++)
				str += " ";
			for(int j = 1; j <= 2*i-1; j++)
				str += "*";
			list.add(str);
			System.out.println(str);
		}
		str = "  ";
		for(int i = 1; i <= (n/2+1)*2-1; i++)
		{
			str += "*";
		}
		System.out.println(str);
		
		for(int i = list.size()-1; i >= 0; i--)
			System.out.println(list.get(i));
	}
}

/*


*/