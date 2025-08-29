class Array_q13 {
     public static int longestSubarray(int[] nums, int k) {
       int p=1,sum=nums[0];
       int maxcount=0;
       for(int i=1; i<nums.length; i++){
        int count=0; p=i; sum=0;
        while(sum<=k && p<nums.length){
            sum=sum+nums[p++];
            count++;
            
            if (sum==k){
                maxcount=Math.max(count,maxcount);
            }
        }
       }
       return maxcount;
    }

    public static void main(String[] args) {
        int nums[]={-3,2,1};
        System.out.println(longestSubarray(nums,0));
    }
}
