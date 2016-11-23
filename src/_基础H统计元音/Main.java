package _基础H统计元音;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		String str;
		int n;
		char c[];
		n = in.nextInt();
		str = in.nextLine();
		while(n > 0)
		{
			if(!map.isEmpty()) System.out.println();
			map.clear();
			str = in.nextLine();
			str = str.replace(" ", "");
			c = str.toCharArray();
			map.put('a', 0);map.put('e', 0);map.put('i', 0);map.put('o', 0);map.put('u', 0);
			for(int i = 0; i < c.length; i++)
			{
				if(c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u')
				{
					if(map.get(c[i]) != null) map.put(c[i], map.get(c[i])+1);
					else map.put(c[i], 1);
				}
				
			}
			for(Map.Entry<Character, Integer> entry : map.entrySet())
			{
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
			n--;
		}

	}
}

/*
 
 2
aeiou
my name is ignatius

 
 * */
