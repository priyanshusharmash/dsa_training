import java.util.Scanner;
public class FindTheMiddleIndexInArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++) nums[i] = sc.nextInt();
		int ans = findMiddleIndex(nums);
		System.out.print(ans);
	}
	private static int findMiddleIndex(int[] nums) {
		int prefix =0,suffix=0;
		for(int i = 0;i<nums.length;i++){
			prefix+=nums[i];
			nums[i] = prefix;
		}
		for(int i =0;i<nums.length;i++){
			prefix = i==0?0:nums[i-1];
			suffix = i==nums.length-1?0:nums[nums.length-1]-nums[i];
			if(prefix==suffix) return i;
		}
		return -1;
	}
}