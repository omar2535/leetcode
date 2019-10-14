#include "stdafx.h"
#include <iostream>
#include <string>

using namespace std;
class ReverseInteger {
public:
	int reverse(int input) {
		int returnInt = 0;
		string inputAsString = to_string(input);
		string constructedString = "";
		int length = inputAsString.length();
		bool isNegative = false;
		if (length != 0 && inputAsString.at(0) == '-') {
			constructedString += "-";
			isNegative = true;
		}
		if (isNegative == true) {
			for (int i = inputAsString.length() - 1; i > 0; i--) {
				constructedString = constructedString + inputAsString.at(i);
			}
		}
		else {
			for (int i = inputAsString.length() - 1; i >= 0; i--) {
				constructedString = constructedString + inputAsString.at(i);
			}
		}

		cout << constructedString << endl;
		try {
			returnInt = stoi(constructedString);
		}
		catch (exception e) {
			
		}
		

		return returnInt;
	}




};