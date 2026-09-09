import java.util.Scanner;
public class FindTheDuplicateNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++) nums[i] = sc.nextInt();
		int ans = findDuplicates(nums);
		System.out.print(ans);
	}
	private static int findDuplicates(int[] nums){
		int slow = nums[0];
		int fast = nums[0];
		do{
			slow = nums[slow];
			fast = nums[nums[fast]];
		}while(slow!=fast);
		slow = nums[0];
		while(slow!=fast){
			slow = nums[slow];
			fast = nums[fast];
		}
		return fast;
	}
}