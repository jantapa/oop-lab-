import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Cat extends JFrame{

	public Cat(){

	
	JPanel p = new JPanel();
	p.setLayout(new FlowLayout());
	JLabel txt = new JLabel("Counter");
	JTextField fl = new JTextField(10);
	JButton btn = new JButton("Count");

    
	p.add(txt);
	p.add(fl);
	p.add(btn);


	add(p);

	}

}