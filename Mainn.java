import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Mainn{
	public static void main(String[] args) {

		Calculator frame = new Calculator();
		
		frame.setTitle("Swing Calculator");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,200);
		frame.setVisible(true);

		



	}
}