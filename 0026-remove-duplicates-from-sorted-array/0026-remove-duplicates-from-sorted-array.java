class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!list.contains(nums[i])) list.add(nums[i]);
        }
        int[] res = new int[nums.length];
        int ind = 0;
        for(int i : list){
            res[ind++] = i;
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = res[i];
        }

        return list.size();
    }
}