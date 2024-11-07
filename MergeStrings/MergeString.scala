object Solution {
    def mergeAlternately(word1: String, word2: String): String = {
        val merged = new StringBuilder
        val maxLength = math.max(word1.length, word2.length)
        
        for (i <- 0 until maxLength) {
            if (i < word1.length) merged.append(word1(i))
            if (i < word2.length) merged.append(word2(i))
        }
        
        merged.toString()
    }
}