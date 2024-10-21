fn main() {
    let word1 = "abc";
    let word2 = "pqr";
    let merged_word = merge_alternately(word1, word2);
    println!("{}", merged_word);
}

fn merge_alternately(word1: &str, word2: &str) -> String {
    let mut merged_str = String::new();
    let mut iter1 = word1.chars();
    let mut iter2 = word2.chars();

    while let (Some(char1), Some(char2)) = (iter1.next(), iter2.next()) {
        merged_str.push(char1);
        merged_str.push(char2);
    }

    // If one string is longer, append its remaining characters
    merged_str.push_str(iter1.as_str());
    merged_str.push_str(iter2.as_str());

    merged_str
}