use std::{collections::HashMap, hash::Hash};

struct Solution;

impl Solution {
    pub fn is_anagram(s: String, t: String) -> bool {
        let mut tracker = HashMap::new();

        for c in s.chars() {
            if tracker.contains_key(&c) {
                *tracker.get_mut(&c).unwrap() += 1;
            } else {
                tracker.insert(c, 1);
            }
        }

        for c in t.chars() {
            if !tracker.contains_key(&c) {
                return false;
            } else {
                *tracker.get_mut(&c).unwrap() -= 1;
                if *tracker.get(&c).unwrap() == 0 {
                    tracker.remove(&c);
                }
            }
        }

        if tracker.keys().len() != 0 {
            return false;
        }
        
        return true;
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_1() {
        let s = String::from("anagram");
        let t = String::from("nagaram");
        assert_eq!(true, Solution::is_anagram(s, t));
    }

    #[test]
    fn test_2() {
        let s = String::from("taar");
        let t = String::from("caar");
        assert_eq!(false, Solution::is_anagram(s, t));
    }
}
