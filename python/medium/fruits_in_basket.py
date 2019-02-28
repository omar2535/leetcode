import math
import pdb

# TODO: Not working
class Solution(object):
    def totalFruit(self, tree):
        """
        :type tree: List[int]
        :rtype: int
        """
        if len(tree) == 1: return 1
        longest_chain_type = [None, None] # holds the longest chain type
        chain_interval_count = [0,0]
        longest_chain_interval = 0

        current_chain = 0
        for tree_type in tree:
            if(longest_chain_type[0] is None):
                longest_chain_type[0] = tree_type
            elif(longest_chain_type[1] is None and tree_type != longest_chain_type[0]):
                longest_chain_type[1] = tree_type

            if tree_type in longest_chain_type:
                current_chain += 1
                chain_interval_count[longest_chain_type.index(tree_type)] += 1
                if current_chain >= longest_chain_interval: longest_chain_interval = current_chain
            else:
                longest_chain_type = [longest_chain_type[1], tree_type]
                chain_interval_count[0] = chain_interval_count[1]
                chain_interval_count[1] = 1
                current_chain = 1 + chain_interval_count[0]
        return longest_chain_interval
