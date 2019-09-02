import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Index{

	public static void main(String[] args) {
		Cat f = new Cat();
         f.pack();
 		 f.setTitle("Swing Counter");
		 f.setSize(300, 100);
		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 f.setLocationRelativeTo(null);
		 f.setVisible(true);
	}
}