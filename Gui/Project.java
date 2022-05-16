import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4;
		JTextField t1,t2;
		JButton b1,b2,b3; 
		JPanel p1,p2;
		ImageIcon icon;
		ImageIcon icon2;

		
		
	public Project()
	{
		super(" Login Register ");
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
		
		l1 = new JLabel("Econometry ");
		l1.setFont(new Font("Cooper Black",Font.BOLD,50));
		l1.setForeground(Color.black);
		l1.setBounds(470,10,400,60);
		p1.add(l1);
		
		l3 = new JLabel(" By CodeGrammer ");
		l3.setFont(new Font("Forte",Font.BOLD,40));
		l3.setForeground(Color.black);
		l3.setBounds(590,90,400,40);
		p1.add(l3);
	
		 
		 
		b1 = new JButton("Admin");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,30));
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.setBounds(610,210,200,30);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("General");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,30));
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.setBounds(610,310,200,30);
		b2.addActionListener(this);
		p1.add(b2);
		
		b3 = new JButton("Manual");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,30));
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		b3.setBounds(610,410,200,30);
		b3.addActionListener(this);
		p1.add(b3);
		
		ImageIcon icon2 = new ImageIcon("Background3.jpg");
		l2 = new JLabel(icon2);
		l2.setBounds(1260,-400,250,1500);
		p1.add(l2);
		
		
		
		
		
        this.add(p1);		
        
	}
	public void actionPerformed(ActionEvent ae)
		{
		   if(ae.getSource()==b1)
			{
			    Project2 pr = new Project2();
				this.setVisible(false);
				pr.setVisible(true);
				

			}
			if(ae.getSource()==b2)
			{
			    Project5 pr = new Project5();
				this.setVisible(false);
				pr.setVisible(true);
				

			}
			if(ae.getSource()==b3)
			{
			    Project24 pr = new Project24();
				this.setVisible(false);
				pr.setVisible(true);
				

			}
			
		}
}
