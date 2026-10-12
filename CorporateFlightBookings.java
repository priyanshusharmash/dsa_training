import java.util.Scanner;
import java.util.Arrays;

public class CorporateFlightBookings{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int[][] bookings = new int[row][3];
		for(int i =0;i<row;i++){
			for(int j =0;j<3;j++) bookings[i][j] = sc.nextInt();
		}
		int n = sc.nextInt();
		int[] ans = corpFlightBookings(bookings,n);
		System.out.print(Arrays.toString(ans));
	}
	private static int[] corpFlightBookings(int[][] bookings, int n) {
		int[] prefix = new int[n];
		for(int[] booking : bookings){
			for(int i =booking[0]-1;i<booking[1];i++){
				prefix[i] += booking[2];
			}
		}
		return prefix;
	}
	/* optimized
	private static int[] corpFlightBookings(int[][] bookings, int n) {
		int[] prefix = new int[n];
		for(int[] booking : bookings){
			prefix[booking[0]-1]+=booking[2];
            if(booking[1]<n){
                prefix[booking[1]]-=booking[2];
            }
		}
        for(int i = 1;i<prefix.length;i++){
            prefix[i]+=prefix[i-1];
        }
		return prefix;
	}
	*/
}