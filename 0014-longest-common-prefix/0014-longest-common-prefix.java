class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        for(int i=1;i<strs.length;i++){
            StringBuilder sb = new StringBuilder();
            String temp = strs[i];
            for(int j=0;j<Math.min(str.length(),temp.length());j++){
                if(str.charAt(j) == temp.charAt(j)){
                    sb.append(str.charAt(j));
                }else{
                    break;
                }
            }
            str = sb.toString();
        }
        return str;
    }
}