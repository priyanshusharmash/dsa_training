import java.util.Scanner;
import java.util.Arrays;

public class SortArrayByParityII{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++) nums[i] = sc.nextInt();
		int[] ans = sortArrayByParityII(nums);
		System.out.print(Arrays.toString(ans));
	}
	private static int[] sortArrayByParityII(int[] nums) {
		int[] ans = new int[nums.length];
		int odd =1,even =0;
		for(int num:nums){
			if(num%2 == 0) {
				ans[even] = num;
				even+=2;
			}
			else {
				ans[odd] = num;
				odd+=2;
			}
		}
		return ans;
	}
}