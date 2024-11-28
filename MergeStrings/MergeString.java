class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder outStr = new StringBuilder();
        int i = 0, j = 0;

        // Add letters in alternating order
        while (i < word1.length() && j < word2.length()) {
            outStr.append(word1.charAt(i++));
            outStr.append(word2.charAt(j++));
        }

        // Append the remaining letters from word1 or word2
        while (i < word1.length()) {
            outStr.append(word1.charAt(i++));
        }
        while (j < word2.length()) {
            outStr.append(word2.charAt(j++));
        }

        return outStr.toString();
    }
}