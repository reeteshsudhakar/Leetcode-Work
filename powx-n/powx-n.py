class Solution(object):
    def myPow(self, x, n):
        """
        :type x: float
        :type n: int
        :rtype: float
        """
        if n == 0:
            return 1
        elif n == 1:
            return x
        elif n < 0:
            return 1 / self.myPow(x, -n)
        elif n % 2 == 1:
            return self.myPow(x * x, n / 2) * self.myPow(x, 1)
        else: 
            return self.myPow(x * x, n / 2)
        