struct Solution;

impl Solution {
    pub fn count_segments(s: String) -> i32 {
        if s.len() == 0 {
            return 0;
        }

        let split = s.split(' ');
        let vec: Vec<&str> = split.collect();

        return vec.len() as i32;
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_1() {
        let s: String = String::from("Hello, my name is John");
        assert_eq!(5, Solution::count_segments(s));
    }
}
