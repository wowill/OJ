package vj_A_Andys_First_Dictionary;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
//		Scanner in = new Scanner(new BufferedInputStream(new FileInputStream("D:\\Data.txt")));
		String str = "";
		Set<String> set = new TreeSet<>();
		Pattern p;
		while(in.hasNextLine())
		{
			str += in.nextLine()+" ";
		}
		str = str.toLowerCase();
		p = Pattern.compile("[a-z]*");
		Matcher m = p.matcher(str);
		while(m.find())
		{
			set.add(m.group());
		}
		for(String s : set)
		{
			if(s.length() == 0) continue;
			System.out.println(s);
		}
	}
}

/*
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
//		Scanner in = new Scanner(new BufferedInputStream(System.in));
		Scanner in = new Scanner(new BufferedInputStream(new FileInputStream("D:\\Data.txt")));
		String str;
		Set<String> set = new TreeSet<>();
		while(in.hasNextLine())
		{
			str = in.nextLine();
			str = str.toLowerCase();
			str = str.replace("[^a-z]*", " ");
			String[] s = str.split(" ");
			for(int i = 0; i < s.length; i++)
			{
				set.add(s[i]);
			}
		}
		for(String s1 : set)
		{
			if(s1.length() == 0) continue;
			System.out.println(s1);
		}
	}
}
*/