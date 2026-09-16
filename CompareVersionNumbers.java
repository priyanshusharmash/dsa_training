import java.util.Scanner;
import java.util.Arrays;
public class CompareVersionNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String v1 = sc.next();
		String v2 = sc.next();
		int ans = compareVersion(v1,v2);
		System.out.print(ans);
	}
	private static int compareVersion(String version1, String version2){
		String[] v1 = version1.split("\\.");
		String[] v2 = version2.split("\\.");
		int maxLen = Math.max(v1.length,v2.length);
		System.out.println(Arrays.toString(v1));
		System.out.println(Arrays.toString(v2));
		for(int i =0;i<maxLen;i++){
			int r1 = (i>=v1.length)?0:Integer.parseInt(v1[i]);
			int r2 = (i>=v2.length)?0:Integer.parseInt(v2[i]);
			if(r2>r1) return -1;
			if(r1>r2) return 1;
		}
		return 0;
	}
	
	/* optimized using two pointer 
	private static int compareVersion(String version1, String version2){
		int i = 0, j = 0;
		while (i < version1.length() || j < version2.length()) {
			int num1 = 0;
			int num2 = 0;
			while (i < version1.length() && version1.charAt(i) != '.') {
				num1 = num1 * 10 + (version1.charAt(i) - '0');
				i++;
			}
			while (j < version2.length() && version2.charAt(j) != '.') {
				num2 = num2 * 10 + (version2.charAt(j) - '0');
				j++;
			}
			if (num1 > num2) return 1;
			if (num1 < num2) return -1;
			i++;
			j++;
		}
		return 0;
	}
	*/
}