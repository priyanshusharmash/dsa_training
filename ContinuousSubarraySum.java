import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class ContinuousSubarraySum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i = 0;i<n;i++) nums[i] = sc.nextInt();
		int k = sc.nextInt();
		boolean ans = checkSubarraySum(nums,k);
		System.out.print(ans);
	}
	private static boolean checkSubarraySum(int[] nums, int k) {
		int sum = 0;
		Map<Integer,Integer> map = new HashMap<>();
		map.put(0,-1);
		for(int i = 0;i<nums.length;i++){
			sum+=nums[i];
			if(map.containsKey(sum%k) && i-map.get(sum%k)>=2) return true;
			if(!map.containsKey(sum%k))map.put(sum%k,i);
		}
		return false;
	}
}