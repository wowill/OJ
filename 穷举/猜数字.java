package Çî¾Ù;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ²ÂÊý×Ö {

	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		ArrayList<String> list = new ArrayList<String>();
		for(int a = 1; a < 10; a++){
			for(int b = 1; b < 10; b++){
				for(int c = 1; c < 10; c++){
					for(int d = 1; d < 10; d++){
						for(int e = 1; e < 10; e++){
							for(int f = 1; f < 10; f++){
								for(int g = 1; g < 10; g++){
									for(int h = 1; h < 10; h++){
										for(int i = 1; i < 10; i++){
											if(a != b && a != c && a != d && a != e && a != f && a != g && a != h && a != i
													&& b != c && b != d && b != e && b != f && b != g && b != h && b != i
													&& c != d && c != e && c != f && c != g && c != h && c != i
													&& d != e && d != f && d != g && d != h && d != i
													&& e != f && e != g && e != h && e != i
													&& f != g && f != h && f != i
													&& g != h && g != i
													&& h != i){
												int x = a*10 + b;
												int y = c*10 + d;
												int w = e*10 + f;
												int u = g*100 + h*10 + i;
												if(x * y == w * u){
													if(list.contains(x+" * "+y+" = ") || list.contains(y+" * "+x+" = ")){
														
													}
													else{
														list.add(x+" * "+y+" = "+w+" * "+u);
													}
													
												}
											}
											
											
										}
									}
								}
							}
						}
					}
				}
			}
		}
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
	}

}
