class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;

        int totalsum = 0;
        for(int i = 0; i < n; i++) {
            totalsum += nums[i];
        }
            int sum1 = 0;

        for (int i = 0; i < n; i++) {
            if(sum1 == totalsum - sum1 - nums[i]) {
                return i;
        }
        
        sum1 += nums[i];
        }
        return -1; 
    }
}