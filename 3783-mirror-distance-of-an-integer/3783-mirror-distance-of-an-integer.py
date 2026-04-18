import math
class Solution:
    def mirrorDistance(self, n: int) -> int:
        val = (n - int(str(n)[::-1]))
        if val < 0:
            val = val * -1
        return val
        