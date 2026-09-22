import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class ContiguousArray{
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i = 0;i<n;i++) nums[i] = sc.nextInt();
		int ans = findMaxLength(nums);
		System.out.print(ans);
	}
	private static int findMaxLength(int[] nums) {
		int maxLen = 0, sum =0;
		Map<Integer,Integer> map = new HashMap<>();
		map.put(0,-1);
		for(int i = 0; i<nums.length;i++){
			if(nums[i] == 0) sum--;
			else sum++;
			if(map.containsKey(sum)) maxLen = Math.max(maxLen, i-map.get(sum));
			else map.put(sum,i);
		}	
		return maxLen;
	}
}