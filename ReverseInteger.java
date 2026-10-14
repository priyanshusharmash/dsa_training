import java.util.Scanner;

public class ReverseInteger{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		int n = sc.nextInt();
		int ans = reverse(n);
		System.out.print(ans);
	}
	private static int reverse(int x) {
		int ans =0;
		while(x!=0){
			if((long)ans*10 > Integer.MAX_VALUE || (long)ans*10 < Integer.MIN_VALUE) return 0;
			ans = (ans*10)+(x%10);
			x/=10;
		}
		return ans;
	}
}