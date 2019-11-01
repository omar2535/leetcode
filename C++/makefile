# # Makefile for my leetcode project

# # *****************************************************
# # Variables to control Makefile operation

CXX = g++
CXXFLAGS = -Wall -g

# # ****************************************************
# # Targets needed to bring the executable up to date
# # add new files after main.o

# main: main.o
# 	$(CXX) $(CXXFLAGS) -o main main.o Solution.o

# main.o: main.cpp Solution.h
# 	$(CXX) $(CXXFLAGS) -c main.cpp Solution.cpp

# Solution.o: Solution.h

main: main.o Solution.o
	$(CXX) main.o Solution.o -o main

main.o: main.cpp
	$(CXX) -c main.cpp

Solution.o: Solution.cpp
	$(CXX) -c Solution.cpp

clean:
	rm *.o main