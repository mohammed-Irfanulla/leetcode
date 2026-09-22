class Solution(object):
    def checkPerfectNumber(self, num):
        """:type num: int

        :rtype: bool
        """
        if num <= 1:
            return False

        total = 0
        sqrt_num = int(num**0.5)

        for i in range(1, sqrt_num + 1):
            if num % i == 0:
                total += i
                # Add the complementary divisor if it's not the square root and not 1 (the number itself)
                other = num // i
                if i != 1 and other != i:
                    total += other

        return total == num
