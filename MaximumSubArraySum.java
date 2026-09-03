import java.util.Scanner;
public class MaximumSubArraySum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++){
			nums[i]=sc.nextInt();
		}
		int ans = maxSubarraySum(nums);
		System.out.print(ans);
	}
	private static int maxSubarraySum(int[] nums){
		int maxSum = Integer.MIN_VALUE;
		int currentSum=0;
		for(int num: nums){
			currentSum=Math.max(currentSum+num,num);
			maxSum = Math.max(maxSum,currentSum);
		}
		return maxSum;
	}
}