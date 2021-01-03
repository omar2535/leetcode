
 var ListNode = require('./linkedList');
 
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
 function ListNode(val) {
    this.val = val;
    this.next = null;
 }
var addTwoNumbers = function (l1, l2) {
    var arr1 = [];
    var arr2 = [];
    while(l1!= null){
        arr1.push(l1.val);
        l1 = l1.next;
    }
    while(l2!=null){
        arr2.push(l2.val);
        l2 = l2.next;
    }
    arr1 = arr1.reverse();
    arr2 = arr2.reverse();
    //console.log(arr1);
    //console.log(arr2);
    var num1=0;
    var num2=0;
    for(let i=0; i<arr1.length; i++){
        num1 = num1+arr1[i]*Math.pow(10,i);
        num2 = num2+arr2[i]*Math.pow(10,i);
    }
    //console.log(num1);
    //console.log(num1+num2);
    var total = num1+num2;
    var stringTotal = total.toString();
    
    var ret = ListNode(0);
    var retCopy = ret;
    //console.log(stringTotal.length);
    for(var i=stringTotal.length-1; i>=0; i--){
        var newNode = ListNode(0);
        retCopy.val = stringTotal.charAt(i);
        retCopy.next = newNode;
        retCopy = retCopy.next;
    }
    console.log(ret.val);
    console.log(ret.next.val);
    console.log(ret.next.next.val);
    return ret;
    // var total = num1+num2;
    // console.log(total);
    // return num1+num2;
};

var list11 = ListNode(2);
var list12 = ListNode(4);
var list13 = ListNode(3);
var list21 = ListNode(5);
var list22 = ListNode(6);
var list23 = ListNode(4);
list11.next = list12;
list12.next = list13;
list21.next = list22;
list22.next = list23;

addTwoNumbers(list11, list21);
