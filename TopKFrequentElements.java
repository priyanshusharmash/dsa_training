import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Arrays;

public class TopKFrequentElements{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++){
			nums[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int[] ans = topElements(nums,k);
		System.out.print(Arrays.toString(ans));		
	}
	private static int[] topElements(int[] nums,int k){
		Map<Integer,Integer> map = new HashMap<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> Integer.compare(map.get(b),map.get(a)));
		for(int num:nums){
			if(map.containsKey(num)) map.put(num,map.get(num)+1);
			else map.put(num,1);
		}
		for(Map.Entry<Integer,Integer> entry : map.entrySet()){
			pq.add(entry.getKey());
		}
		int[] ans = new int[k];
		for(int i =0;i<k;i++){
			ans[i] = pq.poll();
		}
		return ans;
	}
}