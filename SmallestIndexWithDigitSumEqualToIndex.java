import java.util.Scanner;

public class SmallestIndexWithDigitSumEqualToIndex{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++) nums[i] = sc.nextInt();
		int ans = smallestIndex(nums);
		System.out.print(ans);
	}
	private static int smallestIndex(int[] nums) {
		int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum = 0;
            while(nums[i]!=0){
                sum+=nums[i]%10;
                nums[i]/=10;
            }
            if(sum==i) return i;
        }
        return -1;
	}
}