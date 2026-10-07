import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class BinarySubarraysWithSum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<n;i++) nums[i] = sc.nextInt();
		int goal = sc.nextInt();
		int ans = numSubarraysWithSum(nums,goal);
		System.out.print(ans);
	}
	
	private static int numSubarraysWithSum(int[] nums, int goal) {
		int sum =0,count=0;
		Map<Integer,Integer> map = new HashMap<>();
		map.put(0,1);
		for(int num:nums){
			sum+=num;
			count+=map.getOrDefault(sum-goal,0);
			map.put(sum,map.getOrDefault(sum,0)+1);
		}
		return count;
	}
	
}