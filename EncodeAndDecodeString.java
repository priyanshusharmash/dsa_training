import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class EncodeAndDecodeString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] strs = new String[n];
		for(int i =0;i<n;i++) strs[i] = sc.next();
		String encodedString = encode(strs);
		System.out.println("Encoded String: "+encodedString);
		List<String> decodedList = decode(encodedString);
		System.out.println("Decoded List: "+decodedList.toString());
	}
	
	private static String encode(String[] strs) {
		StringBuilder ans = new StringBuilder();
		for (String current : strs) {
			ans.append(current.length());
			ans.append("#");
			ans.append(current);
		}
		return ans.toString();
	}

	private static List<String> decode(String str) {
		List<String> ans = new ArrayList<>();
		int i = 0;
		while (i < str.length()) {
			int separator = str.indexOf('#', i);
			int length = Integer.parseInt(str.substring(i, separator));
			i = separator + 1;
			String current = str.substring(i, i + length);
			ans.add(current);
			i += length;
		}
		return ans;
	}
}