class Solution {
    public int countDigits(int num) {
        int res;
        int count = 0;
        int original = num;
        while(num > 0) {
            res = num % 10;

            if (res != 0 && original % res == 0) {
                count++;
            }

            num = num / 10;
            }
        return count;
    }
}
