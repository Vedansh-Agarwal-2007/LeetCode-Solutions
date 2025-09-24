class Solution {
    static List<List<Integer>> arr;
    public List<List<Integer>> subsets(int[] nums) {
        arr = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        allsubset(0,nums,ans);
        return arr;
    }
    public void allsubset(int i, int[] nums, ArrayList<Integer> ans){
        if(i==nums.length){
            ArrayList<Integer> list = new ArrayList<>();
            for(int x=0;x<ans.size();x++){
                list.add(ans.get(x));
            }
            arr.add(list);
            return;
        }
        allsubset(i+1,nums,ans);
        ans.add(nums[i]);
        allsubset(i+1,nums,ans);
        ans.remove(ans.size()-1);
    }
}