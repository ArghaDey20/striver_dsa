
class Solution {
    public static void moveZeroes(int[] nums) {
        int count=0;
        for(int i =0;i<nums.length; i++){
            if(nums[i]==0){
                count++;
                for(int j=i;j<nums.length-1;j++){
                    nums[j]=nums[j+1];
                }
                i--; //recheck the same index becoz we have shifted and there might be a zero at this index
               
            }
            
        }
        System.out.println("\n"+count);
        while(count>0){
            nums[nums.length-count]=0;
            count--;
        }
    
    }

    public static void main(String args[]){
        int arr[]={0,3,0,1,0,2,0};
        moveZeroes(arr);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ " , ");
        }
       
    }
}
