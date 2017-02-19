package _Ææ¹ÖµÄ·ÖÊÖ;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 0;
		Set<String> set = new HashSet<>();
		
		for(int i = 1; i < 10; i++){
			for(int j = 1; j < 10; j++){
				if(i != j){
					for(int k = 1; k < 10; k++){
						for(int l = 1; l < 10; l++){
							if(k != l){
//								System.out.println((double)i/j * (double)k /l - (double)(i*10+k)/(j*10+l));
								if(Math.abs((double)i/j * (double)k/l - (double)(i*10+k)/(j*10+l)) < 0.001 ){
									r++;
									System.out.println(i+"/"+j+" * "+k+"/"+l+"|| "+(double)i/j * (double)k/l+"  || "+(double)(i*10+k)/(j*10+l));
								}
							}
						}
					}
				}
			}
		}
		System.out.println(r);
	}

}
