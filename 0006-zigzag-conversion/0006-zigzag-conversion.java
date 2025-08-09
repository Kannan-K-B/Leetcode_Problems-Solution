class Solution {
    public String convert(String s, int n) {
        if(n == 1 || s.length() <= n) return s;
        StringBuilder[] sb = new StringBuilder[n];
        for(int i=0;i<n;i++){
            sb[i] = new StringBuilder();
        }
        int ind = 0;
        boolean dir= false;
       for(char ch : s.toCharArray()){
        sb[ind].append(ch);
        if(ind == 0 || ind == n-1) dir = !dir;
        ind += dir ? 1 : -1; 
       }
       String res = "";
    for(int i=0;i<n;i++){
        res += sb[i];
    }
    return res;
    }
}