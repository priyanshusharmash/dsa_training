import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class SimplifyPath{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String ans = simplifyPath(str);
		System.out.print(ans);
	}
	
	private static String simplifyPath(String path) {
		int i = 0;
        Deque<String> deque = new ArrayDeque<>();
        while (i < path.length()) {
            char current = path.charAt(i);
            if (current == '/') {
                i++;
                continue;
            }
            int last = i;
            while (last < path.length() && path.charAt(last) != '/') {
                last++;
            }
            String currentString = path.substring(i, last);
            if (currentString.equals("."))
                i = last;
            else if (currentString.equals("..")) {
                if (!deque.isEmpty())
                    deque.removeLast();

            } else {
                deque.addLast(currentString);
            }
            i = last;
        }

        StringBuilder ans = new StringBuilder();
        if (deque.isEmpty())
            ans.append("/");
        while (!deque.isEmpty()) {
            ans.append("/" + deque.pop());
        }
        return ans.toString();
	}
	
}