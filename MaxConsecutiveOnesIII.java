import java.util.Scanner;

public class MaxConsecutiveOnesIII{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++) nums[i] = sc.nextInt();
		int k = sc.nextInt();
		int ans = longestOnes(nums,k);
		System.out.print(ans);
	}
	private static int longestOnes(int[] nums, int k) {
        int left =0,currentZero=0,maxLen=0;
        for(int right =0;right<nums.length;right++){
            if(nums[right]==0) currentZero++;
            while(currentZero>k){
                if(nums[left]==0) currentZero--;
                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
	}
}