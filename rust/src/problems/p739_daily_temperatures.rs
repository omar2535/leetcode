struct Solution;

impl Solution {
    pub fn daily_temperatures(temperatures: Vec<i32>) -> Vec<i32> {
        let mut stack: Vec<i32> = Vec::new();
        let mut ret_arr: Vec<i32> = Vec::new();

        // loop through temperatures from the end
        for i in (0..temperatures.len()).rev() {
            // the last element is always 0
            if stack.len() == 0 {
                ret_arr.push(0);
            }
            else {
                let days = self::Solution::find_days(temperatures[i], &stack);
                ret_arr.push(days);
            }
            stack.push(temperatures[i]);
        }
        
        ret_arr.reverse();
        return ret_arr;
    }

    pub fn find_days(num: i32, stack: &Vec<i32>) -> i32 {
        let mut counter = 0;
        for temp in stack.iter().rev() {
            if *temp > num {
                return counter + 1;
            } else {
                counter += 1;
            }
        }
        return 0;
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_1() {
        let test_arr = vec![73, 74, 75, 71, 69, 72, 76, 73];
        assert_eq!(vec![1, 1, 4, 2, 1, 1, 0, 0], Solution::daily_temperatures(test_arr));
    }

    #[test]
    fn test_2() {
        let test_arr = vec![30,40,50,60];
        assert_eq!(vec![1,1,1,0], Solution::daily_temperatures(test_arr));
    }

    #[test]
    fn test_3() {
        let test_arr = vec![30,60,90];
        assert_eq!(vec![1,1,0], Solution::daily_temperatures(test_arr));
    }
}
