class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,tempcount=0;
        for (int i=0; i<nums.length;i++){
            if (nums[i]==1){
                tempcount+=1;
            }
            if(nums[i]==0||i==nums.length-1){
                count=Math.max(count,tempcount);
                tempcount=0;
            }
        }
        return count;
    }
}
