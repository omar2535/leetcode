class Solution(object):
    def findContentChildren(self, greed_list, cookies):
        """
        :type greed_list: List[int]
        :type cookies: List[int]
        :rtype: int
        """
        greed_list.sort()
        cookies.sort()

        content_children = 0
        index_of_cookie_taken = 0

        for boy in greed_list:
            for index, cookie in enumerate(cookies[index_of_cookie_taken:]):
                if(boy <= cookie):
                    index_of_cookie_taken += index
                    content_children += 1
                    break
                    