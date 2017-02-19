package _ÈıÑòÏ×Èğ;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1 = 0, a2 = 0, a3 = 0, a4 = 0;
		int b1 = 0, b2 = 0, b3 = 0, b4 = 0;
		int x = 1;
		while(true){
			a1 = (int) (Math.random()*10);
			a2 = (int) (Math.random()*10);
			a3 = (int) (Math.random()*10);
			a4 = (int) (Math.random()*10);
			b1 = (int) (Math.random()*10);
			b2 = (int) (Math.random()*10);
			b3 = (int) (Math.random()*10);
			b4 = (int) (Math.random()*10);
			x = (int) (Math.random()*10);
			if(a1 == b1 || a1 == b2 || a1 == b3 || a1 == b4 || a2 == b1 || a2 == b2 || a2 == b3 || a3 == b1|| a3 == b2 || a3 == b3 || a3 == b4 || a4 == b1||a4==b2||a4==b3||a4==b4){
				continue;
			}
			if(x == a1 ||x == a2 ||x==a3||x==a4||x==b1||x==b2||x==b3||x==b4){
				continue;
			}
			if(a1*1000+a2*100+a3*10+a4+b1*1000+b2*100+b3*10+b4 == b1*10000+b2*1000+a3*100+a2*10+x && a1 != 0 && b1 != 0 && a2 == b4 && a1 != a2 && a1 != a3 && a1 != a4 && a2 != a3 && a2 != a4 && a3 != a4 && b1 != b2 && b1 != b3 && b1 != b4 && b2 != b3 && b2 != b4 && b3 != b4 ){
				int num1 = a1*1000+a2*100+a3*10+a4;
				int num2= b1*1000+b2*100+b3*10+b4;
				int num3 = b1*10000+b2*1000+a3*100+a2*10+x;
				System.out.println(num1+" + "+num2+" = "+num3);
//				break;
			}
		}
		
	}

}
