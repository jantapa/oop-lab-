import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame{

	public Calculator(){
         
        JPanel p = new JPanel();
        
        add(new JTextField(),BorderLayout.NORTH);
        p.setLayout(new GridLayout(4,3,2,2));
		

		JPanel p2 = new JPanel();
		setLayout(new BorderLayout());

		p2.add(new JButton("7"),BorderLayout.CENTER);
		p2.add(new JButton("8"),BorderLayout.CENTER);
		p2.add(new JButton("9"),BorderLayout.CENTER);
		p2.add(new JButton("4"),BorderLayout.CENTER);
		p2.add(new JButton("5"),BorderLayout.CENTER);
		p2.add(new JButton("6"),BorderLayout.CENTER);
		p2.add(new JButton("-"),BorderLayout.CENTER);
		p2.add(new JButton("1"),BorderLayout.CENTER);
		p2.add(new JButton("2"),BorderLayout.CENTER);
        p2.add(new JButton("3"),BorderLayout.CENTER);
        p2.add(new JButton("*"),BorderLayout.CENTER);
        p2.add(new JButton("C"),BorderLayout.CENTER);
        p2.add(new JButton("0"),BorderLayout.CENTER);
        p2.add(new JButton("="),BorderLayout.CENTER);
        p2.add(new JButton("/"),BorderLayout.CENTER);

        add(p);
        
        add(p2);




	}

	public static void main(String[] args) {
        Calculator frame = new Calculator();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
}
}