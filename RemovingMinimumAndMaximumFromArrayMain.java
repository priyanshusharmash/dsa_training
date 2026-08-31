public class RemovingMinimumAndMaximumFromArrayMain{
	public static void main(String[] args){
		int[] arr ={0,2,1};
		var obj = new RemovingMinimumAndMaximumFromArray();
		int ans = obj.minimumDeletions(arr);
		System.out.println("Answer: "+ans);
	}
}

class RemovingMinimumAndMaximumFromArray{
	public int minimumDeletions(int[] nums){
		if(nums.length==1) return 1;
		if(nums.length ==2) return 2;
		int min =Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		int minIdx = 0,maxIdx=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]>max){
				max = nums[i];
				maxIdx = i;
			}
			if(nums[i] < min){
				min= nums[i];
				minIdx=i;
			}
		}
		System.out.println("Min Idx: "+ minIdx + " Max Idx: "+maxIdx);
		boolean maxNear= false,minNear=false;
		if(maxIdx == nums.length/2  || minIdx == nums.length/2 ) return nums.length/2;
		if(maxIdx < Math.abs(nums.length - maxIdx)) maxNear = true;
		if(minIdx < Math.abs(nums.length - minIdx)) minNear = true;
		
		System.out.println("Max near: "+maxNear+" Min near: "+minNear);
		
		if(maxNear != minNear) return nums.length - (int)Math.abs(minIdx - maxIdx) +1;
		else if(maxNear && minNear){
			int ans = Math.max(maxIdx,minIdx)+1;
			return ans;
		}else{
			int ans = Math.min(maxIdx,minIdx)+1;
			return ans;
		}
	}
}