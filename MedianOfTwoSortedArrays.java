import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;

public class MedianOfTwoSortedArrays{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[] arr1 = new int[m];
		int[] arr2 = new int[n];
		for(int i =0;i<m;i++) arr1[i] = sc.nextInt();
		for(int i =0;i<n;i++) arr2[i] = sc.nextInt();
		double ans = findMedianSortedArrays(arr1,arr2);
		System.out.print(ans);
	}	
	private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double ans = 0.0;
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		int i=0;
		while(i<nums1.length && i<nums2.length){
			queue.add(nums1[i]);
			queue.add(nums2[i]);
			i++;
		}
		while(i<nums1.length){
			queue.add(nums1[i]);
			i++;
		}
		while(i<nums2.length){
			queue.add(nums2[i]);
			i++;
		}
		ArrayList<Integer> list = new ArrayList<>(queue);
		if(list.size() % 2 ==0){
			int sum = list.get(list.size()/2) + list.get((list.size()/2)-1);
			return sum/2.0;
		}else return list.get(list.size()/2)/1.0;
	}
}