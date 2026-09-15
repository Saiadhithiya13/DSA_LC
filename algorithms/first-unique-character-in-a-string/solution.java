class Solution {
    public int firstUniqChar(String s) {
        char[] charArray = s.toCharArray();
        int n = charArray.length;
        int res = 0;
        
        for(int i = 0; i < n; i++) {
            boolean unq = true;
            for(int j = 0; j < n; j++) {
                if(i != j && charArray[i] == charArray[j]) {
                    unq = false;
                    break;
                }
            }
        
        if(unq)
            return i;
        }
        return -1;
    }
}