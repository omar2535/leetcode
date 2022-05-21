class Solution:
    def hammingWeight(self, n: int) -> int:
        total = 0
        for i in str(bin(n))[2:]:
            if i == '1':
                total += 1
        return total