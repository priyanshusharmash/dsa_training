import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class NumberOfGoodPairs{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++){
			nums[i] = sc.nextInt();
		}
		int ans = numIdenticalPairs(nums);
		System.out.println(ans);
	}
	/* Method 1
	private static int numIdenticalPairs(int[] nums){
		int count =0;
		for(int i =0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i] == nums[j]) count++;
			}
		}
		return count;
	}
	*/
	
	// Method 2
	private static int numIdenticalPairs(int[] nums){
		int count =0;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i = 0;i<nums.length;i++){
			if(map.containsKey(nums[i])){
				count+=map.get(nums[i]);
				map.put(nums[i],map.get(nums[i])+1);
			}else map.put(nums[i],1);
		}
		return count;
	}
	
}