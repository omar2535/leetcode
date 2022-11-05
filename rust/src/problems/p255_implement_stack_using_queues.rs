#[allow(dead_code)]

struct MyStack {
    stack: Vec<i32>
}


/** 
 * `&self` means the method takes an immutable reference.
 * If you need a mutable reference, change it to `&mut self` instead.
 */
impl MyStack {

    fn new() -> Self {
        return MyStack { stack: Vec::new() };
    }
    
    fn push(&mut self, x: i32) {
        self.stack.push(x);
    }
    
    fn pop(&mut self) -> i32 {
        let s = match self.stack.pop() {
            Some(s) => {s},
            None => {panic!("no")},
        };
        return s;
    }
    
    fn top(&self) -> i32 {
        return *self.stack.last().unwrap();
    }
    
    fn empty(&self) -> bool {
        return self.stack.len() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * let obj = MyStack::new();
 * obj.push(x);
 * let ret_2: i32 = obj.pop();
 * let ret_3: i32 = obj.top();
 * let ret_4: bool = obj.empty();
 */

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_1() {

    }
}
