package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Put all of the game code inside the main method (below) 
	public static void main(String[] args) {
		Random randy = new Random();
	int stun = 1;
		
		ImageIcon dragon = new ImageIcon("src/section4/treasure_hunt.jpg");		

		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
	int playerHealth = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int dragonHealth = 100;
		// 4. Create a variable to hold the damage the player's attack does each round
		int dragonDamage=0;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int playerDamage=0;
		
		// 6.  Delete the slashes at the beginning of the next line.  
	while(playerHealth>0 && dragonHealth>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		String attackType ="";
		while( !(attackType.equalsIgnoreCase("yell") || attackType.equalsIgnoreCase("kick")) ) {
			attackType= JOptionPane.showInputDialog("Do you want to yell or kick");
			attackType = attackType.trim();
			if( !(attackType.equalsIgnoreCase("yell") || attackType.equalsIgnoreCase("kick")) ) {
			JOptionPane.showMessageDialog(null,"That wasn't an answer please try again.");
		}
		}
		// 9. If they typed in "yell":
		if (attackType.equalsIgnoreCase("yell")){
			stun = randy.nextInt(1)+1;
			//-- Find a random number between 0 and 10 and store it in dragonDamage
			dragonDamage = randy.nextInt(16);
			//-- Subtract that number from the dragon's health variable 
			dragonHealth = dragonHealth - dragonDamage;
			
			if (stun != 1) {
				/*	
				 *make it so that it can't hit you for two rounds instead of one
				 */
					
				// 11.  Find a random number between 0 and 35 and store it in playerDamage
				playerDamage = randy.nextInt(36);
				// 12. Subtract this number from the player's health
				playerHealth = playerHealth-playerDamage;
				}
			else { 
				JOptionPane.showMessageDialog( null, "you stunned the dragon, it cant hit you for this round!");
				
			}
		}
		
			
		
	
		// 10. If they typed in "kick":
		if (attackType.equalsIgnoreCase("kick")) {	
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			dragonDamage = randy.nextInt(26);
			//-- Subtract that number from the dragon's health variable
			dragonHealth = dragonHealth - dragonDamage;
			
			// 11.  Find a random number between 0 and 35 and store it in playerDamage
			playerDamage = randy.nextInt(36);
			// 12. Subtract this number from the player's health
			playerHealth = playerHealth-playerDamage;
			
		}
		
		
		// 13. If the user's health is less than or equal to 0
		if (playerHealth <= 0) {
			//-- Tell the user that they lost
			JOptionPane.showMessageDialog(null, "you lost go try again or something \n the game ended with you at " + playerHealth +" and the dragon at " + dragonHealth);
		}
		
		// 14. Else if the dragon's health is less than or equal to 0
		if (dragonHealth <= 0) {
			JOptionPane.showMessageDialog(null, "you killed the dragon even though it was an endangered species and now PETA is mad at you, but at least you got a ton of gold  \n the game ended with you at " + playerHealth +" and the dragon at " + dragonHealth);
			//-- Tell the user that the dragon is dead and they took a ton of gold!
		}
	   //  15.  Else
			else{
				JOptionPane.showMessageDialog(null, "your health is " + playerHealth + " and the dragons health is " + dragonHealth + " You did a total of " + dragonDamage + " and the dragon did " + playerDamage);
			
			
			}
	
			//-- Pop up a message that tells the user their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
		}
	}
}


