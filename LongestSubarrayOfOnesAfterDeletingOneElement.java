import java.util.Scanner;

public class LongestSubarrayOfOnesAfterDeletingOneElement{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++) nums[i] = sc.nextInt();
		int ans = longestSubarray(nums);
		System.out.print(ans);
	}
	private static int longestSubarray(int[] nums) {
		int left=0,maxLen=0,numZero=0;
		for(int right =0;right<nums.length;right++){
			if(nums[right] == 0) numZero++;
			while(numZero>1){
				if(nums[left]==0) numZero--;
				left++;
			}
			maxLen = Math.max(maxLen,right-left);
			
		}
		return maxLen;
	}
}