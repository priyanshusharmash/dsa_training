import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class KidsWithTheGreatestNumberOfCandies{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] candies = new int[n];
		for(int i =0;i<n;i++){
			candies[i] = sc.nextInt();
		}
		int extraCandies = sc.nextInt();
		List<Boolean> ans = kidsWithCandies(candies,extraCandies);
		System.out.println(ans.toString());
	}
	private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
		List<Boolean> ans = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		for(int i =0;i<candies.length;i++){
			max = Math.max(max,candies[i]);
		}
		int current;
		for(int i =0;i<candies.length;i++){
			current = candies[i]+extraCandies;
			if(current>=max) ans.add(true);
			else ans.add(false);
		}
		return ans;
	}
}