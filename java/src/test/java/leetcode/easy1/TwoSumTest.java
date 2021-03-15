package leetcode.easy1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoSumTest {

  @Test
  void test1() {
    int[] nums = new int[] { 2, 7, 11, 15 };
    int target = 9;
    Solution solution = new Solution();

    int[] actual = solution.twoSum(nums, target);
    assertEquals("[0, 1]", java.util.Arrays.toString(actual));
  }

  @Test
  void test2() {
    int[] nums = new int[] { 3, 2, 4 };
    int target = 6;
    Solution solution = new Solution();

    int[] actual = solution.twoSum(nums, target);
    assertEquals("[1, 2]", java.util.Arrays.toString(actual));
  }

  @Test
  void test3() {
    int[] nums = new int[] { 3, 3 };
    int target = 6;
    Solution solution = new Solution();

    int[] actual = solution.twoSum(nums, target);
    assertEquals("[0, 1]", java.util.Arrays.toString(actual));
  }
}
