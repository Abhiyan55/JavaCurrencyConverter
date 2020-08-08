

import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 

 	public class CurrencyConverter implements ActionListener {

		public static void main(String[] args){
			new CurrencyConverter();
		}
		
		JFrame f;
		JButton b1,b2;
		JTextField t1;
		JLabel l1,l2,l3,l4,l5,l6,l7,l8;
		JComboBox c1,c2;
		double value=0.0;
		String[] currencies1 = {"USD", "NRS", "EUR"};
		String[] currencies2 = {"NRS", "USD", "EUR"};

	CurrencyConverter() {
		
		f= new JFrame();
		f.setSize(450,350);
		f.setBounds(450,250,500,350);
		
		l1 = new JLabel("CURRENCY CONVERTER");
		l1.setBounds(165, 0, 150, 50);
		l2 = new JLabel("Enter amount");
		l2.setBounds(175, 120, 250, 74);
		t1 = new JTextField("0");
		t1.setBounds(260, 145, 55, 20);
		b1 = new JButton("Convert");
		b1.setBounds(153, 200, 89, 23);
		l3 = new JLabel("Amount:");	
		l3.setBounds(213, 240, 89, 23);
		l4 = new JLabel("--");
		l4.setBounds(266, 240, 200, 23);
		c1 = new JComboBox(currencies1);
		c1.setBounds(150, 92, 65, 28);
		c2 = new JComboBox(currencies2);
		c2.setBounds(300, 92, 65,28);
		l5 = new JLabel(" (Select Your Prefered Currency) ");
		l5.setBounds(135, 45, 250,50);
		l6 = new JLabel("FROM:");
		l6.setBounds(100, 92, 65, 28);
		l7 = new JLabel("TO:");
		l7.setBounds(270, 92, 65, 28);
		b2 = new JButton("Reset");
		b2.setBounds(270, 200, 89, 23);
		l8 = new JLabel();
		l8.setBounds(148, 263, 280, 23);
		
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
		f.add(b2);
		f.add(l8);
		
		b1.addActionListener(this); 
		b2.addActionListener(this);
		b1.setActionCommand("Convert");
		b2.setActionCommand("Reset");
		
		f.setResizable(false);			 // disables full screen
		f.setLayout(null);
		f.setVisible(true);   
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);                  
		}

	
		public void actionPerformed(ActionEvent ae) {		
		
			String m=ae.getActionCommand();
			
			if(m.equals("Convert")) {          //Condition for Convert


			double num1=Double.parseDouble(t1.getText());
			

			if(c1.getSelectedItem().equals("USD")&& c2.getSelectedItem().equals("NRS")) {

				double value = num1 * 124;
				l4.setText("Rs. " + value );	
			}

			if(c1.getSelectedItem().equals("NRS")&& c2.getSelectedItem().equals("USD")) {

				double value = num1 * 0.0083;
				l4.setText( "$ " + value  );	
			}
			
			if(c1.getSelectedItem().equals("USD")&& c2.getSelectedItem().equals("EUR")) {

				double value = num1 * 0.85;
				l4.setText( "€ " + value  );	
			}

			if(c1.getSelectedItem().equals("EUR")&& c2.getSelectedItem().equals("NRS")) {

				double value = num1 * 142.5;
				l4.setText( "Rs. " + value  );	
			}

			if(c1.getSelectedItem().equals("NRS")&& c2.getSelectedItem().equals("EUR")) {

				double value = num1 * 0.00701;
				l4.setText( "€ " + value  );	
			}
			
			if(c1.getSelectedItem().equals("EUR")&& c2.getSelectedItem().equals("USD")) {

				double value = num1 * 1.18;
				l4.setText( "$ " + value  );	
			}
			
			if(c1.getSelectedItem().equals("EUR")&& c2.getSelectedItem().equals("USD")) {

				double value = num1 * 1.19;
				l4.setText( "$ " + value  );	
			}
			
			if(c1.getSelectedItem().equals("USD")&& c2.getSelectedItem().equals("USD")) {

				l8.setText( " Please select different currency. " );	
			}

			if(c1.getSelectedItem().equals("EUR")&& c2.getSelectedItem().equals("EUR")) {

				l8.setText( " Please select different currency. "  );	
			}

			if(c1.getSelectedItem().equals("NRS")&& c2.getSelectedItem().equals("NRS")) {

			l8.setText( " Please select different currency. " );	
			}
		}


			
		if(m.equals("Reset"))   //condition for Reset


		{
		t1.setText("0");
    		l4.setText("--");
		l8.setText("");
		}

		
			

		}	
		
	}