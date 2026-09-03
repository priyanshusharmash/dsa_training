import java.util.Scanner;
public class GreatestCommonDivisor{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = gcd(a,b);
		System.out.println(ans);
	}
	/*
	private static int gcd(int a, int b){
		int lowest = Math.min(a,b);
		int gcd=1;
		for(int i =2;i<=lowest;i++){
			if(a%i==0 && b%i==0) gcd = i;
		}
		return gcd;
	}
	*/
	//optimized method
	private static int gcd(int a, int b){
		while(a!= 0){
			int tmp = a;
			a= b %a;
			b  = tmp;
		}
		return b;
	}
}