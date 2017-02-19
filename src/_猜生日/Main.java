package _²ÂÉúÈÕ;

public class Main {
	public static void main(String[] args) {
		long cur = 20120312;
		long ans = 0;//00000600
		long start = 19000600;
		for(long i = start; i < cur; i++){
			if(String.valueOf(i).charAt(5)=='6' && String.valueOf(i).charAt(4)=='0' && i % 2012 == 0 && i % 3 == 0 && i % 12 ==0){
				System.out.println(i);
			}
		}
	}
}
