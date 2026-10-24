import java.util.Scanner;
import java.util.Arrays;

public class MaximumProductOfTwoElementsInAnArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++) nums[i] = sc.nextInt();
		int ans = maxProduct(nums);
		System.out.print(ans);
	}
	private static int maxProduct(int[] nums) {
		Arrays.sort(nums);
		return (nums[nums.length-1]-1) * (nums[nums.length-2]-1);
	}
	
	private static int maxProduct(int[] nums){
		int first = 0,second =0;
        for(int num:nums){
            if(num>first){
                second = first;
                first = num;
            }
            else if(num>second){
                second = num;
            }
        }
        return (first-1)*(second-1);
	}
	
}