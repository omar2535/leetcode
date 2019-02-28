def oddEvenJumps(list):
    """
    :type A: List[int]
    :rtype: int
    """
    mappings = {}
    for index, value in enumerate(list):
        pass

# state = 0 = odd
# state = 1 = even
def calculate_mappings_and_check_if_returnable(state, index, list, mappings):
    if(state == 1 and index != len(list)):
        min(list[index:])
    elif(state == 0 and index != len(list)):
        max(list[index])
    elif(index == len(list)):
        return True