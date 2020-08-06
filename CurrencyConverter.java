

import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 

 	public class CurrencyConverter implements ActionListener {

		public static void main(String[] args){
			new CurrencyConverter();
		}
		
		JFrame f;
		JButton b1;
		JTextField t1;
		JLabel l1,l2,l3,l4;

	CurrencyConverter() {
		
		f= new JFrame();
		f.setSize(450,350);
		f.setBounds(450,300, 450, 300);
		
		l1 = new JLabel("CURRENCY CONVERTER");
		l1.setBounds(135, 10, 150,50);
		l2 = new JLabel("Enter amount in USD");
		l2.setBounds(40, 50, 250, 74);
		t1 = new JTextField(4);
		t1.setBounds(163, 78, 35, 20);
		b1 = new JButton("Convert");
		b1.setBounds(163, 142, 89, 23);
		l3 = new JLabel("Rs.");	
		l3.setBounds(163, 182, 89, 23);
		l4 = new JLabel("--");
		l4.setBounds(186, 182, 89, 23);
		
		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(b1);
		f.add(l3);
		f.add(l4);

		b1.addActionListener(this);  //Action listener is an interface
		
		f.setResizable(false); // disables full screen
		f.setLayout(null);
		f.setVisible(true);   
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);                  
		}

	
		public void actionPerformed(ActionEvent ae) {	
		int num1=Integer.parseInt(t1.getText());
		int value = num1 * 120;
		l4.setText(value + "" );	
		}
		
	}