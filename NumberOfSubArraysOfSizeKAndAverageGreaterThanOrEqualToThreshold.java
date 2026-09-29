import java.util.Scanner;

public class NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThreshold{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++) nums[i] = sc.nextInt();
		int k = sc.nextInt();
		int threshold = sc.nextInt();
		int ans = numOfSubarrays(nums,k,threshold);
		System.out.print(ans);
	}
	private static int numOfSubarrays(int[] arr, int k, int threshold) {
		int count=0, currentSum=0,left =0,right=0;
		while(right<arr.length){
			currentSum+=arr[right];
			if(right-left+1 == k){
				if(currentSum/k >= threshold) count++;
				currentSum-=arr[left];
				left++;
			}
			right++;
		}
		return count;		
	}
}