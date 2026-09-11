import java.util.Scanner;

public class Unique3DigitEvenNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++) nums[i] = sc.nextInt();
		int ans = uniqueNumbers(nums);
		System.out.print(ans);
	}
	private static int uniqueNumbers(int[] nums){
		int count =0;
		int[] freq = new int[10];
		for(int num:nums) freq[num]++;
		for(int i=100;i<1000;i++){
			if(i%2==0){
				int[] arr = new int[10];
				int temp = i;
				while(temp!=0){
					int rem = temp%10;
					arr[rem]++;
					if(arr[rem]>freq[rem]) break;
					temp/=10;
				}
				if(temp==0) count++;
			}
		}
		return count;
	}
}