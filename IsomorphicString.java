import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class IsomorphicString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		boolean ans = isIsomorphic(s,t);
		System.out.print(ans);
	}
	private static boolean isIsomorphic(String s, String t){
		Map<Character,Character> map = new HashMap<>();
		for(int i =0;i<s.length();i++){
			if(map.containsKey(t.charAt(i))){
				if(s.charAt(i)!=map.get(t.charAt(i))) return false;
			}
			else map.put(t.charAt(i),s.charAt(i));
		}
		map.clear();
		for(int i =0;i<s.length();i++){
			if(map.containsKey(s.charAt(i))){
				if(t.charAt(i)!=map.get(s.charAt(i))) return false;
			}
			else map.put(s.charAt(i),t.charAt(i));
		}
		return true;
	}
}