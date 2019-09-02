import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;


public class Gui3 extends JFrame{


	public Gui3(){


		JLabel l = new JLabel("First Number");
		JTextField fd = new JTextField(10);
		JLabel l2 = new JLabel("Seconds Number");
		JTextField fd2 = new JTextField(10);
		JLabel l3 = new JLabel("Result");
		JTextField fd3 = new JTextField(10);
		JButton btn = new JButton("Calculate");

		setLayout(new FlowLayout());
        
        add(l);
        add(fd);
        add(l2);
        add(fd2);
        add(l3);
        add(fd3);
        add(btn);

        btn.addActionListener(

        	new ActionListener(){

               @Override

        		public void actionPerformed(ActionEvent e){
               
               try{

        			String tx1 = fd.getText();
        			String tx2 = fd2.getText();

        			int answer1;
        			int answer2;
        			int z;

        			answer1 = Integer.parseInt(tx1);
        			answer2 = Integer.parseInt(tx2);

        			z = answer1 % answer2;

        			String str = z+"";

        			fd3.setText(" "+str);

                }

                catch(ArithmeticException ex){

                	System.out.println("Error :  "+ex.getMessage());

                }

        		}

        	});


	}




	 public static void main(String[] args) {


	 	Gui3 frame = new Gui3();

	 	frame.setTitle("Modulus");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
	
		
	}



}

