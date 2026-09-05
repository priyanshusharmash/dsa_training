import java.util.Scanner;
public class MaximumProductSubarray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++){
			nums[i] = sc.nextInt();
		}
		int ans = maximumProduct(nums);
		System.out.print(ans);
	}
	
	private static int maximumProduct(int[] nums){
		int prefix =Integer.MIN_VALUE, suffix =Integer.MIN_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++){
			if(prefix ==0) prefix =1;
			if(suffix==0) suffix =1;
			prefix = prefix*nums[i];
			suffix = suffix*(nums[nums.length-1-i]);
			max = Math.max(max,Math.max(prefix,suffix));
		}
		return max;
	}
}