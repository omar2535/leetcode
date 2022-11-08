struct Solution;

impl Solution {
    pub fn third_max(nums: Vec<i32>) -> i32 {
        if nums.len() == 1 {
            return nums[0];
        }
        return 0;        
    }
}


#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_1() {
    }

}
