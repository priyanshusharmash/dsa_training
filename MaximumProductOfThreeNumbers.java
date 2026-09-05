import java.util.Scanner;
import java.util.Arrays;
public class MaximumProductOfThreeNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++){
			nums[i] = sc.nextInt();
		}
		int ans = maxProduct(nums);
		System.out.print(ans);
	}
	private static int maxProduct(int[] nums){
		Arrays.sort(nums);
		int lastProduct = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
		int firstTwoProduct =nums[0]*nums[1]*nums[nums.length-1];
		return Math.max(lastProduct,firstTwoProduct);
	}
}