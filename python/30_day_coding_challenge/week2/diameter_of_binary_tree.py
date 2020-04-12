# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    def diameterOfBinaryTree(self, root: TreeNode) -> int:
        return self.diamater_of_tree_recursive(root, 0)

    def diamater_of_tree_recursive(self, root: TreeNode, currentDiamater: int) -> int:
        if(root == None):
            return currentDiamater
        if(root.left == None and root.right == None):
            return currentDiamater
        elif(root.left != None and root.right == None):
            return self.diamater_of_tree_recursive(root.left, currentDiamater + 1)
        elif(root.left == None and root.right != None):
            return self.diamater_of_tree_recursive(root.right, currentDiamater + 1)
        else:
            return max(
                self.diamater_of_tree_recursive(root.left, currentDiamater + 1),
                self.diamater_of_tree_recursive(root.right, currentDiamater + 1),
                self.diamater_of_tree_recursive(root.left, 1) + self.diamater_of_tree_recursive(root.right, 1)
            )