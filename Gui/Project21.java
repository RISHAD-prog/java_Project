import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project21 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5,l6,l7,l8;
		JTextField t1,t2,t3,t4;
		JButton b1,b2,b3,b4,b5; 
		JPanel p1,p2;
		JPasswordField passPF;
		
	public Project21()
	{
		super(" online page 15");
		this.setSize(1500,750);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1500,730));
		p1.setBackground(Color.cyan);
		p1.setLayout(null);
		
		ImageIcon icon = new ImageIcon("Background3.jpg");
		l4= new JLabel(icon);
		l4.setBounds(0,-400,250,1500);
		p1.add(l4);
		
		ImageIcon icon2 = new ImageIcon("Background3.jpg");
		l5= new JLabel(icon2);
		l5.setBounds(1260,-400,250,1500);
		p1.add(l5);
		
		l1 = new JLabel(" Electricity  Bill ");
		l1.setFont(new Font("Cooper Black",Font.BOLD,30));
		l1.setForeground(Color.black);
		l1.setBounds(600,10,300,60);
		p1.add(l1);
		
	
		l3 = new JLabel("Card Number");
		l3.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l3.setForeground(Color.BLUE);
		l3.setBounds(460,100,300,60);
		p1.add(l3);
		
		l1 = new JLabel("Amount");
		l1.setFont(new Font("Serif",Font.BOLD,20));
		l1.setForeground(Color.BLUE);
		l1.setBounds(460,180,300,60);
		p1.add(l1);
		
		
		l7 = new JLabel("Pin Number");
		l7.setFont(new Font("Serif",Font.BOLD,20));
		l7.setForeground(Color.BLUE);
		l7.setBounds(460,270,300,60);
		p1.add(l7);
		
		t1 = new JTextField();
		t1.setBounds(600,120,200,25);
		p1.add(t1);
		
		t2 = new JTextField();
		t2.setBounds(600,200,200,25);
		p1.add(t2);
		
		
		
		
		
		passPF = new JPasswordField( );
        passPF.setBounds(610,290,200,25);
		passPF.setEchoChar('*');
        p1.add(passPF);
		
		b1 = new JButton("Confirm");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setBackground(Color.black);
		b1.setForeground(Color.green);
		b1.setBounds(580,400,300,60);
		b1.addActionListener(this);
		p1.add(b1);
		 
		
		
		
		p2 = new JPanel();
		p2.setSize(new Dimension(1500,750));
		p2.setBackground(Color.gray);
		p2.setLayout(null);
	    
		l8 = new JLabel();
		l8.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l8.setForeground(Color.black);
		l8.setBounds(250,500,1000,100);
		p2.add(l8);
		

        b3 = new JButton("Back");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.setForeground(Color.white);
		b3.setBackground(Color.green);
		b3.setBounds(250,660,80,30);
		b3.addActionListener(this);
		p1.add(b3);
		
		
		
		
		
		
        this.add(p1);
        this.add(p2);		
        
	}
	public void actionPerformed(ActionEvent ae)
		{
             
          final String cardNumber = t1.getText();
			 final String amount=t2.getText();
             final String pin = passPF.getText();
             		 
           if(ae.getSource()==b1)
		   {if (cardNumber.trim().equals(t1.getText()) && amount.trim().equals(t2.getText()) && pin.trim().equals(passPF.getText()))
		     {
			 l8.setText("Electricity Bill paid");
			 }
		   }
		   if(ae.getSource()==b3)
			{
				Project20 f = new Project20();
				this.setVisible(false);
				f.setVisible(true);
		    }
            
            
            		
            
		}			
}