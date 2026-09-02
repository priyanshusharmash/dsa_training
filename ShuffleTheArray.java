import java.util.Scanner;
public class ShuffleTheArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums =  new int[n*2];
		for(int i =0;i<n*2;i++){
			nums[i] = sc.nextInt();
		}
		int[] ans = shuffle(nums,n);
		System.out.print("[");
		for(int i =0;i<ans.length;i++){
			if(i==ans.length-1) System.out.print(ans[i]+"]");
			else System.out.print(ans[i]+ " ");
		}
	}
	private static int[] shuffle(int[] nums, int n){
		int[] ans = new int[nums.length];
		int current =0;
		for(int i =0;i<n;i++){
			ans[current++] = nums[i];
			ans[current++] = nums[i+n];
		}
		return ans;
	}
}