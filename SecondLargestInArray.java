import java.util.Scanner;
public class SecondLargestInArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++){
			nums[i] = sc.nextInt();
		}
		int ans = secondMaximum(nums);
	}
	private static int secondMaximum(int[] nums){
		int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for(int num:arr){
            if(num>max){
                secondMax = max;
                max = num;
            }else if(num>secondMax && num<max){
                secondMax = num;
            }
        }
        return secondMax==Integer.MIN_VALUE? -1: secondMax;
	}
}