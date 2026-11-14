import java.util.Scanner;

public class FindSmallestLetterGreaterThanTarget{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] chars = new char[n];
		for(int i =0;i<n;i++) chars[i] = sc.next().charAt(0);
		char target = sc.next().charAt(0);
		char ans = nextGreatestLetter(chars,target);
		System.out.print(ans);
	}
	private static char nextGreatestLetter(char[] letters, char target) {
		int low = 0,high = letters.length-1,mid=low+(high-low)/2;
		while(low<=high){
			mid = low+(high-low)/2;
			if(letters[mid] <= target) low = mid+1;
			else high = mid-1;
		}
		return letters[low%letters.length];
	}
}