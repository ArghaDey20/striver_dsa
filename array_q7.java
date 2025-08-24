class Solution {
    public static void moveZeroes(int[] nums) {
        int count = 0;
        int n = nums.length; // logical size
        int i = 0;

        while (i < n) {
            if (nums[i] == 0) {
                count++;
                for (int j = i; j < n - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                n--; // ✅ array shrinks logically
            } else {
                i++;
            }
        }

        // put zeros at the end
        while (count > 0) {
            nums[n++] = 0;
            count--;
        }
    }

    public static void main(String args[]) {
        int arr[] = {0, 0,3,0,2,0,1,0,3,4,2,0,-1,0};
        moveZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " , ");
        }
    }
}
