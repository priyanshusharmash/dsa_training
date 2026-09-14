import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class SubarraySumEqualsK{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums= new int[n];
		for(int i =0;i<n;i++) nums[i] = sc.nextInt();
		int k = sc.nextInt();
		int ans = subarrays(nums,k);
		System.out.print(ans);
	}
	private static int subarrays(int[] nums, int k){
		Map<Integer,Integer> map = new HashMap<>();
		int count =0,sum =0;
		map.put(sum,1);
		for(int num : nums){
			sum+=num;
			
			if(map.containsKey(sum-k)){
				count+= map.get(sum-k);
			}
			map.put(sum,map.getOrDefault(sum,0)+1);
		}
		return count;
	}
}