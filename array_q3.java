import java.util.ArrayList;
import java.util.Arrays;
class Solution {

    public static boolean isSorted(ArrayList<Integer> nums) {
        //your code goes here
        for (int i=0;i<nums.size()-1;i++){
            if(nums.get(i)>nums.get(i+1)){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]){
        Integer[] integerArray = {1, 2, 3, 4, 2};

        // Initialize an ArrayList using Arrays.asList()
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(integerArray));
        System.out.println(isSorted(numberList));
    }
}
