package _蓝桥杯之时间转换;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = sc.nextInt();
		int h, m, s;
		h = t / 3600;
		t -= h * 3600;
		m = t / 60;
		t -= m * 60;
		s = t;
		System.out.println(h+":"+m+":"+s);
	}

}
