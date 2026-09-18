import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int ans = lengthOfLongestSubstring(str);
		System.out.print(ans);
	}
	private static int lengthOfLongestSubstring(String s) {
		if(s.length()==0) return 0;
		int maxLen = 1,left = 0, right =0;
		
		Map<Character,Integer> map = new HashMap<>();
		while(right<s.length()){
			char ch = s.charAt(right);
			if(map.containsKey(ch)){
				left = Math.max(left,map.get(ch)+1);
			}
			map.put(ch,right);
			maxLen = Math.max(maxLen,right-left+1);
			right++;
		}
		return maxLen;
	}
}