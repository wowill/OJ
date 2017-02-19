package pat_5_15;

import java.io.BufferedInputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		Map<String, String> map = new TreeMap<String, String>();
		String str = "";
		int n;
		n = in.nextInt();
		str = in.nextLine();
		for(int i = 0; i < n; i++)
		{
			str = in.nextLine();
			map.put(str.split(" ")[1], str);
		}
		for(String s : map.values())
		{
			System.out.println(s);
		}
		
	}
}

/*


*/