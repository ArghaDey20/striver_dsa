class Solution {
    public int singleNumber(int[] nums) {
        //your code goes here
        int missingEle=0;
        for (int i=0; i<nums.length; i++){
            missingEle ^=nums[i];
        }
        return missingEle;
    }
}
