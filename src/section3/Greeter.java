package section3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String nameInput = JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null,"Hello "+ nameInput + "!");
	String feelInput = JOptionPane.showInputDialog("How are you today");
	JOptionPane.showMessageDialog(null, feelInput + ", that's interesting");
}
}
