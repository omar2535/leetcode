pub struct Solution;


impl Solution {
    pub fn reverse_string(s: &mut Vec<char>) {
        if s.len() == 1 {
            return;
        }
        let midway_point = s.len() / 2;
        for i in 0..midway_point {
            let end_point = s.len() - i - 1;
            s.swap(i, end_point);
        }
    }
}


#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_1() {
        let mut test_arr = vec!['a', 'b', 'c', 'd', 'e'];
        Solution::reverse_string(&mut test_arr);
        assert_eq!(vec!['e', 'd', 'c', 'b', 'a'], test_arr);
    }

    #[test]
    fn test_2() {
        let mut test_arr = vec!['a'];
        Solution::reverse_string(&mut test_arr);
        assert_eq!(vec!['a'], test_arr);
    }

    #[test]
    fn test_3() {
        let mut test_arr = vec!['a', 'b', 'c', 'd'];
        Solution::reverse_string(&mut test_arr);
        assert_eq!(vec!['d', 'c', 'b', 'a'], test_arr);
    }
}
