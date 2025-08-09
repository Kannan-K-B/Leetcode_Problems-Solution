class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 1) return true;
        for(int i=1;i<31;i++){
            int vidai =(int) Math.pow(2,i);
            if(vidai == n){
                return true;
            }
        }
        return false;
    }
}