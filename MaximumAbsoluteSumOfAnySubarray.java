import java.util.Scanner;
public class MaximumAbsoluteSumOfAnySubarray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++){
			nums[i] = sc.nextInt();
		}
		int ans = maxAbsSum(nums);
		System.out.print(ans);
	}
	private static int maxAbsSum(int[] nums){
		int positiveCurrentSum = 0;
		int positiveMaxSum =0;
		int negativeCurrentSum =0;
		int negativeMaxSum =0;
		for(int num:nums){
			positiveCurrentSum = Math.max(positiveCurrentSum+num,num);
			positiveMaxSum = Math.max(positiveMaxSum,positiveCurrentSum);
			
			negativeCurrentSum = Math.min(negativeCurrentSum, num);
			negativeMaxSum = Math.min(negativeMaxSum, negativeCurrentSum);
		}
		return Math.max(Math.abs(negativeMaxSum), positiveMaxSum);
	}
}