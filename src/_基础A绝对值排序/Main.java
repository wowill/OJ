package _»ù´¡A¾ø¶ÔÖµÅÅÐò;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		Map<Integer, Integer> map = new TreeMap<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});
		Integer a[], n;
		String str;
		while(in.hasNext())
		{
			map.clear();
			n = in.nextInt();
			if(n == 0) break;
			a = new Integer[n];
			for(int i = 0; i < n; i++)
				a[i] = in.nextInt();
			for(int i = 0; i < a.length; i++) 
				map.put(Math.abs(a[i]), a[i]);
			str = "";
			for(Integer v : map.values()) str += v+" ";
			System.out.println(str.trim());
				
		}
	}
}
