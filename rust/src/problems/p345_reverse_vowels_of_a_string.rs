struct Solution;

impl Solution {
    pub fn reverse_vowels(s: String) -> String {
        let sclone = s.clone();
        let vowels = vec!['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'];
        let mut strvowels: Vec<char> = Vec::new();
        for c in s.chars() {
            if vowels.contains(&c) {
                strvowels.push(c);
            }
        }
        let mut newstring = String::new();
        for c in sclone.chars() {
            if vowels.contains(&c) {
                newstring.push(strvowels.pop().unwrap());
            } else {
                newstring.push(c);
            }
        }
        return newstring;
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_1() {
        let s = "hello";
        assert_eq!("holle", Solution::reverse_vowels(s.to_string()));
    }

    #[test]
    fn test_2() {
        let s = "leetcode";
        assert_eq!("leotcede", Solution::reverse_vowels(s.to_string()));
    }
}
