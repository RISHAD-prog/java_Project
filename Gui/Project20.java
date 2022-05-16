import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project20 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4;
		JTextField t1,t2;
		JButton b1,b2,b3,b4; 
		JPanel p1,p2;
		ImageIcon icon;
		ImageIcon icon2;

		
		
	public Project20()
	{
		super(" Online page 14 ");
		this.setSize(1500,750);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1500,730));
		p1.setBackground(Color.yellow);
		p1.setLayout(null);
		
		ImageIcon icon = new ImageIcon("Background3.jpg");
		l1= new JLabel(icon);
		l1.setBounds(0,-400,250,1500);
		p1.add(l1);
		
		ImageIcon icon2 = new ImageIcon("Background3.jpg");
		l2= new JLabel(icon2);
		l2.setBounds(1260,-400,250,1500);
		p1.add(l2);
		
		l2 = new JLabel("Choose service");
		l2.setFont(new Font("Cooper Black",Font.BOLD,30));
		l2.setForeground(Color.black);
		l2.setBounds(500,10,300,60);
		p1.add(l2);
		
		 
		b1 = new JButton("Electric Card Recharge");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setBackground(Color.black);
		b1.setForeground(Color.BLUE);
		b1.setBounds(550,200,300,30);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("Water bill payment");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setBackground(Color.black);
		b2.setForeground(Color.red);
		b2.setBounds(550,400,300,30);
		b2.addActionListener(this);
		p1.add(b2);
		
		
		
		
		b3 = new JButton("Back");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.setForeground(Color.white);
		b3.setBackground(Color.green);
		b3.setBounds(250,500,80,30);
		b3.addActionListener(this);
		p1.add(b3);
		
		
		
		
		
        this.add(p1);		
        
	}
	public void actionPerformed(ActionEvent ae)
		{
		   if(ae.getSource()==b1)
			{
			    Project21 pr = new Project21();
				this.setVisible(false);
				pr.setVisible(true);
				
            }
			if(ae.getSource()==b2)
			{
			    Project22 pr = new Project22();
				this.setVisible(false);
				pr.setVisible(true);
				
            }
			if(ae.getSource()==b3)
			{
			    Project7 pr = new Project7();
				this.setVisible(false);
				pr.setVisible(true);
				
            }
			
			
			
		}
}