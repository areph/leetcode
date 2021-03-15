#
# @lc app=leetcode id=7 lang=ruby
#
# [7] Reverse Integer
#

# @lc code=start
# @param {Integer} x
# @return {Integer}
def reverse(x)
  result = x.to_s.chars.reverse.join
  i = result.to_i
  if x < 0 then
    return 0 if -(i) < -2147483648
    return -(i)
  end
  return 0 if i > 2147483647
  return i
end
# @lc code=end

