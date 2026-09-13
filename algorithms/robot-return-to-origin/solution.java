class Solution {
    public int maxSubArray(int[] nums) {
        int maxx = Integer.MIN_VALUE;
            int cs =  0;

            for(int j = 0 ; j < nums.length; j++) {
                cs += nums[j];

                if(cs >  maxx) {
                    maxx = cs; 
                }
                if(cs < 0) {
                    cs = 0;
                }
            }
        
       
                return maxx;
    }
}