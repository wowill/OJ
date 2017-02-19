package _ÒûÁÏ»»¹º;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n, ans;
		n = sc.nextInt();
		ans = n;
		while(n >= 3){
			n -= 3;
			ans += 1;
			n++;
		}
		System.out.println(ans);
	}

}
