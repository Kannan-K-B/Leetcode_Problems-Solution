class Solution {
    public int divide(int divi, int div) {
        if(divi==Integer.MIN_VALUE && div==-1) return Integer.MAX_VALUE;
        else return (divi/div);
    }
}