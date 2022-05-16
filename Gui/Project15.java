import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project15 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4;
		JTextField t1,t2;
		JButton b1,b2,b3,b4,b5; 
		JPanel p1,p2;
		ImageIcon icon;
		ImageIcon icon2;

		
		
	public Project15()
	{
		super(" Online page9 ");
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
		
		 
		b1 = new JButton("Food");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setBackground(Color.black);
		b1.setForeground(Color.BLUE);
		b1.setBounds(540,100,200,30);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("Medicine");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setBackground(Color.black);
		b2.setForeground(Color.yellow);
		b2.setBounds(540,200,200,30);
		b2.addActionListener(this);
		p1.add(b2);
		
		b3 = new JButton("Cloth");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		b3.setBounds(540,300,200,30);
		b3.addActionListener(this);
		p1.add(b3);
		
		
		
		b4 = new JButton("Accessories");
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b4.setBackground(Color.black);
		b4.setForeground(Color.BLUE);
		b4.setBounds(540,400,200,25);
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
			    Project16 pr = new Project16();
				this.setVisible(false);
				pr.setVisible(true);
				
            }
			if(ae.getSource()==b2)
			{
			    Project17 pr = new Project17();
				this.setVisible(false);
				pr.setVisible(true);
				
            }
			if(ae.getSource()==b3)
			{
			    Project18 pr = new Project18();
				this.setVisible(false);
				pr.setVisible(true);
				
            }
			if(ae.getSource()==b4)
			{
			    Project19 pr = new Project19();
				this.setVisible(false);
				pr.setVisible(true);
				
            }
			if(ae.getSource()==b5)
			{
			    Project7 pr = new Project7();
				this.setVisible(false);
				pr.setVisible(true);
				
            }
			
			
			
		}
}