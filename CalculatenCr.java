import java.util.Scanner;
public class CalculatenCr{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int ans = calculateNCR(n,r);
		System.out.println(ans);
	}
	
	private static int calculateNCR(int n, int r){
		if(r>n) return 0;
		r = Math.min(r,n-r);
		long ans = 1;
		for(int i =1;i<=r;i++){
			ans = ans * (n-i+1)/i;
		}
		return (int) ans;
	}
	
}