pub struct Solution;

impl Solution {
    pub fn fizz_buzz(n: i32) -> Vec<String> {
        let mut vec = Vec::new();
        for i in 1..n+1 {
            if i % 3 == 0 && i % 5 == 0 {
                vec.push("FizzBuzz".to_string());
            } else if i % 3 == 0 {
                vec.push("Fizz".to_string());
            } else if i % 5 == 0 {
                vec.push("Buzz".to_string());
            } else {
                vec.push(i.to_string());
            }
        }
        return vec;
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_1() {
        assert_eq!(vec!["1", "2", "Fizz"], Solution::fizz_buzz(3));
    }
}
