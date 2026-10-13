import java.util.Scanner;
public class CarPooling{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[][] trips = new int[n][3];
		for(int i =0;i<n;i++){
			for(int j =0;j<3;j++) trips[i][j] = sc.nextInt();
		}
		int capacity = sc.nextInt();
		boolean ans = carPooling(trips,capacity);
		System.out.print(ans);
	}
	private static boolean carPooling(int[][] trips, int capacity) {
		int[] nums = new int[1001];
		for(int[] trip : trips){
			nums[trip[1]]+= trip[0];
			nums[trip[2]]-=trip[0];
		}
		int prefix =0;
		for(int num:nums){
			prefix+=num;
			if(prefix>capacity) return false;
		}
		return true;
	}
}