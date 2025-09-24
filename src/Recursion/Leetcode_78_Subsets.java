class Solution {
    // Main function to generate all subsets of the given array
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>(); // This list will store all subsets
        List<Integer> subset = new ArrayList<>();   // Temporary list to store the current subset
        allsubset(nums, 0, res, subset);            // Start recursion from index 0
        return res;                                 // Return the final list of subsets
    }

    // Recursive helper function to generate subsets
    private void allsubset(int[] nums, int index, List<List<Integer>> res, List<Integer> subset) {
        // Base case: if we've considered all elements in nums
        if (index == nums.length) {
            // Add a copy of the current subset to the result list
            res.add(new ArrayList<>(subset));
            return; // Return to the previous recursion level
        }

        // 1. Recursive call without including the current element (exclude it)
        allsubset(nums, index + 1, res, subset);

        // 2. Include the current element in the subset
        subset.add(nums[index]);

        // Recursive call after including the current element
        allsubset(nums, index + 1, res, subset);

        // 3. Backtrack: remove the last added element to try other possibilities
        subset.remove(subset.size() - 1);
    }
}
