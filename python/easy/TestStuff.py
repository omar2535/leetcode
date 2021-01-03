class Solution(object):
    def start(self, S, K):
        # write your code in Python 3.6
        number_of_dashes_available = S.count('-')
        remove_dashes = S.replace('-', '')
        upper_case = remove_dashes.upper()
        
        reverse_string = upper_case[::-1]
        reversed_output_str = ''
        string_built = ''
        
        for index, character in enumerate(reverse_string):
            if(number_of_dashes_available > 0):
                string_built += character
                if(index % K == 0):
                    reversed_output_str += (string_built + '-')
                    string_built = ''
            else:
                break
        return reversed_output_str[::-1]
    