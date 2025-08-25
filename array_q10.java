class Solution {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        
        // expected sum of numbers from 0 to n
        int expectedSum = n * (n + 1) / 2;
        
        // actual sum of array elements
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        
        // missing number = difference
        return expectedSum - actualSum;
    }

    public static void main(String args[]) {
        int arr[] = {0, 2, 3, 1, 4};
        System.out.println(missingNumber(arr));  // Output: 5
    }
}
