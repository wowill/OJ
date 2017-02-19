package ×Ö·û´®ÅÅÐò´¦ÀíAnanagrams;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String str, slow;
		char a[];
		Map<String, String> map = new TreeMap<>();
		Set<String> set = new TreeSet<>();
		while(in.hasNext())
		{
			str = in.next();
			if(str.equals("#")) break;
			
			slow = str.toLowerCase();
			a = slow.toCharArray();
			Arrays.sort(a);
			slow = String.valueOf(a);
			
			if(map.containsKey(slow)) 
			{
				map.remove(slow);
				set.add(slow);
			}
			else
				map.put(slow, str);
		}
		for(String k : set)
			if(map.containsKey(k)) map.remove(k);
		set.clear();
		for(String v : map.values()) set.add(v);
		for(String v : set) System.out.println(v);
			
	}
}

/*

ladder came tape soon leader acme RIDE lone Dreis peat
 ScAlE orb  eye  Rides dealer  NotE derail LaCeS  drIed
noel dire Disk mace Rob dries
#

*/