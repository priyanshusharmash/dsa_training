import java.util.Scanner;
import java.util.Arrays;
public class ProductOfArrayExceptSelf{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++){
			nums[i] = sc.nextInt();
		}
		productExceptSelf(nums);
		System.out.print(Arrays.toString(nums));
	}
	private static void productExceptSelf(int[] nums){
		int[] prefixSum = new int[nums.length];
		int[] suffixSum = new int[nums.length];
		prefixSum[0] = 1;
		suffixSum[nums.length-1] = 1;
		for(int i =1;i<nums.length;i++){
			prefixSum[i] = prefixSum[i-1]*nums[i-1];
			suffixSum[nums.length-1-i] = suffixSum[nums.length-i]*nums[nums.length-i];
		}
		System.out.println("Suffix sum: "+Arrays.toString(suffixSum));
		System.out.println("Prefix Sum: "+Arrays.toString(prefixSum));
		for(int i =0;i<nums.length;i++){
			nums[i] = prefixSum[i]*suffixSum[i];
		}
	}
}