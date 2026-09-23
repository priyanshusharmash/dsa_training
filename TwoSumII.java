import java.util.Scanner;
import java.util.Arrays;
public class TwoSumII{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i = 0;i<n;i++) nums[i] = sc.nextInt();
		int target = sc.nextInt();
		int[] ans = twoSum(nums,target);
		System.out.print(Arrays.toString(ans));
		
	}
	private static int[] twoSum(int[] numbers, int target) {
		int low = 0,high =numbers.length-1;
		while(low<high){
			if(numbers[low]+numbers[high] == target) return new int[]{low+1,high+1};
			if(numbers[low]+numbers[high]>target) high--;
			else low++;
		}
		return new int[]{-1,-1};
	}

}