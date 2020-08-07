

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
		JLabel l1,l2,l3,l4,l5,l6,l7;
		JComboBox c1,c2;
		String[] currencies1 = {"USD", "NRS"};
		String[] currencies2 = {"NRS", "USD"};

	CurrencyConverter() {
		
		f= new JFrame();
		f.setSize(450,350);
		f.setBounds(450,300, 450, 300);
		
		l1 = new JLabel("CURRENCY CONVERTER");
		l1.setBounds(135, 0, 150,50);
		l2 = new JLabel("Enter amount");
		l2.setBounds(145, 100, 250, 74);
		t1 = new JTextField("00");
		t1.setBounds(230, 125, 55, 20);
		b1 = new JButton("Convert");
		b1.setBounds(163, 165, 89, 23);
		l3 = new JLabel("Rs.");	
		l3.setBounds(163, 195, 89, 23);
		l4 = new JLabel("--");
		l4.setBounds(186, 195, 89, 23);
		c1 = new JComboBox(currencies1);
		c1.setBounds(120, 82, 65, 28);
		c2 = new JComboBox(currencies2);
		c2.setBounds(270, 82, 65,28);
		l5 = new JLabel(" (Select Your Prefered Currency) ");
		l5.setBounds(115, 35, 250,50);
		l6 = new JLabel("FROM:");
		l6.setBounds(70, 82, 65, 28);
		l7 = new JLabel("TO:");
		l7.setBounds(240, 82, 65, 28);
		
		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(b1);
		f.add(l3);
		f.add(l4);
		f.add(c1);	
		f.add(c2);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		
		b1.addActionListener(this); 
		
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