package day5;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
/* Before beginning recipe: 
* 1. ask students to find and explain the method in this recipe. 
* 2. ask students how they might use the method to make the picture in the laminated hand-outs. */

public class StarShow {
	
	Robot XX = new Robot("batman");
	
	void makeStars() {
		
		drawStar(150);	
		// 13. Set the speed to 8

		// 6. Make a variable to hold the X position of the Robot and set it to 10
		int RobotX=10;
		// 7. Make a variable to hold the Y position of the Robot and set it to 950

		// 8. Make a variable to hold the star size and set it to 25

		// 12. Repeat the steps #19 to #18, 30 times

			// 19. Set the pen width to i 
	
			// 10. Set the X position of the robot to your X variable
	
			// 11. Set the Y position of the robot to your Y variable
	
			// 9. Call the drawStar() method with your star size variable
	
			// 14. Increase the X position by star size. See Figure 2.
	
			// 15. decrease the Y position by star size. See Figure 3.
	
			// 16. Increase the star size by 20
	
			// 17. Turn the robot 12 degrees
	
			// 18. Make each star a different random color like in Figure 4. 

	}

	private void drawStar(int starSize) {
XX.penDown();
		for (int i = 0; i < 5; i++) {
	XX.move(starSize);
			XX.turn(144);}}
		

	
	
	public static void main(String[] args) {
		new StarShow().makeStars();
	}
}



