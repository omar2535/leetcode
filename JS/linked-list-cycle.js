
//Definition for singly-linked list.
function ListNode(val) {
    var obj = {
        val: val,
        next: null,
    };
    return obj;
}

var firstNode = ListNode(1);
var secondNode = ListNode(2);
var thirdNode = ListNode(3);

firstNode.next = secondNode;
secondNode.next = thirdNode;
thirdNode.next = firstNode;

/**
 * @param {ListNode} head
 * @return {boolean}
 */
var hasCycle = function (head) {
    var curr = head;
    var set = [];
    if(head == null){
        return false;
    }
    while (curr.next != null) {
        if(set.includes(curr)){
            return true;
        }
        set.push(curr);
        curr = curr.next;
    }
    return false;
};

console.log(hasCycle(firstNode));