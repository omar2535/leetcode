import math 

# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def middleNode(self, head: ListNode) -> ListNode:
        array = []
        while(head.next != None):
            array.append(head)
            head = head.next
        

