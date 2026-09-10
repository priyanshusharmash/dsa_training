import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class GroupAnagram{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] strs = new String[n];
		for(int i =0;i<n;i++) strs[i] = sc.next();
		List<List<String>> ans = groupAnagram(strs);
		System.out.print(ans.toString());
	}
	private static List<List<String>> groupAnagram(String[] strs){
		Map<String,List<String>> map = new HashMap<>();
		for(String current :strs){
			int[] arr = new int[26];
			for(char ch : current.toCharArray()) arr[ch-'a'] ++;
			StringBuilder sb = new StringBuilder();
			for(int freq : arr) sb.append("#").append(freq);
			map.computeIfAbsent(sb.toString(), k -> new ArrayList<>()).add(current);
		}
		return new ArrayList<>(map.values());
	}
}