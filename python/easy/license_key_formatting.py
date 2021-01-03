import pdb

def licenseKeyFormatting(string, groups):
    """
    :type S: str
    :type K: int
    :rtype: str
    """
    string = string.replace('-', '')
    string = string[::-1].upper()
    string_built = ''
    string_built_total = ''
    for index, character in enumerate(string):
        string_built = string_built + character
        if(index == len(string) - 1):
            string_built_total += string_built
        elif ((index + 1) % groups == 0):
            string_built_total = string_built_total + string_built + '-'
            string_built = ''

    return string_built_total[::-1]
