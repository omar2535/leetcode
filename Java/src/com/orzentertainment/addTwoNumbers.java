package com.orzentertainment;

import java.util.Stack;

public class addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        ListNode ret = new ListNode(0);
        while(l1 != null){
            s1.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            s2.push(l2.val);
            l2 = l2.next;
        }
        boolean hasCarry = false;
        if(s2.peek() !=null && s1.peek()!= null){
            int num = s2.pop() + s1.pop();
            if(num >= 10){
                hasCarry = true;
            }
            ret = new ListNode(num);
        }
        while(s1.peek() != null|| s2.peek()!= null){
            int Num = 0;
            if(s2.peek() == null) {
                Num = s1.peek()+0;
            }
            if(s1.peek() == null){
                Num = s2.peek()+0;
            }
            else{
                Num = s1.peek() + s2.peek();
            }

            if(hasCarry){
                Num +=1;
            }
            if(Num>=10){
                hasCarry = true;
            }else{
                hasCarry = false;
            }
            ret.next = new ListNode(Num);
            ret = ret.next;
            s1.pop();
            s2.pop();
        }
        return ret;
    }
}
