require_relative '../problem/easy/1.two-sum'

RSpec.describe "Probrem 1" do
  it "nums=[2, 7, 11, 15], target=9 then return=[0, 1]" do
    expect(two_sum([2, 7, 11, 15], 9)).to eq([0, 1])
  end

  it "nums=[3, 2, 4], target=6 then return=[1, 2]" do
    expect(two_sum([3, 2, 4], 6)).to eq([1, 2])
  end

  it "nums=[3, 3], target=6 then return=[0, 1]" do
    expect(two_sum([3, 3], 6)).to eq([0, 1])
  end
end
