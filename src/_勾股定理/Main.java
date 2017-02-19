package _π¥π…∂®¿Ì;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		int n, cnt = 0;
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		st.nextToken(); n = (int) st.nval;
		for(double i = 1; i < 1.0*n/Math.sqrt(2); i++){
			double a = Math.sqrt(n*n-i*i);
			
			if(a == (int)a){
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
