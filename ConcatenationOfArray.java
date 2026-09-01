import java.util.Scanner;
public class ConcatenationOfArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int [n];
		for(int i =0;i<n;i++){
			nums[i] = sc.nextInt();
		}
		int[] ans = getConcatenation(nums);
		System.out.print("[");
		for(int i =0;i<ans.length;i++){
			if(i==ans.length-1) System.out.print(ans[i]+"]");
			else System.out.print(ans[i]+" ");
		}
	}
	private static int[] getConcatenation(int[] nums){
		int[] ans = new int[2*nums.length];
		for(int i =0;i<nums.length;i++){
			ans[i] = nums[i];
			ans[i+nums.length] = nums[i];
		}
		return ans;
	}
}