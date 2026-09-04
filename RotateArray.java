import java.util.Scanner;
import java.util.Arrays;
public class RotateArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++){
			nums[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		rotateArray(nums,k);
		System.out.print(Arrays.toString(nums));		
	}
	private static void rotateArray(int[] nums, int k){
		reverse(nums,0,nums.length-1);
		reverse(nums,0,(k%nums.length)-1);
		reverse(nums,k%nums.length,nums.length-1);
	}	
	private static void reverse(int[] nums,int start, int end){
		while(start<end){
			nums[start] = nums[start]+nums[end];
			nums[end] = nums[start]-nums[end];
			nums[start] = nums[start++]-nums[end--];
		}
	}
}