class Solution {
    public int removeDuplicates(int[] nums) {
      int i =0,count=1;
        for(int j=1; j<nums.length;j++){
           if(nums[i]==nums[j]){
            continue;
           }
           else{
            count++;
            i++;
            nums[i]=nums[j];
        }
        }
        /*for ( i=0; i<nums.length; i++){
            System.out.print(nums[i]+" , ");
        }*/
        return count;
    }
}
