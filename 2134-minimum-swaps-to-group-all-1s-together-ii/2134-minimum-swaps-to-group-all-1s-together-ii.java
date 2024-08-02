class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int oneCount=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                oneCount++;
            }
        }
        int zeroCount=0;
        for(int i=0;i<oneCount;i++){
            if(nums[i]==0){
                zeroCount++;
            }
        }
        int currentZero=zeroCount;
        for(int i=1;i<n;i++){
            if(nums[(i-1)%n]==0){
                currentZero--;
            }
            if(nums[(i+oneCount-1)%n]==0){
                currentZero++;
            }
            zeroCount=Math.min(currentZero,zeroCount);
        }
        return zeroCount;

    }
}