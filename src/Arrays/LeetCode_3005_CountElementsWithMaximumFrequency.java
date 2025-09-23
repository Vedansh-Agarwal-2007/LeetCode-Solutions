class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        int max = 0;int ans = 0;
        for(int ele:nums){
            freq[ele]++;
            max = Math.max(freq[ele],max);
        }
        for(int ele:freq){
            if(ele==max){
                ans+=ele;
            }
        }
        return ans;
    }
}