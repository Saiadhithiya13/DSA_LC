class Solution {
    public int differenceOfSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int sum1 = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            int temp = nums[i];

            while (temp > 0) {
                int digit = temp % 10;
                sum1 += digit;
                temp = temp / 10;
            }
        }

        return Math.abs(sum - sum1);
    }
}