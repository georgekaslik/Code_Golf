class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        currentAltitude = 0
        highestAltitude = 0
        
        for i in gain:
            currentAltitude += i
            highestAltitude = max(highestAltitude, currentAltitude)
        
        return highest_altitude