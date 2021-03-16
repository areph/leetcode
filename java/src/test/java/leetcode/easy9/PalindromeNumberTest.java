package leetcode.easy9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PalindromeNumberTest {

  @ParameterizedTest
  @CsvSource({ "121, true", "-121, false", "10, false", "-101, false", "11, true", "123454321, true", "123454320, false", "111, true", "0, false" })
  void test(int excpected, boolean actual) {
    Solution solution = new Solution();
    assertEquals(actual, solution.isPalindrome(excpected));
  }
}
