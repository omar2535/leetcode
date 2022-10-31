struct Solution;

impl Solution {
    pub fn is_toeplitz_matrix(matrix: Vec<Vec<i32>>) -> bool {
        
        let num_rows: usize = matrix.len();
        let mut my_matrix: Vec<Vec<i32>> = Vec::new();

        if num_rows == 1 {
            return true;
        }

        for (index, row) in matrix.iter().enumerate() {
            let num_times_to_prepend = num_rows - index - 1;

            // prepend first
            let mut new_row = vec![-1; num_times_to_prepend];
            new_row.extend(row);
            // append after
            let append_row = vec![-1; index];
            new_row.extend(append_row);

            // finally, push to main
            my_matrix.push(new_row);
        }

        for i in 0..my_matrix[0].len() {
            let mut checked_num = -2;
            for j in 0..my_matrix.len() {
                println!("{}", my_matrix[j][i]);
                if my_matrix[j][i] != -1 {
                    if checked_num != -2 && my_matrix[j][i] != checked_num {
                        return false;
                    } else {
                        checked_num = my_matrix[j][i];
                    }
                }
            }
        }
        return true;
    }
}


#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_1() {
        let matrix: Vec<Vec<i32>> = vec![vec![1,2,3,4], vec![5,1,2,3], vec![9,5,1,2]];
        let ans: bool = Solution::is_toeplitz_matrix(matrix);
        assert_eq!(true, ans);
    }
}