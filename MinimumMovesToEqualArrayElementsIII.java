import java.util.Scanner;

public class MinimumMovesToEqualArrayElementsIII{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++) nums[i] = sc.nextInt();
		int ans = minMoves(nums);
		System.out.print(ans);
	}
	private static int minMoves(int[] nums) {
		int max = 1, count =0;
		for(int num:nums) max = Math.max(num,max);
		for(int num:nums) count += (max-num);
		return count;
	}
}