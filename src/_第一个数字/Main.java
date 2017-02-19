package _第一个数字;

public class Main {
	public static void main(String[] args) {
		System.out.println(getFirstNum("1av24"));
		
	}
	
	public static int getFirstNum(String s)
	{
		if(s==null || s.length()==0) return -1;
		
		char c = s.charAt(0);
		if(c>='0' && c<='9') return c-'0';
		
		return getFirstNum(s.substring(1));  //填空
	}
}
