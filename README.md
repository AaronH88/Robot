## Description

A robot is to be landed on a plateau on another planet. This plateau, which is rectangular, must be navigated by the robot. The robot’s position and location is represented by a combination of x and y coordinates and a letter representing one of the four cardinal compass points (X,Y, CP). The plateau is divided up into a grid to simplify navigation. An example position might be 0, 0, N, which means the robot is in the bottom left corner and facing North.

In order to control the robot , Earth’s headquarters sends a simple string of letters. The possible letters are ‘L’, ‘R’ and ‘M’. ‘L’ and ‘R’ makes the robot spin 90 degrees left or right respectively, without moving from its current spot. ‘M’ means move forward one grid point, and maintain the same heading. Make a program that given an input of robot’s position and movement orders sent to the robot outputs the resulting robot position


Test Input: 	1 2 N

LMLMLMLMM	

Expected Output:	1 3 N


Test Input: 	3 3 E

MMRMMRMRRM

Expected Output:	5 1 E
