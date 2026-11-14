import java.util.Scanner;

public class SqrtX{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = mySqrt(n);
		System.out.print(ans);
	}
	private static int mySqrt(int x){
		int low = 0,high =x,mid= low +(high-low)/2;
		while(low<=high){
			mid = low+(high-low)/2;
			long sq = (long) mid*mid;
			
			if(sq == x) return mid;
			else if(sq<x) low = mid+1;
			else high = mid-1;
		}
		return high;
	}
}