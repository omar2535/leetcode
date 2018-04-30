/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */

function TreeNode(val){
    var node = {
        val: val,
        left: null,
        right: null,
    };
    return node;
}

var node1 = TreeNode(1);
var node2 = TreeNode(2);
var node3 = TreeNode(3);
var node5 = TreeNode(5);

var node22 = TreeNode(2);
var node21 = TreeNode(1);
var node23 = TreeNode(3);
var node24 = TreeNode(4);
var node27 = TreeNode(7);

node1.left = node3;
node1.right = node2;
node3.left = node5;

node22.left = node21;
node22.right = node23;
node21.right = node24;
node23.right = node27;

/**
 * @param {TreeNode} t1
 * @param {TreeNode} t2
 * @return {TreeNode}
 */
var mergeTrees = function (t1, t2) {
    if(t1 == null){
        return t2;
    }if(t2==null){
        return t1;
    }else{
        t1.val +=t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
    }
    return t1;
};

console.log(mergeTrees(node1, node22));
