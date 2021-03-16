require_relative '../problem/easy/9.palindrome-number'

RSpec.describe "Probrem 9" do
  it "x=121 then return=true" do
    expect(is_palindrome(121)).to eq(true)
  end

  it "x=-121 then return=false" do
    expect(is_palindrome(-121)).to eq(false)
  end

  it "x=10 then return=false" do
    expect(is_palindrome(10)).to eq(false)
  end

  it "x=-101 then return=false" do
    expect(is_palindrome(-101)).to eq(false)
  end

  it "x=11 then return=true" do
    expect(is_palindrome(11)).to eq(true)
  end

  it "x=123454321 then return=true" do
    expect(is_palindrome(123454321)).to eq(true)
  end

  it "x=123454320 then return=true" do
    expect(is_palindrome(123454320)).to eq(false)
  end

  it "x=111 then return=true" do
    expect(is_palindrome(111)).to eq(true)
  end

  it "x=0 then return=false" do
    expect(is_palindrome(0)).to eq(false)
  end
end
