class Solution {
    public int removeElement(int[] nums, int val) {
        int[] arr = new int[nums.length];
        int ind = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
            arr[ind++] = nums[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            nums[i] =  arr[i];
        }
        return ind;
    }
}