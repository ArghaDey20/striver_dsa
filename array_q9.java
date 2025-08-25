import java.util.*;

class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        int[] union = new int[nums1.length + nums2.length];
        int i = 0, j = 0, c = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                if (!elementpresent(union, c, nums1[i])) {
                    union[c++] = nums1[i];
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                if (!elementpresent(union, c, nums1[i])) {
                    union[c++] = nums1[i];
                }
                i++;
            } else {
                if (!elementpresent(union, c, nums2[j])) {
                    union[c++] = nums2[j];
                }
                j++;
            }
        }

        while (i < nums1.length) {
            if (!elementpresent(union, c, nums1[i])) {
                union[c++] = nums1[i];
            }
            i++;
        }

        while (j < nums2.length) {
            if (!elementpresent(union, c, nums2[j])) {
                union[c++] = nums2[j];
            }
            j++;
        }

        return Arrays.copyOf(union, c); // return only filled part
    }

    private boolean elementpresent(int[] nums, int size, int target) {
        for (int i = 0; i < size; i++) {
            if (nums[i] == target) return true;
        }
        return false;
    }
}
