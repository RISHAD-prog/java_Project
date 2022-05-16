import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project6 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5,l6,l7;
		JTextField t1,t2;
		JButton b1,b2,b3; 
		JPanel p1,p2;
		JPasswordField passPF;
		
	public Project6()
	{
		super(" General 2");
		this.setSize(1500,750);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1500,730));
		p1.setBackground(Color.cyan);
		p1.setLayout(null);
		
		ImageIcon icon = new ImageIcon("Background3.jpg");
		l5 = new JLabel(icon);
		l5.setBounds(0,-400,250,1500);
		p1.add(l5);
		
		ImageIcon icon2 = new ImageIcon("Background3.jpg");
		l6= new JLabel(icon2);
		l6.setBounds(1260,-400,250,1500);
		p1.add(l6);
		
		l1 = new JLabel("Login");
		l1.setFont(new Font("Cooper Black",Font.BOLD,50));
		l1.setForeground(Color.black);
		l1.setBounds(590,10,400,60);
		p1.add(l1);
		
		l2 = new JLabel("Phone Number");
		l2.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l2.setForeground(Color.BLUE);
		l2.setBounds(460,120,300,60);
		p1.add(l2);
		
		
		
		l3 = new JLabel("Account Number");
		l3.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
		l3.setForeground(Color.black);
		l3.setBounds(460,230,300,20);
		p1.add(l3);
		
		
		l4 = new JLabel("Password");
		l4.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
		l4.setForeground(Color.green);
		l4.setBounds(460,330,300,20);
		p1.add(l4);
		
		t1 = new JTextField();
		t1.setBounds(660,135,200,25);
		p1.add(t1);
		
		t2 = new JTextField();
		t2.setBounds(680,235,200,25);
		p1.add(t2);
		
		passPF = new JPasswordField( );
        passPF.setBounds(650,335,200,25);
		passPF.setEchoChar('*');
        p1.add(passPF);
		
		b1 = new JButton("Submit");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setBackground(Color.black);
		b1.setForeground(Color.green);
		b1.setBounds(590,400,200,25);
		b1.addActionListener(this);
		p1.add(b1);
		
		p2 = new JPanel();
		p2.setSize(new Dimension(1500,750));
		p2.setBackground(Color.gray);
		p2.setLayout(null);
	    
		l7 = new JLabel();
		l7.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l7.setForeground(Color.white);
		l7.setBounds(250,500,1000,100);
		p2.add(l7);
		
		b2 = new JButton("Next");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.white);
		b2.setBackground(Color.green);
		b2.setBounds(1150,650,80,30);
		b2.addActionListener(this);
		p1.add(b2);

        b3 = new JButton("Back");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.setForeground(Color.white);
		b3.setBackground(Color.green);
		b3.setBounds(250,650,80,30);
		b3.addActionListener(this);
		p1.add(b3);
		
		this.add(p1);
		this.add(p2);
		
		
	}
	public void actionPerformed(ActionEvent ae)
		{
             String phoneNumber = t1.getText();
			  String accNumber=t2.getText();
              String password = passPF.getText(); 
			  if(ae.getSource()==b1)
			{if (phoneNumber.equals(t1.getText()) && accNumber.equals(t2.getText()) && password.equals(passPF.getText()) )
		     {
			 l7.setText(" Hello " + phoneNumber + "");
			 }
		    }
			if(ae.getSource()==b2)
			{
				Project7 f = new Project7();
				this.setVisible(false);
				f.setVisible(true);
			}
           if(ae.getSource()==b3)
			{
				Project f = new Project();
				this.setVisible(false);
				f.setVisible(true);
			}						
			
            
		}			
}