package _√›µƒŒ Ã‚;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double i = 2.5061841190150000;
		while(true){
			//
			i += 0.0000000000000001;
			
			x = Math.pow(i, i);
			System.out.println("i:"+i+"   ||x:"+x);
			String str = String.valueOf(x);
			if(str.contains("9999995")){
				System.out.println("i:"+i);
				break;
			}
		}
		
	}

}
