class Solution(object):
    def minSteps(self, n):
        """
        :type n: int
        :rtype: int
        """
        memoized_data = {
            0: 0,
            1: 0,
            2: 2,
            3: 3,
            4: 4,
        }
        for i in range(5, n+1):
            largest_factor = self.get_largest_factor(i)
            if(largest_factor == 1):
                memoized_data[i] = i
            else:
                multiple = self.get_multiple(i, largest_factor)
                memoized_data[i] = memoized_data[largest_factor] + multiple

        return memoized_data[n]

    # gets largest factor
    def get_largest_factor(self, n):
        for i in range(n-1, 0, -1):
            if(n % i == 0):
                return i
        return n

    def get_multiple(self, n, factor):
        return n / factor
