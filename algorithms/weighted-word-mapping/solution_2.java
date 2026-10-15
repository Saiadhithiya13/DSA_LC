class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();
        
        for (String word : words) {
            int wordWeight = 0;
            
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                int charIndex = ch - 'a';
                wordWeight += weights[charIndex];
            }
            
            int finalMod = wordWeight % 26;
            
            if (finalMod < 0) {
                finalMod += 26;
            }
            
            char mappedChar = (char) ('z' - finalMod);
            ans.append(mappedChar);
        }
        
        return ans.toString();
    }
}
