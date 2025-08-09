class Solution {
    public int removeDuplicates(int[] nums) {
        // int n = nums.length;
        // int count=0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i] == nums[j]) continue;
        //     }
        // }













        Set<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int index=0;
        for(int i :set){
            nums[index++] = i;
        }
        return set.size();
    }
}