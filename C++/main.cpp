#include <iostream>
#include <vector>
#include "Solution.cpp"

using namespace std;

int main() {
  cout << "Initializating Leetcode Project" << endl;
  for(int i=0; i<5; i++){
    for(int j=0; j<10; j++) {
      cout << "_";
    }
    cout << "\n";
  }
  Solution fb;
  fb.fizzBuzz(1);

  return 0;
}