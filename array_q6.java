class Solution {
    public void rotateArray(int[] nums, int k) {
        while(k>0){
            int firstele=nums[0];
        for (int i=0; i<nums.length-1;i++){
            nums[i]=nums[i+1];
        }
        nums[nums.length-1]=firstele;
        k--;
    }
        }
    }
