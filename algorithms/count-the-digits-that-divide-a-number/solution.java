class Solution {
    public int mostWordsFound(String[] sentences) {
        int res = 0;
        for(int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split(" ");
            if(words.length > res) {
                res = words.length;
            }
            }
            return res;
    }
}