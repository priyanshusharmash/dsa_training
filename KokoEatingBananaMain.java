public class KokoEatingBananaMain{
	public static void main(String[] args){
		int[] piles = {3,6};
		var obj = new KokoEatingBanana();
		int ans = obj.minEatingSpeed(piles,3);
		System.out.println("Answer: "+ans);
	}
}
class KokoEatingBanana{
	public int minEatingSpeed(int[] piles, int h) {
		int high = piles[0], low =1;
		for(int n:piles) high = Math.max(n,high);
		int mid= (low+high)/2;
		while(low<high){
			mid = (low+high)/2;
			System.out.println("Mid: "+mid+" Low: "+low+" high: "+high);
			if(can_finish(mid,piles,h)) high = mid;
			else low = mid+1;
		}
		return high;
	}
	private boolean can_finish(int speed, int[] arr, int hour){
		long current =0;
		for(int pile: arr){
			current += (pile + (long)speed -1)/speed;
			if(current> hour){
				return false;
			}
		 }
		 System.out.println("Current: "+current+" At iteration: "+speed);
		 return true;
	}
}