import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project7 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4;
		JTextField t1,t2;
		JButton b1,b2,b3,b4,b5; 
		JPanel p1,p2;
		ImageIcon icon;
		ImageIcon icon2;

		
		
	public Project7()
	{
		super(" Online page ");
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
		l2= new JLabel(icon2);
		l2.setBounds(1260,-400,250,1500);
		p1.add(l2);
		
		l3 = new JLabel("Choose option");
		l3.setFont(new Font("Cooper Black",Font.BOLD,50));
		l3.setForeground(Color.black);
		l3.setBounds(590,10,400,60);
		p1.add(l3);
		
		 
		b1 = new JButton("Credit Transfer");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setBackground(Color.black);
		b1.setForeground(Color.BLUE);
		b1.setBounds(590,100,200,30);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("Online Shopping");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setBackground(Color.black);
		b2.setForeground(Color.yellow);
		b2.setBounds(590,200,200,30);
		b2.addActionListener(this);
		p1.add(b2);
		
		b3 = new JButton("Bill Transfer");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		b3.setBounds(590,300,200,30);
		b3.addActionListener(this);
		p1.add(b3);
		
		l1 = new JLabel("Connection Lost ");
		l1.setFont(new Font("Cooper Black",Font.BOLD,30));
		l1.setForeground(Color.black);
		l1.setBounds(550,400,350,60);
		p1.add(l1);
		
		b4 = new JButton("Online Game");
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b4.setBackground(Color.black);
		b4.setForeground(Color.BLUE);
		b4.setBounds(590,500,200,25);
		b4.addActionListener(this);
		p1.add(b4);
		
		b5 = new JButton("Back");
		b5.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b5.setBackground(Color.black);
		b5.setForeground(Color.BLUE);
		b5.setBounds(540,650,80,30);
		b5.addActionListener(this);
		p1.add(b5);
		
		
		
		
		
        this.add(p1);		
        
	}
	public void actionPerformed(ActionEvent ae)
		{
		   if(ae.getSource()==b1)
			{
			    Project8 pr = new Project8();
				this.setVisible(false);
				pr.setVisible(true);
				
            }
			if(ae.getSource()==b2)
			{
			    Project15 pr = new Project15();
				this.setVisible(false);
				pr.setVisible(true);
				
            }
			if(ae.getSource()==b3)
			{
			    Project20 pr = new Project20();
				this.setVisible(false);
				pr.setVisible(true);
				
            }
			if(ae.getSource()==b4)
			{
			    Project23 pr = new Project23();
				this.setVisible(false);
				pr.setVisible(true);
				
            }
			if(ae.getSource()==b5)
			{
			    Project pr = new Project();
				this.setVisible(false);
				pr.setVisible(true);
				
            }
			
			
		}
}