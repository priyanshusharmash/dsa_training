import java.util.Scanner;

public class ArrangingCoins{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int coins = sc.nextInt();
		int ans = arrangeCoins(coins);
		System.out.print(ans);
	}
	private static int arrangeCoins(int n) {
		int low = 0, high = n,mid, ans =0;
		while(low<=high){
			mid = low + (high-low)/2;
			long cal = (long) mid * (mid + 1) / 2;;
			if(cal<=n){
				ans = mid;
				low = mid+1;
			}else high=mid-1;
		}
		return ans;
	}
}