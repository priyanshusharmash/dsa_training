import java.util.Scanner;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
public class WordPattern{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.nextLine();
		String b = sc.nextLine();
		boolean ans = wordPattern(a,b);
		System.out.print(ans);
	}
	private static boolean wordPattern(String a, String b){
		Map<Character, String> map1 = new HashMap<>();
		Map<String,Character> map2 = new HashMap<>();
		String[] bArray = b.split(" ");
		for(int i =0;i<a.length();i++){
			if(map1.containsKey(a.charAt(i)) && !map1.get(a.charAt(i)).equals(bArray[i])){
				return false;
			}else{
				map1.put(a.charAt(i),bArray[i]);
			}
			
			if(map2.containsKey(bArray[i]) && map2.get(bArray[i])!=a.charAt(i)){
				return false;
			}else{
				map2.put(bArray[i],a.charAt(i));
			}
		}
		return true;
	}
}