import java.util.Scanner;

public class ThirdMaximumNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++) nums[i] = sc.nextInt();
		int ans = thirdMax(nums);
		System.out.print(ans);
	}
	private static int thirdMax(int[] nums) {
		long first = Integer.MIN_VALUE-1L,second = Integer.MIN_VALUE-1L,third = Integer.MIN_VALUE-1L;
		
		for(int num:nums){
			if(num == first || num == second || num == third) continue;
			if(num>=first){
				third = second;
				second = first;
				first = num;
			}else if(num>=second){
				third = second;
				second = num;
			}else if(num>=third){
				
				third = num;
			}
		}
		if(third <Integer.MIN_VALUE) return (int)first;
		else return (int) third;
	}
}