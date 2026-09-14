class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        boolean valid;
        int n;
        for(int i = left; i <= right; i++) {
            int temp = i;
            valid = true;
            int length = String.valueOf(Math.abs(i)).length();
            for(int j = 0; j < length; j++) {
                n = temp % 10;

            if (n == 0) {
                valid = false;
                break;
            }
            
                if(i % n != 0) {
                    valid = false;
                    break;
            }
                temp = temp/10;
            }
            if(valid) 
                res.add(i);
        }
        
        return res;
    }
}