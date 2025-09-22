package Arrays;

import java.util.HashMap;
import java.util.Scanner;

class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] ans = {-1, -1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];
            if (map.containsKey(rem)) {
                ans[0] = map.get(rem); // index of the previous number
                ans[1] = i;            // current index
                return ans;            // return immediately when found
            } else {
                map.put(nums[i], i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for array size
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Take array input
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Take target input
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        // Solve Two Sum
        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(nums, target);

        // Display result
        if (result[0] != -1) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No two numbers add up to the target.");
        }

        sc.close();
    }
}
