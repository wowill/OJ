package _调和级数;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 0, b = 0;
		while(a < 15.0){
			b++;
			a += 1/b;
			System.out.println("a: "+a+"      b:"+b );
		}
	}

}
