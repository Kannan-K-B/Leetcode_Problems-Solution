class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hash = new HashSet<>();
        int left=0;
        int max=0;
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            while(hash.contains(ch)){
                hash.remove(s.charAt(left));
                left++;
            }
            hash.add(ch);
            max = Math.max(max,right-left+1);
        }
        return max;

    }
}