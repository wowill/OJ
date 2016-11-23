package pat_J1001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		Scanner in = new Scanner(System.in);
		String str ;
//		double a = in.nextDouble();
//		double b = in.nextDouble();
		
		str = br.readLine();
		String temp[] = str.split(" ");
		double a = Double.parseDouble(temp[0]);
		double b = Double.parseDouble(temp[1]);
		double sum = a + b;
		Locale locale = new Locale("en", "EN");
		NumberFormat nf = NumberFormat.getIntegerInstance(locale);
		System.out.println(nf.format(sum));
		
		
	}
}
