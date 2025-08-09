class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 1){
         return s;
    }
        int left=0,right=0;
        for(int i=0;i<s.length();i++){
            int len1 = isPalindrome(s,i,i);
            int len = isPalindrome(s,i,i+1);
            int max = Math.max(len1,len);
            if(max > right - left){
                left = i-(max - 1) / 2;
                right = i + max/2;
            }
        }
        return s.substring(left,right+1);
    }
    public static int isPalindrome(String s, int left , int right){
        while(left>= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left-1;
    }
}