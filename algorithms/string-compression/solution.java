class Solution {
    public int reverseDegree(String s) {
        char[] charArray = s.toCharArray();
        int res = 0;
        int n = charArray.length;
        for(int i = 0; i < n; i++) {
            res += (i + 1) * ('z' - charArray[i] + 1);
        }
        return res;
    }
}