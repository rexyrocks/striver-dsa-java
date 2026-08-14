class Solution {
    public int rob(int[] nums) {
        int prev =0 ,  prev1 = 0;
        for(int num : nums){
            int curr = Math.max(prev,prev1+num);
          prev1 = prev;
            prev = curr;
        }
        return prev;
    }
}