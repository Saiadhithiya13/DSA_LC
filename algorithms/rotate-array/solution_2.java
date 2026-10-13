class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int a[] = new int[n];
        k = k % n;

        for(int i = n - k; i < n; i++) {
            a[i - (n - k)] = nums[i];
        }
        for(int i = 0; i < n - k; i++) {
            a[i + k] = nums[i];
        }
        for(int i = 0; i < n; i++)
            nums[i] = a[i];
    }
}