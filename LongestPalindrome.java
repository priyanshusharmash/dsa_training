import java.util.Scanner;
import java.util.Arrays;
public class LongestPalindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ans = longestPalindrome(s);
		System.out.print(ans);
	}
	private static int longestPalindrome(String s) {
        int[] arr = new int[52];
		int count =0;
		for(int i =0;i<s.length();i++){
			if(Character.isLowerCase(s.charAt(i))) arr[s.charAt(i)-'a']++;
			else arr[s.charAt(i)-'A'+26] ++;
		}
		boolean anyOnes=false;
		System.out.println(Arrays.toString(arr));
		for(int i =0;i<arr.length;i++){
			if(arr[i]==0) continue;
			count += (arr[i]/2)*2;
			if(arr[i]%2!=0) {
				
				anyOnes= true;
			}
		}
		if(anyOnes) count++;
		return count;
    }
	//optimized
	/*
	private static int longestPalindrome(String s) {
        int[] freq = new int[52];
        int count = 0;

        for (char c : s.toCharArray()) {
            int index = c >= 'a' ? c - 'a' : c - 'A' + 26;

            freq[index]++;

            if (freq[index] % 2 == 0) {
                count += 2;
            }
        }

        return count < s.length() ? count + 1 : count;
    }
	*/
}