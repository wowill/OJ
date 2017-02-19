package _加法变乘法;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true){
			int a = (int) (1+Math.random()*48);
			int b = (int) (a+Math.random()*48);
			if(a == b){
				continue;
			}
			int sum = 0;
			for(int i = 1; i <= 49; i++){
				if(i == a-1){
					sum = sum + i*(i+1);
					i++;
					continue;
				}
				if(i == b-1){
					sum = sum + i*(i+1);
					i++;
					continue;
				}
				sum += i;
				
			}
			if(sum == 2015){
				System.out.println(a + "  |  "+b);
			}
		}
	}

}
