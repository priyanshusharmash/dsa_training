import java.util.Scanner;
public class FindPivotIndex{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++){
			nums[i] = sc.nextInt();
		}
		int ans = pivotIndex(nums);
		System.out.println(ans);
	}
	private static int pivotIndex(int[] nums){
		int[] prefixSum = new int[nums.length];
		int prevSum =0;
		for(int i =0;i<nums.length;i++){
			prefixSum[i] = prevSum + nums[i];
			prevSum = prefixSum[i];
		}
		int maxSum = prefixSum[prefixSum.length-1];
		prevSum =0;
		for(int i =0;i<prefixSum.length;i++){
			if(maxSum - prefixSum[i] == prevSum){
				return i;
			}
			prevSum = prefixSum[i];
		}
		return -1;
	}
}