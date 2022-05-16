import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project3 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4;
		JTextField t1,t2;
		JButton b1,b2,b3,b4,b5; 
		JPanel p1,p2;
		 JPasswordField passPF;
		 
			final String userName = "admin";
             final    String password = "admin";
				boolean security = false;
		
		
	public Project3()
	{
		super(" Admin ");
		this.setSize(1500,750);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1500,730));
		p1.setBackground(Color.cyan);
		p1.setLayout(null);
		
		ImageIcon icon = new ImageIcon("Background3.jpg");
		l3 = new JLabel(icon);
		l3.setBounds(0,-400,250,1500);
		p1.add(l3);
		
		l1 = new JLabel("Admin");
		l1.setFont(new Font("Cooper Black",Font.BOLD,50));
		l1.setForeground(Color.black);
		l1.setBounds(590,10,400,60);
		p1.add(l1);
		
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
		
		
		b3 = new JButton("Show Password");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		b3.setBounds(570,330,300,25);
		b3.addActionListener(this);
		p1.add(b3);
		
		ImageIcon icon2 = new ImageIcon("Background3.jpg");
		l4 = new JLabel(icon2);
		l4.setBounds(1260,-400,250,1500);
		p1.add(l4);
		
		p2 = new JPanel();
		p2.setSize(new Dimension(1500,750));
		p2.setBackground(Color.gray);
		p2.setLayout(null);
	    
		l2 = new JLabel();
		l2.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l2.setForeground(Color.white);
		l2.setBounds(250,400,1000,100);
		p2.add(l2);
		
		b4 = new JButton("Next");
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b4.setForeground(Color.white);
		b4.setBackground(Color.green);
		b4.setBounds(1170,650,80,30);
		b4.addActionListener(this);
		p1.add(b4);

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
				l2.setText(" Password is017538");
			}
			if(ae.getSource()==b4)
			{
				Project4 f = new Project4();
				this.setVisible(false);
				f.setVisible(true);
		    }
			
			if(ae.getSource()==b5)
			{
				Project2 f = new Project2();
				this.setVisible(false);
				f.setVisible(true);
		    }
		}			
        
			
}
