#
# @lc app=leetcode id=1 lang=ruby
#
# [1] Two Sum
#

# @lc code=start
# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer[]}
def two_sum(nums, target)
  nums.each_with_index{|value, index|
    nums.each_with_index{|value2, index2|
      next if index2 == 0 || index == index2
      if value + value2 == target then
        return [index, index2]
      end
    }
  }
end
# @lc code=end

