class Solution:
    def equalPairs(self, grid: List[List[int]]) -> int:
        n = len(grid)
        row_count = defaultdict(int)
        for row in grid:
            row_count[tuple(row)] += 1
        result = 0
        for j in range(n):
            col = tuple(grid[i][j] for i in range(n))
            result += row_count[col]
        
        return result