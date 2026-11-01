import java.util.Scanner;
import java.util.Arrays;

public class LargestNumber{
	public static void main(String[] strs){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++) nums[i] = sc.nextInt();
		String ans = largestNumber(nums);
		System.out.print(ans);
	}
	private static String largestNumber(int[] nums){
		String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        if (arr[0].equals("0")) {
            return "0";
        }
        return String.join("", arr);
	}
}