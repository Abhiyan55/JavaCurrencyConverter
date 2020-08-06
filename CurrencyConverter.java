
import java.awt.*;
import javax.swing.*;

 	class CurrencyConverter extends JFrame {

		public static void main(String[] args){
			CurrencyConverter g=new CurrencyConverter();
		}

	JButton b1,b2,b3;
	CurrencyConverter(){
		setSize(400,400);
		setVisible(true);

		b1=new JButton("Conver to USD");
		b2=new JButton("Convert to NRS");
		b3=new JButton("RESET");
		add(b1);
		add(b2);
		add(b3);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		}

		
	}