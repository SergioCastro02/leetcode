package easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 0;; ++i) {
            int x = nums[i];
            int y = target - x;
            if (d.containsKey(y)) {
                return new int[] {d.get(y), i};
            }
            d.put(x, i);
        }
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Resultado: [" + result[0] + ", " + result[1] + "]");
    }
}

