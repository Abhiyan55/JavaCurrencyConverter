// Currency Converter Version 1.2


import java.awt.*;
import javax.swing.*;

 	class CurrencyConverter extends JFrame {

		public static void main(String[] args){
			CurrencyConverter g=new CurrencyConverter();
		}

	JButton b1;
	CurrencyConverter(){
		setSize(500,500);
		
		JLabel l = new JLabel("Enter amount in NRS (Rs.)");
		JTextField t1 = new JTextField(4);
		b1=new JButton("Convert to USD");	
		
		
		add(l);
		add(t1);
		add(b1);
		

		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);                       

		}

		
	}