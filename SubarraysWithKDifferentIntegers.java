import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class SubarraysWithKDifferentIntegers{
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++) nums[i] = sc.nextInt();
		int k = sc.nextInt();
		int ans = subarraysWithKDistinct(nums,k);
		System.out.print(ans);
	}
	
	private static int subarraysWithKDistinct(int[] nums, int k) {
		return countAtMost(nums,k) - countAtMost(nums,k-1);
	}
	/*
	private static int countAtMost(int[] nums,int k){
		int left =0,count=0;
		Map<Integer,Integer> map = new HashMap<>();
		for(int right =0;right<nums.length;right++){
			map.put(nums[right],map.getOrDefault(nums[right],0)+1);
			while(map.size()>k){
				map.put(nums[left],map.get(nums[left])-1);
				if(map.get(nums[left])==0) map.remove(nums[left]);
				left++;
			}
			count+=right-left+1;
		}
		return count;
	}*/
	//optimized
	private int countAtMost(int[] nums, int k) {
        int[] freq = new int[nums.length + 1];
        int left = 0;
        int count = 0;
        for (int right = 0; right < nums.length; right++) {
            if (freq[nums[right]] == 0) {
                k--;
            }
            freq[nums[right]]++;
            while (k < 0) {
                freq[nums[left]]--;
                if (freq[nums[left]] == 0) {
                    k++;
                }
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}