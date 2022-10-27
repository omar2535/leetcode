class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        cur_m = 0
        cur_n = 0
        while True:
            if cur_m >= m+n:
                nums1 = nums1[0:m+n]
                nums1 = [i for i in nums1 if i != 0]
                print(m+n)
                print(nums1)
                return
            num1 = nums1[cur_m]
            num2 = nums2[cur_n]
            if num1 > num2 or num1 == 0:
                nums1.insert(cur_m, num2)
                cur_n += 1
            cur_m += 1
            