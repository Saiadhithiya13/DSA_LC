class Solution {
    public String firstPalindrome(String[] words) {
    int n = words.length;
    
    for(int i = 0; i < n; i++) {
        String word = words[i];
        if(word.equals(new StringBuilder(word).reverse().toString())) {
        return word;
    }
    }
    return "";
    }
}