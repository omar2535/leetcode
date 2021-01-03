class Solution(object):
    def reverseWords(self, input_string):
        """
        :type input_string: str
        :rtype: str
        """
        split_by_spaces = input_string.split(' ')
        return_string = ""
        for index, word in enumerate(split_by_spaces):
            if(index == len(split_by_spaces) - 1):
                return_string += self.reverse_word(word)
            else:
                return_string += (self.reverse_word(word) + ' ')
        return return_string

    def reverse_word(self, word):
        """
        :type word: str
        :rtype: str
        """
        return word[::-1]