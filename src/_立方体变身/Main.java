package _立方体变身;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int cnt = 0;
		for(int i = 1; i < 2000; i++){
			long x = i * i * i;
			String s = String.valueOf(x);
			String[] sa = s.split("");
//			System.out.println(Arrays.toString(sa));
			long sum = 0;
			for(int j = 1; j <sa.length; j++){
				sum += Long.parseLong(sa[j]);
			}
			if(sum == i){
				cnt++;
				System.out.println(i+" => "+sum);
			}
		}
		System.out.println("cnt : "+cnt);
	}

}
