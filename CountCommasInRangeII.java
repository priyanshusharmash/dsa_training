import java.util.Scanner;
public class CountCommasInRangeII{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans = countCommas(n);
		System.out.print(ans);
	}
	private static long countCommas(long n){
		if(n<1000) return 0;
		long start = 1000, temp = n/1000,ans=0;
		while(temp!=0){
			ans+=(n-start)+1;
			start *= 1000;
			temp/=1000;
		}
		return ans;
	}
}