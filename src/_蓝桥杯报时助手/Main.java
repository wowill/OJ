package _¿∂«≈±≠±® ±÷˙ ÷;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	static StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
	static int nextInt() throws IOException{st.nextToken(); return (int) st.nval;}
	static double nextDouble() throws IOException{st.nextToken(); return st.nval;}
	static String next() throws IOException{st.nextToken(); return st.sval;}
	static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	
	public static void main(String[] args) {
		
		String sa[] = {"zero", "one", "two", "three", "four", "five",
				"six", "seven", "eight", "nine", "ten", "eleven", "twelve",
				"thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
		String sb[] = {"", "", "twenty", "thirty", "forty", "fifty"};
		String hour, minute;
		hour = sc.next();
		minute = sc.next();
		int hout_int, minute_int;
		hout_int = Integer.parseInt(hour);
		minute_int = Integer.parseInt(minute);
		if(hout_int <= 20){
			hour = sa[hout_int];
		}
		else{
			hour = "twenty " + sa[hour.charAt(1) - '0'];
		}
		if(minute_int <= 20){
			minute = sa[minute_int];
		}
		else{
			minute = sb[minute.charAt(0) - '0'] + " " + sa[minute.charAt(1) - '0'];
		}
		if(minute_int == 0){
			
			System.out.println(hour + " o'clock");
		}
		else{
			System.out.println(hour + " " + minute);
		}
	}

}
