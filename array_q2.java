class Solution {
    public int secondLargestElement(int[] nums) {
        int max=-99999;
        int secondMax=-9999;

        for(int i=0; i<nums.length;i++){
            if (nums[i]>max){
                //secondMax=max;
                max=nums[i];
            }
            else if(nums[i]<max && nums[i]>secondMax){
                secondMax=nums[i];
            }
        }
        if (secondMax==-9999){
            return -1;
        }
        else{
            return secondMax;
        }
    }
}
