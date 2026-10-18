class Solution {
    public boolean canConstruct(String s, int k) {
        
        if(k > s.length()) {
            return false;
        }

        int count[] = new int[26];

        for(int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        int odd = 0;

        for(int cnt : count) {
            odd += cnt % 2;
        }

        return odd <= k;
    }
}