package leetcode.easy7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ReverseIntegerTest {

  @ParameterizedTest
  @CsvSource({ "123,321", "-123,-321", "120, 21", "0, 0", "1534236469, 0" })
  void test(int excpected, int actual) {
    Solution solution = new Solution();
    assertEquals(actual, solution.reverse(excpected));
  }
}
