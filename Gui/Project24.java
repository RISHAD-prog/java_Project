import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project24 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
		JTextField t1,t2,t3;
		JButton b1,b2,b3,b4; 
		JPanel p1,p2;
		JPasswordField passPF;
		
	public Project24()
	{
		super("Online page18");
		this.setSize(1500,750);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1500,730));
		p1.setBackground(Color.yellow);
		p1.setLayout(null);
		
		ImageIcon icon = new ImageIcon("Background3.jpg");
		l5= new JLabel(icon);
		l5.setBounds(0,-400,250,1500);
		p1.add(l5);
		
		ImageIcon icon2 = new ImageIcon("Background3.jpg");
		l6= new JLabel(icon2);
		l6.setBounds(1260,-400,250,1500);
		p1.add(l6);
		
		l1 = new JLabel("Ecommerce");
		l1.setFont(new Font("Cooper Black",Font.BOLD,20));
		l1.setForeground(Color.black);
		l1.setBounds(550,10,900,30);
		p1.add(l1);
		
		l2 = new JLabel("Asif Hossain Niloy ,CSE, 20-42996-1");
		l2.setFont(new Font("Cooper Black",Font.BOLD,20));
		l2.setForeground(Color.black);
		l2.setBounds(400,60,900,30);
		p1.add(l2);
		
		l3 = new JLabel("Ismail Hossain Rishad,CSE,20-43002-1");
		l3.setFont(new Font("Cooper Black",Font.BOLD,20));
		l3.setForeground(Color.black);
		l3.setBounds(400,110,900,30);
		p1.add(l3);
		
		l4 = new JLabel("An Nazmus Sakib,CSE,20-43056-1");
		l4.setFont(new Font("Cooper Black",Font.BOLD,20));
		l4.setForeground(Color.black);
		l4.setBounds(400,160,900,30);
		p1.add(l4);
		
		l5 = new JLabel("This project is guided by-MD.Nazmul Hossain,Faculty of CSE,AIUB");
		l5.setFont(new Font("Cooper Black",Font.BOLD,20));
		l5.setForeground(Color.black);
		l5.setBounds(400,210,900,30);
		p1.add(l5);
		
		l6 = new JLabel("This is a e-commerce system developed by AIUB students using Gui Java");
		l6.setFont(new Font("Cooper Black",Font.BOLD,20));
		l6.setForeground(Color.BLUE);
		l6.setBounds(260,260,900,30);
		p1.add(l6);
		
		l7 = new JLabel("E-conometry is basically a online application");
		l7.setFont(new Font("Cooper Black",Font.BOLD,20));
		l7.setForeground(Color.black);
		l7.setBounds(260,310,900,30);
		p1.add(l7);
		
		l8 = new JLabel("Here you can transfer your credits from yout bank account, online shopping,pay bill.");
		l8.setFont(new Font("Cooper Black",Font.BOLD,20));
		l8.setForeground(Color.BLUE);
		l8.setBounds(260,360,900,30);
		p1.add(l8);
		
		l8 = new JLabel("First you have to choose your access. You can access as a admin or a general user.");
		l8.setFont(new Font("Cooper Black",Font.BOLD,20));
		l8.setForeground(Color.white);
		l8.setBounds(260,410,900,30);
		p1.add(l8);
		
		l9 = new JLabel("When you are a admin, you can change certain things as like user balance, user password etc");
		l9.setFont(new Font("Cooper Black",Font.BOLD,20));
		l9.setForeground(Color.white);
		l9.setBounds(260,460,900,30);
		p1.add(l9);
		
		l10 = new JLabel("First of all, a user have to register with certain amount of details. Then the user have to login");
		l10.setFont(new Font("Cooper Black",Font.BOLD,20));
		l10.setForeground(Color.white);
		l10.setBounds(260,510,900,30);
		p1.add(l10);
		
		l11 = new JLabel("After finishing the primary options. A user is free to use the system");
		l11.setFont(new Font("Cooper Black",Font.BOLD,20));
		l11.setForeground(Color.white);
		l11.setBounds(260,560,900,30);
		p1.add(l11);
		
		l12 = new JLabel("This is a simple project for advancement of learning in JAVA");
		l12.setFont(new Font("Cooper Black",Font.BOLD,20));
		l12.setForeground(Color.white);
		l12.setBounds(260,560,900,30);
		p1.add(l12);
		
		
		
		
		
		
		
		
		b4 = new JButton("Back");
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b4.setForeground(Color.white);
		b4.setBackground(Color.green);
		b4.setBounds(250,650,80,30);
		b4.addActionListener(this);
		p1.add(b4);
		
		this.add(p1);
	}
		
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b4)
			{
				Project f = new Project();
				this.setVisible(false);
				f.setVisible(true);
		    }
			
		}
}