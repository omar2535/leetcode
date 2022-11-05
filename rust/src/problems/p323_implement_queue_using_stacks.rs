#[allow(dead_code)]
struct MyQueue {
    myQueue: Vec<i32>
}


/** 
 * `&self` means the method takes an immutable reference.
 * If you need a mutable reference, change it to `&mut self` instead.
 */
impl MyQueue {

    fn new() -> Self {
        return MyQueue{ myQueue: Vec::new() };
    }
    
    fn push(&mut self, x: i32) {
        self.myQueue.push(x);
    }
    
    fn pop(&mut self) -> i32 {
        let res = match self.myQueue.get(0) {
            Some(ele) => {*ele},
            None => {0},
        };
        self.myQueue.remove(0);
        return res;
    }
    
    fn peek(&self) -> i32 {
        let res = match self.myQueue.get(0) {
            Some(ele) => {*ele},
            None => {0},
        };
        return res;
    }
    
    fn empty(&self) -> bool {
        return self.myQueue.len() == 0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * let obj = MyQueue::new();
 * obj.push(x);
 * let ret_2: i32 = obj.pop();
 * let ret_3: i32 = obj.peek();
 * let ret_4: bool = obj.empty();
 */

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_1() {

    }
}
