class Solution {
    public int maxArea(int[] nums) {
        int max=0;
        int left=0;
        int right = nums.length-1;
        while(left < right){
            int area = Math.min(nums[left],nums[right]) * (right-left);
         //   System.out.println(area);
            if(area > max){
                max=area;
            }
            if(nums[left] < nums[right]){

                left++;
            }else{
            //left++;
            right--;
            }
        }
        return max;
    }
}