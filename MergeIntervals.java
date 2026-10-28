import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class MergeIntervals{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] nums = new int[n][2];
		for(int i =0;i<n;i++){
			nums[i][0] = sc.nextInt();
			nums[i][1] = sc.nextInt();
		}
		int[][] ans = merge(nums);
		for(int i =0;i<ans.length;i++){
			System.out.println(Arrays.toString(ans[i]));
		}
	}
	
	private static int[][] merge(int[][] intervals){
		Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
		List<int[]> list = new ArrayList<>();
		int pMin = intervals[0][0];
		int pMax = intervals[0][1];
		for(int[] interval : intervals){
			if(interval[0]<=pMax){
				pMax = Math.max(pMax,interval[1]);
			}else{
				list.add(new int[]{pMin,pMax});
				pMin = interval[0];
				pMax = interval[1];
			}
		}
		list.add(new int[]{pMin,pMax});
		return list.toArray(new int[0][]);
	}
	
}