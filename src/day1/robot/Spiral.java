package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
	Robot RobloxYesCaillouNo=new Robot();
		// 5. Set your robot's pen to the down position
RobloxYesCaillouNo.penDown();
		// 3. Set the robot to go at max speed (10)
RobloxYesCaillouNo.setSpeed(10);
		// 4. Do the following (steps 6-9) 75 times
for (int j = 0; j <75; j++) {RobloxYesCaillouNo.setRandomPenColor();
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
RobloxYesCaillouNo.move(5*j);
			// 2. Turn the robot 1/3 of 360 degrees to the right
RobloxYesCaillouNo.turn(360/3);
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
	RobloxYesCaillouNo.turn(360/3);
	RobloxYesCaillouNo.setPenWidth(j);
	
}
	
	}
	
}
			// 7. Change the pen color to random
	
			// 9. Set the pen width to i

	
