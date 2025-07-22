
import java.util.HashMap;
import java.util.Map;

class TwoSumss {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> dict = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int t = target - nums[i];

            if (dict.containsKey(t)) {
                //  Correct array creation syntax
                return new int[] { dict.get(t), i };
            }

            dict.put(nums[i], i);
        }

        // Just in case no result is found
        return new int[] {};
    }
}

         
  