import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui2 extends JFrame{

	public Gui2(){

	
	JPanel p = new JPanel();
	p.setLayout(new GridLayout(2,2,5,5));
	JLabel txt = new JLabel("Celsius:");
	JTextField fl = new JTextField(15);
	

	JLabel txt1 = new JLabel("Fahrenheit:");
	JTextField f2 = new JTextField(15);

    
	p.add(txt);
	p.add(fl);
	p.add(txt1);
	p.add(f2);
	
	add(p);

	}

}