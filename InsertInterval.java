import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class InsertInterval{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] nums = new int[n][2];
		for(int i =0;i<n;i++){
			nums[i][0] = sc.nextInt();
			nums[i][1] = sc.nextInt();
		}
		int[] interval = new int[2];
		interval[0] = sc.nextInt();
		interval[1] = sc.nextInt();
		int[][] ans = insert(nums,interval);
		for(int i =0;i<ans.length;i++) 
			System.out.print(Arrays.toString(ans[i])+",");
	}
	private static int[][] insert(int[][] intervals, int[] newInterval){
		if(intervals.length==0) return new int[][]{newInterval};
        int[][] ans = new int[intervals.length+1][2];
		List<int[]> list = new ArrayList<>();
		int i=0,current =0;
		while(i<intervals.length && intervals[i][0]<=newInterval[0]){
			ans[current]=intervals[i++];
			current++;
		}
		ans[current]=newInterval;
		current++;
		while(i<intervals.length){
			ans[current] = intervals[i++];
			current++;
		}
		int pMin = ans[0][0];
		int pMax = ans[0][1];
		for(int[] interval : ans){
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