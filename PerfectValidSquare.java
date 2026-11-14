import java.util.Scanner;

public class PerfectValidSquare{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean ans = isPerfectSquare(n);
		System.out.print(ans);
	}
	private static boolean isPerfectSquare(int num) {
		int low =0,high =num,mid;
		while(low<=high){
			mid = low+(high-low)/2;
			long sq =(long) mid*mid;
			if(sq==num) return true;
			else if(sq<num) low = mid+1;
			else high = mid-1;
		}
		return false;
	}

}