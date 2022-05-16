import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project18 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
		JTextField t1,t2,t3,t4;
		JButton b1,b2,b3,b4,b5; 
		JPanel p1,p2,p3,p4,p5;
		JPasswordField passPF;
		
	public Project18()
	{
		super(" online page 12");
		this.setSize(1500,750);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1500,730));
		p1.setBackground(Color.cyan);
		p1.setLayout(null);
		
		ImageIcon icon = new ImageIcon("Background3.jpg");
		l5= new JLabel(icon);
		l5.setBounds(0,-400,250,1500);
		p1.add(l5);
		
		ImageIcon icon2 = new ImageIcon("Background3.jpg");
		l6= new JLabel(icon2);
		l6.setBounds(1260,-400,250,1500);
		p1.add(l6);
		
		l3 = new JLabel("Choose option");
		l3.setFont(new Font("Cooper Black",Font.BOLD,50));
		l3.setForeground(Color.black);
		l3.setBounds(590,5,400,60);
		p1.add(l3);
		
		b2 = new JButton("T-shirt price");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setBackground(Color.black);
		b2.setForeground(Color.BLUE);
		b2.setBounds(350,80,300,30);
		b2.addActionListener(this);
		p1.add(b2);
		
		b3 = new JButton("Shirt price");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.setBackground(Color.black);
		b3.setForeground(Color.yellow);
		b3.setBounds(350,110,300,30);
		b3.addActionListener(this);
		p1.add(b3);
		
		b4 = new JButton("Shoes price");
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b4.setBackground(Color.black);
		b4.setForeground(Color.white);
		b4.setBounds(350,140,300,30);
		b4.addActionListener(this);
		p1.add(b4);
		
		l2 = new JLabel("T-shirt Amount");
		l2.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l2.setForeground(Color.BLUE);
		l2.setBounds(510,200,200,20);
		p1.add(l2);
		
		
		
		
	
		
		l4 = new JLabel("Shirt Amount");
		l4.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
		l4.setForeground(Color.red);
		l4.setBounds(500,260,200,20);
		p1.add(l4);
		
		
		
		l7 = new JLabel("Shoes amount");
		l7.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
		l7.setForeground(Color.green);
		l7.setBounds(490,350,200,20);
		p1.add(l7);
		
		l8 = new JLabel("Address");
		l8.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
		l8.setForeground(Color.black);
		l8.setBounds(510,440,200,20);
		p1.add(l8);
		
		
		
		
		
		t1 = new JTextField();
		t1.setBounds(660,200,100,25);
		p1.add(t1);
		
		t2 = new JTextField();
		t2.setBounds(660,260,100,25);
		p1.add(t2);
		
		t3 = new JTextField();
		t3.setBounds(660,350,100,25);
		p1.add(t3);
		
		t4 = new JTextField();
		t4.setBounds(660,440,100,25);
		p1.add(t4);
		
		
		
		b1 = new JButton("Submit");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setBackground(Color.black);
		b1.setForeground(Color.green);
		b1.setBounds(530,500,100,25);
		b1.addActionListener(this);
		p1.add(b1);
		
		p2 = new JPanel();
		p2.setSize(new Dimension(1500,750));
		p2.setBackground(Color.gray);
		p2.setLayout(null);
	    
		l5 = new JLabel();
		l5.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l5.setForeground(Color.black);
		l5.setBounds(250,560,1000,100);
		p2.add(l5);
		

        b5 = new JButton("Back");
		b5.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b5.setForeground(Color.white);
		b5.setBackground(Color.green);
		b5.setBounds(250,680,80,30);
		b5.addActionListener(this);
		p1.add(b5);
		

	    
		l9 = new JLabel();
		l9.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l9.setForeground(Color.black);
		l9.setBounds(1000,80,70,20);
		p2.add(l9);
		
		
	    
		l10 = new JLabel();
		l10.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l10.setForeground(Color.black);
		l10.setBounds(1000,110,70,20);
		p2.add(l10);
		
		
	    
		l11 = new JLabel();
		l11.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l11.setForeground(Color.black);
		l11.setBounds(1000,140,70,20);
		p2.add(l11);
		
		this.add(p1);
		this.add(p2);
		
		
	}
	public void actionPerformed(ActionEvent ae)
		{
             
          final String tshirt = t1.getText();
			 final String shirt=t2.getText();
             final String shoe = t3.getText();
             final String address = t4.getText();			 
           if(ae.getSource()==b1)
		   {if (tshirt.trim().equals(t1.getText()) && shirt.trim().equals(t2.getText()) && shoe.trim().equals(t3.getText())&& address.trim().equals(t4.getText()) )
		     {
			 l5.setText("Order confirm at " + address );
			 }
		   }
		   if(ae.getSource()==b5)
			{
				Project15 f = new Project15();
				this.setVisible(false);
				f.setVisible(true);
		    }
			if(ae.getSource()==b2)
			{
                  l9.setText("100tk");
		    }
			if(ae.getSource()==b3)
			{
                  l10.setText("200tk");
		    }
			if(ae.getSource()==b4)
			{
                  l11.setText("200tk");
		    }
            
            
            
            		
            
		}			
}