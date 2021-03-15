require_relative '../problem/easy/7.reverse-integer'

RSpec.describe "Probrem 7" do
  it "x=123 then return=321" do
    expect(reverse(123)).to eq(321)
  end

  it "x=-123 then return=-321" do
    expect(reverse(-123)).to eq(-321)
  end

  it "x=120 then return=21" do
    expect(reverse(120)).to eq(21)
  end

  it "x=0 then return=0" do
    expect(reverse(0)).to eq(0)
  end

  it "x=1534236469 then return=0" do
    expect(reverse(1534236469)).to eq(0)
  end

  it "x=-2147483648 then return=0" do
    expect(reverse(-2147483648)).to eq(0)
  end
end
