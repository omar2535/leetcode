class Solution:
    def backspaceCompare(self, S: str, T: str) -> bool:
        S = self.calculate_resulting_string(S)
        T = self.calculate_resulting_string(T)
        return S == T

    def calculate_resulting_string(self, S: str) -> str:
        new_string = ""
        for i in range(0, len(S)):
            if(S[i] != '#'):
                new_string += S[i]
            if(S[i] == '#'):
                new_string = new_string[0:len(new_string)-1]
        return new_string
