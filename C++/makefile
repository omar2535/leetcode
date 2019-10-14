# Makefile for my leetcode project

# *****************************************************
# Variables to control Makefile operation

CXX = g++
CXXFLAGS = -Wall -g

# ****************************************************
# Targets needed to bring the executable up to date

main: main.o
	$(CXX) $(CXXFLAGS) -o main main.o fizz_buzz.o

main.o: main.cpp
	$(CXX) $(CXXFLAGS) -c main.cpp