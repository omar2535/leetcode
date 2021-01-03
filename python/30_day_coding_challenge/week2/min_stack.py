class MinStack:

    min_order = []
    stack = []

    def __init__(self):
        """
        initialize your data structure here.
        """
        self.min_order = []
        self.stack = []

    def push(self, x: int) -> None:
        self.stack.append(x)
        self.insert_into_min_order(x)

    def pop(self) -> None:
        if(len(self.stack) == 0):
            return
        if(self.stack[len(self.stack)-1] == self.min_order[len(self.min_order)-1]):
            self.min_order = self.min_order[0:len(self.min_order)-1]
            self.stack = self.stack[0:len(self.stack) - 1]
        else:
            self.stack = self.stack[0:len(self.stack) - 1]

    def top(self) -> int:
        if(len(self.stack) == 0):
            return
        return self.stack[len(self.stack)-1]
    
    def getMin(self) -> int:
        if(len(self.stack) == 0):
            return
        return self.min_order[len(self.min_order)-1]

    def insert_into_min_order(self, x:int) -> None:
        if(self.min_order == []):
            self.min_order.append(x)
        elif(self.min_order[len(self.min_order)-1] >= x):
            self.min_order.append(x)

# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(x)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()