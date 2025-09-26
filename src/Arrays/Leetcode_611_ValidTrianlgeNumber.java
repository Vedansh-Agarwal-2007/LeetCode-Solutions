class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int n = nums.length;
        if(n<3){
            return 0;
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]>nums[k]){
                        count++;
                    }
                }
            }
        }
        return count;

    }
}
