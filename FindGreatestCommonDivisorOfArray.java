import java.util.Scanner;
public class FindGreatestCommonDivisorOfArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int ans = findGCD(arr);
		System.out.println(ans);
		
	}
	public static int findGCD(int[] nums){
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int num:nums){
			max = Math.max(max,num);
			min = Math.min(min,num);
		}
		while(max!=0){
			int tmp = max;
			max = min%max;
			min = tmp;
		}
		return min;
	}
}