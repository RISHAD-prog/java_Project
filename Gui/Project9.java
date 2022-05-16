import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project9 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4;
		JTextField t1,t2;
		JButton b1,b2,b3,b4; 
		JPanel p1,p2;
		ImageIcon icon;
		ImageIcon icon2;

		
		
	public Project9()
	{
		super(" Online page3 ");
		this.setSize(1500,750);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1500,730));
		p1.setBackground(Color.yellow);
		p1.setLayout(null);
		
		ImageIcon icon = new ImageIcon("Background3.jpg");
		l4= new JLabel(icon);
		l4.setBounds(0,-400,250,1500);
		p1.add(l4);
		
		ImageIcon icon2 = new ImageIcon("Background3.jpg");
		l2= new JLabel(icon2);
		l2.setBounds(1260,-400,250,1500);
		p1.add(l2);
		
		l1 = new JLabel("Choose service");
		l1.setFont(new Font("Cooper Black",Font.BOLD,30));
		l1.setForeground(Color.black);
		l1.setBounds(500,50,300,60);
		p1.add(l1);
	
		 
		b1 = new JButton("Money Transfer");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setBackground(Color.black);
		b1.setForeground(Color.yellow);
		b1.setBounds(540,130,200,30);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("Mobile Recharge");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setBackground(Color.black);
		b2.setForeground(Color.BLUE);
		b2.setBounds(540,230,200,30);
		b2.addActionListener(this);
		p1.add(b2);
		
		
		b3 = new JButton("Back");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.setBackground(Color.black);
		b3.setForeground(Color.red);
		b3.setBounds(540,340,200,30);
		b3.addActionListener(this);
		p1.add(b3);
		
		
		
        this.add(p1);		
        
	}
	public void actionPerformed(ActionEvent ae)
		{
		   if(ae.getSource()==b1)
			{
			    
				Project10 p=new Project10();
				this.setVisible(false);
				p.setVisible(true);

			}
			if(ae.getSource()==b2)
			{
			    
				Project11 p=new Project11();
				this.setVisible(false);
				p.setVisible(true);

			}
			
			if(ae.getSource()==b3)
			{
			    
				Project8 p=new Project8();
				this.setVisible(false);
				p.setVisible(true);

			}
			
			
		}
}