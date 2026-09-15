import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class FindAnagramInString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		String p = sc.next();
		List<Integer> ans = findAnagrams(s,p);
		System.out.print(ans.toString());
	}
	private static List<Integer> findAnagrams(String s, String p){
		List<Integer> list = new ArrayList<>();
		int[] g_freq = 	new int[26];
		for(char ch : p.toCharArray()) g_freq[ch-'a']++;
		String freqHash = Arrays.toString(g_freq);
		int[] current_freq = new int[26];
		
		int left =0,right = p.length()-1;
		for(int i =0;i<=right;i++) current_freq[s.charAt(i)-'a']++;
		while(right<s.length()){
			System.out.println("Freq has: "+freqHash+" Current freq: "+ Arrays.toString(current_freq));
			if(Arrays.toString(current_freq).equals(freqHash)) list.add(left);
			if(right<s.length()-1){
				current_freq[s.charAt(right+1)-'a']++;
				current_freq[s.charAt(left)-'a']--;			
			}
			right++;
			left++;
		}
		return list;
	}

}