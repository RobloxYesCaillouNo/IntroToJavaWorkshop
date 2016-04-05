package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
	int degree=90;
		// START HERE
		Robot r2d2=new Robot();
r2d2.penDown();
	r2d2.setPenColor(Color.CYAN);
for (int i = 0; i <34 ; i++) {
	r2d2.move(380);
	r2d2.turn(degree);
}
	
	}	
	
	
	
	}


