class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[n + m];
        int index=0;
        for(int i=0;i<n;i++){
            ans[index++] = nums1[i];
        }
        for(int i=0;i<m;i++){
            ans[index++] = nums2[i];
        }
        Arrays.sort(ans);
        double c;
        int len = ans.length;
        if(len % 2 == 0){
            double rem = ans[len/2] + ans[(len/2)-1];
            double x = rem / 2;
            return x;
        }else{
            double rem = ans[len / 2];
            return rem;
        }
    }
}