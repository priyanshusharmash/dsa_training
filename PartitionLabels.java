import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class PartitionLabels{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		List<Integer> ans = partitionLabels(str);
		System.out.print(ans.toString());
	}
	private static List<Integer> partitionLabels(String s) {
		int[] last = new int[26];
		List<Integer> list = new ArrayList<>();
		for(int i =0;i<s.length();i++) last[s.charAt(i)-'a'] = i;
		int start =0,current,end;
		while(start<s.length()){
			current = start+1;
			end = last[s.charAt(start)-'a'];
			while(current<end){
				end = Math.max(end,last[s.charAt(current)-'a']);
				current++;
			}
			list.add(end-start+1);
			start = end+1;
		}
		return list;
	}
}