package section3;

import javax.swing.JOptionPane;

public class HelloWorld {
public static void main(String[] args) {
	System.out.println("Hello World");
	JOptionPane.showMessageDialog(null,"Task failed successfully");
	String input = JOptionPane.showInputDialog("What day is it today?");
	JOptionPane.showMessageDialog(null,input);
}
}
