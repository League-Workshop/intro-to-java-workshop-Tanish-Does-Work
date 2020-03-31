package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		Robot bob = new Robot("batman");
for( int i = 0; i < 4; i++){
bob.setRandomPenColor();
		}
bob.setSpeed(0);
bob.setPenWidth(100);
bob.hide();
for( int i = 0; i < 1000; i++){
	
	bob.setRandomPenColor();
	bob.setSpeed(1000000);
	bob.penDown();
	//bob.setAngle(i);
	//bob.move(i);
	bob.turn(90);
	bob.move(i);
	int x = bob.getX();
	int y = bob.getY();
	if(x >= 1000) {
		bob.setAngle(-i);
	}
}
		
			
	}
}
