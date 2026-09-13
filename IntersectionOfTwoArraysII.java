import java.util.Scanner;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class IntersectionOfTwoArraysII{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums1 = new int[n];
		for(int i =0;i<n;i++) nums1[i] = sc.nextInt();
		int m = sc.nextInt();
		int[] nums2 = new int[m];
		for(int i =0;i<m;i++) nums2[i] = sc.nextInt();
		int[] ans = intersection(nums1,nums2);
		System.out.print(Arrays.toString(ans));
	}
	private static int[] intersection(int[] nums1,int[] nums2){
		Map<Integer,Integer> map1 = new HashMap<>();
		Map<Integer,Integer> map2 = new HashMap<>();
		List<Integer> ans = new ArrayList<>();
		for(int num : nums1)
			map1.put(num, map1.getOrDefault(num,0)+1);
		for(int num : nums2)
			if(map1.containsKey(num))
				map2.put(num,map2.getOrDefault(num,0)+1);
		for(Map.Entry<Integer,Integer> entry2 : map2.entrySet()){
			int key = entry2.getKey();
			int value = entry2.getValue();
			int minFreq = Math.min(value,map1.get(key));
			System.out.println("Min freq of "+key +" :"+minFreq);
			for(int i =0;i<minFreq;i++) ans.add(key);
		}
		return ans.stream().mapToInt(Integer::intValue).toArray();
	}
	
	/*
	private static int[] intersection(int[] nums1,int[] nums2){
		int[] freq = new int[1001];
        List<Integer> ans = new ArrayList<>();

        for (int num : nums1)
            freq[num]++;
        for (int num : nums2) {
            if (freq[num] > 0) {
                ans.add(num);
                freq[num]--;
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
	}
	*/
}