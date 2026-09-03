import java.util.Scanner;
public class BestTimeToBuyAndSellStock{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] prices = new int[n];
		for(int i =0;i<n;i++){
			prices[i] = sc.nextInt();
		}
		int ans = maxProfit(prices);
		System.out.print(ans);
	}
	private static int maxProfit(int[] prices){
		int maxProfit =0, minPrice=prices[0];
		for(int i=1;i<prices.length;i++){
			maxProfit = Math.max(maxProfit, prices[i] - minPrice);
			minPrice = Math.min(minPrice, prices[i]);
		}
		return maxProfit;
	}
}