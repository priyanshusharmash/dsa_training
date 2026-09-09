import java.util.Scanner;
public class ContainerWithTheMostWater{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++) nums[i] = sc.nextInt();
		int ans = maxArea(nums);
		System.out.print(ans);
	}
	private static int maxArea(int[] heights){
		int low = 0, high =heights.length-1;
		int maxArea = 0;
		while(low<high){
			int minHeight = Math.min(heights[low],heights[high]);
			maxArea = Math.max(maxArea,minHeight*(high-low));
			if(heights[low]<heights[high]) low++;
			else high--;
		}
		return maxArea;
	}
}