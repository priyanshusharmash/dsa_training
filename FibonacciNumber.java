import java.util.Scanner;
public class FibonacciNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = fibNumber(n);
		System.out.println(ans);
	}
	/*
	private static int fibNumber(int n){
		if(n ==0) return 0;
		if(n<3) return 1;
		int a =0,b=1,c;
		for(int i =2;i<=n; i++){
			c=a+b;
			a=b;
			b=c;
		}
		return b;
	}
	*/
	private static int fibNumber(int n){
		if(n<2) return n;
		return fibNumber(n-1)+ fibNumber(n-2);
	}
}