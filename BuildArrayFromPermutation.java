import java.util.Scanner;
public class BuildArrayFromPermutation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] nums = new int[n];
		for(int i =0;i<n;i++){
			nums[i] = sc.nextInt();
		}
		int[] ans = buildArray(nums);
		System.out.print("[");
		for(int i =0;i<ans.length;i++){
			if(i==ans.length-1) System.out.print(ans[i]+"]");
			else System.out.print(ans[i]+" ");
		}
	}
	
	private static int[] buildArray(int[] nums){
		int[] ans = new int[nums.length];
		for(int i =0;i<nums.length;i++){
			ans[i] = nums[nums[i]];
		}
		return ans;
	}	
}