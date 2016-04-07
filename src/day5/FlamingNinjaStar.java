package day5;
import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
 /* Before beginning recipe: 
 * 1. ask students to find and explain the variable in this recipe. 
 * 2. ask students what robot commands they think they will use to make picture in the laminated hand-outs. */

public class FlamingNinjaStar {
	public static void main(String[] args) {

		int baseSize = 300;		//the size of the black part of the star
		int flameSize = 200;		//the length of the flaming arms

		// *14. Use the methods setX and setY to move the ninja star into the center of the screen
		
		// *15. Make some adjustments to see what other kinds of shapes you can make.

		// 1. Make a new robot, and set it's pen down.

		// 13. Make all the code below repeat 25 times
for (int i = 0; i < 25; i++) {
	
}
			Robot bb8=new Robot();
bb8.penDown();
	bb8.setPenColor(170,170,51);	
bb8.setSpeed(10);// 2. Turn the robot 1/8 of a circle
		bb8.turn(360/8);
			// 3. Move the robot 64 pixels
		bb8.move(64);
			
			// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
			bb8.turn(-40);
			// 5. Move the robot the distance in the variable flameSize
			bb8.move(flameSize);
			// 6. Turn the robot 170 degrees
			bb8.turn(170);
			// 7. Move the robot the distance in the variable flameSize (again)
			bb8.move(flameSize);
			// 8. Turn the robot 64 degrees to the right
			bb8.turn(64);
			// 9. Move the robot the distance in the variable baseSize
			bb8.move(baseSize);
			
		
	}

}


