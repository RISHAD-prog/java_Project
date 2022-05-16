import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project4 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5;
		JTextField t1,t2;
		JButton b1,b2,b3,b4,b5; 
		JPanel p1,p2;
		 JPasswordField passPF;
		 
			
				
		
		
	public Project4()
	{
		super(" Admin2 ");
		this.setSize(1500,750);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1500,730));
		p1.setBackground(Color.cyan);
		p1.setLayout(null);
		
		ImageIcon icon = new ImageIcon("Background3.jpg");
		l4 = new JLabel(icon);
		l4.setBounds(0,-400,250,1500);
		p1.add(l4);
		
		l5 = new JLabel("Admin");
		l5.setFont(new Font("Cooper Black",Font.BOLD,50));
		l5.setForeground(Color.black);
		l5.setBounds(590,10,400,60);
		p1.add(l5);
		
		b1 = new JButton("Show User");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.setBounds(570,130,300,25);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("Show Balance");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.setBounds(570,230,300,25);
		b2.addActionListener(this);
		p1.add(b2);
		
		
		
		l1 = new JLabel("Change Password");
		l1.setFont(new Font("Serif",Font.BOLD,30));
		l1.setForeground(Color.BLUE);
		l1.setBounds(370,330,250,40);
		p1.add(l1);
		
		passPF = new JPasswordField( );
        passPF.setBounds(670,330,150,25);
		passPF.setEchoChar('*');
        p1.add(passPF);
		
		b3 = new JButton("Show Password");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		b3.setBounds(570,430,300,25);
		b3.addActionListener(this);
		p1.add(b3);
		
		ImageIcon icon2 = new ImageIcon("Background3.jpg");
		l2= new JLabel(icon2);
		l2.setBounds(1260,-400,250,1500);
		p1.add(l2);
		
		p2 = new JPanel();
		p2.setSize(new Dimension(1500,750));
		p2.setBackground(Color.gray);
		p2.setLayout(null);
	    
		l2 = new JLabel();
		l2.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l2.setForeground(Color.white);
		l2.setBounds(250,500,1000,100);
		p2.add(l2);
		

        b5 = new JButton("Back");
		b5.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b5.setForeground(Color.white);
		b5.setBackground(Color.green);
		b5.setBounds(250,650,80,30);
		b5.addActionListener(this);
		p1.add(b5);		
		
		
		
		
		
		
		this.add(p1);
        this.add(p2);

		
		
         		
        
	}
	public void actionPerformed(ActionEvent ae)
		{
			 
             String password = passPF.getText(); 
              if(ae.getSource()==b1)
			{
				l2.setText(" Hello Rishad ");
			}
			 if(ae.getSource()==b2)
			{
				l2.setText("Balance is 5000");
			}
			 if(ae.getSource()==b3)
			{
				if(password.trim().equals(passPF.getText()))
				{l2.setText("New Password"+" "+password);}
			}
			if(ae.getSource()==b5)
			{
				Project3 f = new Project3();
				this.setVisible(false);
				f.setVisible(true);
		    }
		}			 
        
			
}
