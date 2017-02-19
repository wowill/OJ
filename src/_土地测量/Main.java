package _Õ¡µÿ≤‚¡ø;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double AB = 52.1;
		double EA = 33.4;
		double EB = 68.2;
		double BC = 57.2;
		double CD = 43.5;
		double DE = 51.9;
		double EC = 71.9;
		double s1, s2, s3;
		s1 = (AB+EB+EA)/2;
		s2 = (EB+EC+BC)/2;
		s3 = (EC+DE+CD)/2;
		double ans = Math.sqrt(s1*(s1-AB)*(s1-EB)*(s1-EA)) + Math.sqrt(s2*(s2-EB)*(s2-EC)*(s2-BC)) + Math.sqrt(s3*(s3-EC)*(s3-DE)*(s3-CD));
		System.out.println(ans);
	}

}
