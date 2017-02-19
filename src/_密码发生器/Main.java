package _ÃÜÂë·¢ÉúÆ÷;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = sc.nextInt();
		String str = "";
		for(int i = 0; i < n; i++){
			str = sc.next();
			int cnt;
			int a[] = new int[6];
			int ans[] = new int[6];
			if(str.length() % 6 == 0){
				cnt = str.length() / 6;
			}
			else{
				cnt = str.length() / 6 + 1;
			}
			String sa[] = new String[cnt];
			int len = str.length();
			int k = 0;
			for(int j = 0; j < cnt; j++){
				if(j != cnt - 1){
					sa[j] = str.substring(k, k+6);
				}
				else{
					sa[j] = str.substring(k);
				}
				k += 6;
			}
			
			for(int l = 0; l < 6; l++){
				a[l] = 0;
				for(int j = 0; j < cnt; j++){
					if(sa[j].length() >= l+1){
						a[l] += sa[j].charAt(l);
					}
				}
				String s = String.valueOf(a[l]);
				char c[] = s.toCharArray();
				if((c[0]-'0') + (c[1]-'0') +(c[2]-'0') > 9){
					int ta = (c[0]-'0') + (c[1]-'0') +(c[2]-'0');
					s = String.valueOf(ta);
					ta = (s.charAt(0)-'0') + (s.charAt(1)-'0');
					System.out.print(ta);
				}
				else{
					System.out.print((c[0]-'0') + (c[1]-'0') +(c[2]-'0'));
				}
				
			}
			System.out.println();
		}
	}

}
