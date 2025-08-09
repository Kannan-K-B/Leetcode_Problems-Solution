class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int[] res = new int[]{-1, -1}; // initialize with -1, -1

        boolean start = false;
        boolean end = false;

        while (left <= right) { // use <= to include all elements
            if (!start && nums[left] == target) {
                res[0] = left;
                start = true;
            }
            if (!end && nums[right] == target) {
                res[1] = right;
                end = true;
            }

            // if both found, break
            if (start && end) break;

            // only move pointers if not found
            if (!start) left++;
            if (!end) right--;
        }

        return res;
    }
}