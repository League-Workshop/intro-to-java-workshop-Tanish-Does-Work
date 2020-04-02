package section4;

import java.util.Random;

public class random {
public static void main(String[] args) {
	Random randy = new Random();
	int x = randy.nextInt(10); //0-9
	int y =randy.nextInt(26)+50; //50-75
	System.out.println("you got " + y);
	if (x == 53) {
		System.out.println("you win");
	}
		else {
			System.out.println("you lose");
	}
	}
	
}

