package zebra.section1;

import org.jointheleague.graphical.robot.Robot;

public class RobotFreestyle {
	
	public static void main(String[] args) {
		
		// ▼ Write your code BELOW this line ▼
		
		
		// 1. Make a new Robot().  Remember to give it a name!
		Robot rob = new Robot("batman");
		rob.penDown();
		rob.hide();
		rob.setPenWidth(30);
		rob.setSpeed(100);
		
		// 2. Make your robot move()
		rob.move(100);
		// 3. Make your robot turn()  
		rob.turn(90);
		// 4. Make your robot put its penDown()
		rob.penDown();
		// 5. Make your robot move() some more.  What do you see?
		rob.move(100);
		// 6. Can you make your robot draw a square?  A triangle?  Something cool?
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
	rob.move(100);
	rob.penUp();
	rob.turn(90);
	rob.turn(45);
	rob.move(70);
	
	rob.turn(90);
	rob.penDown();
	rob.setAngle(90);
	rob.move(100);
rob.turn(90);
	rob.move(100);
	rob.turn(90);
rob.move(100);
	rob.turn(90);
	rob.move(100);
rob.turn(315);
rob.move(70);
rob.setAngle(180);
rob.move(100);
rob.turn(-45);
rob.move(70);
rob.turn(-45);
rob.move(100);
rob.turn(225);
rob.move(70);
		rob.penUp();
		rob.move(-70);
		rob.setAngle(0);
		rob.move(100);
		rob.turn(-45);
		rob.penDown();
		rob.move(70);
		
		
		
		// Bonus: Can you make your robot sparkle? miniaturize? draw with a different color?
		
		
		// ▲ Write your code ABOVE this line ▲
		
	}
	
}
