class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        string result = ""; // store merged string
        int i = 0;   // pointer for word1
        int j = 0;   // pointer for word2

        // Loop through both strings
        while (i < word1.length() && j < word2.length()) {
            result += word1[i++]; // Add current char from word1
            result += word2[j++]; // Add current char from word2
        }
        // Append the remaining char of word1
        while (i < word1.length()) {
            result += word1[i++];
        }
        // Append the remaining char of word2
        while (j < word2.length()) {
            result += word2[j++];
        }

        return result;
    }
};