package _·ÅÂó×Ó;

import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		BigInteger n, ans = BigInteger.ZERO;
		BigInteger base = BigInteger.valueOf(2);
		for(int i = 0; i < 64; i++){
			ans = ans.add(base.pow(i));
		}
		System.out.println(ans);
	}
}
