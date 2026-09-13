class Solution {
    public String reverseVowels(String s) {
        
    char arr[] = s.toCharArray();
    int left = 0;
    int right = arr.length - 1;

        while(left < right) {
            while (left < right && !isVowel(arr[left])) {
                left++;
            }

            while (left < right && !isVowel(arr[right])) {
                right--;
            }
            if (isVowel(arr[left]) && isVowel(arr[right])) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
                left++;
                right--;
        }
        return new String(arr);
    }

    public boolean isVowel(char c) {
    return c == 'a' || c == 'A' ||
c == 'e' || c == 'E' ||
c == 'i' || c == 'I' ||
c == 'o' || c == 'O' ||
c == 'u' || c == 'U';
}
}