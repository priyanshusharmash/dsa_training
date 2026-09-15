import java.util.Scanner;

public class JumpGameII{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++){
			nums[i] = sc.nextInt();
		}
		int ans = jump(nums);
		System.out.print(ans);
	}
	private static int jump(int[] nums){
		int jump =0,left =0,right=0;
		while(right<nums.length-1){
			int far =0;
			for(int i = left;i<=right;i++){
				far = Math.max(i+nums[i],far);
				
			}
			jump++;
			left = right+1;
			right = far;
		}
		return jump;
	}
}