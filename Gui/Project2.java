import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project2 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5;
		JTextField t1,t2;
		JButton b1,b2,b3; 
		JPanel p1,p2;
		 JPasswordField passPF;
		 
			
		
	public Project2()
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
		l1.setBounds(580,10,400,60);
		p1.add(l1);
		
		l4 = new JLabel("Admin Name");
		l4.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l4.setForeground(Color.blue);
		l4.setBounds(470,130,400,60);
		p1.add(l4);
		
		l1 = new JLabel("Admin Password");
		l1.setFont(new Font("Serif",Font.BOLD,30));
		l1.setForeground(Color.BLUE);
		l1.setBounds(470,230,400,30);
		p1.add(l1);
		
		t1 = new JTextField();
		t1.setBounds(800,150,100,25);
		p1.add(t1);
		
		
		
		passPF = new JPasswordField( );
        passPF.setBounds(800,240,100,25);
		passPF.setEchoChar('*');
        p1.add(passPF);

		
		b1 = new JButton("Login");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.setBounds(580,330,200,25);
		b1.addActionListener(this);
		p1.add(b1);
		
		ImageIcon icon2 = new ImageIcon("Background3.jpg");
		l5 = new JLabel(icon2);
		l5.setBounds(1260,-400,250,1500);
		p1.add(l5);
		
		p2 = new JPanel();
		p2.setSize(new Dimension(1500,750));
		p2.setBackground(Color.gray);
		p2.setLayout(null);
	    
		l2 = new JLabel();
		l2.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l2.setForeground(Color.white);
		l2.setBounds(250,400,1000,100);
		p2.add(l2);
		
		b2 = new JButton("Next");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.white);
		b2.setBackground(Color.green);
		b2.setBounds(1170,550,80,30);
		b2.addActionListener(this);
		p1.add(b2);

        b3 = new JButton("Back");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.setForeground(Color.white);
		b3.setBackground(Color.green);
		b3.setBounds(260,550,80,30);
		b3.addActionListener(this);
		p1.add(b3);		
		
		
		
		
		
        this.add(p1);
         this.add(p2);		
        
	}
	public void actionPerformed(ActionEvent ae)
		{
             final String userName = t1.getText();
             final String password = passPF.getText();
             if (userName.trim().equals("admin") && password.trim().equals("admin"))
		     {
			 l2.setText(" Hello " + userName + "");
			 }
            else 
			{
              l2.setText(" Invalid user.. ");
            } 
          if(ae.getSource()==b2)
			{
				Project3 f = new Project3();
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
