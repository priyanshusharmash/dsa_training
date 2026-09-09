import java.util.Scanner;
public class LongestCommonPrefix{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		for(int i =0;i<n;i++){
			arr[i] = sc.next();
		}
		String ans = longestCommonPrefix(arr);
		System.out.print(ans);
	}
	private static String longestCommonPrefix(String[] strs){
		String prefix = strs[0];
		for(String current : strs){
			int j =0;
			while(j<prefix.length() && j<current.length() && prefix.charAt(j)==current.charAt(j)) j++;
			if(j==0) return "";
			prefix=current.substring(0,j);
		}
		return prefix;
	}
}