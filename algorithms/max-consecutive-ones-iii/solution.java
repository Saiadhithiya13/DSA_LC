class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxOnes = Integer.MIN_VALUE;
        int numReplacements = 0;
        int windowStart = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            if(nums[i] == 0) {
                numReplacements++;
            }
            while(numReplacements > k) {
                if(nums[windowStart] == 0)  {
                    numReplacements--;
                }
                windowStart++;
            }
            maxOnes = Math.max(maxOnes, i - windowStart + 1);
    }

    return maxOnes;
    }
}