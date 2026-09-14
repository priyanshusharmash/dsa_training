import java.util.Scanner;

public class RectangleOverlap{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] rec1 = new int[4];
		for(int i = 0;i<4;i++) rec1[i] = sc.nextInt();
		int[] rec2 = new int[4];
		for(int i =0;i<4;i++) rec2[i] = sc.nextInt();
		boolean ans = isRectangleOverlap(rec1,rec2);
		System.out.print(ans);
	}
	
	
	private static boolean isRectangleOverlap(int[] rec1, int[] rec2){
		int x1 = rec1[0], y1 = rec1[1], x2 = rec1[2], y2 = rec1[3];
        int X1 = rec2[0] , Y1 =rec2[1], X2 = rec2[2], Y2 = rec2[3];
        return !(X1>=x2 || Y1>= y2 || x1>= X2 || y1>=Y2);
	}
}