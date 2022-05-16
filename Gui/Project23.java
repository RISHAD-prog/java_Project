import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project23 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5,l6,l7,l8;
		JTextField t1,t2,t3;
		JButton b1,b2,b3,b4; 
		JPanel p1,p2;
		JPasswordField passPF;
		
	public Project23()
	{
		super("Online page17");
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
		
		l1 = new JLabel(" Wordware Battle ");
		l1.setFont(new Font("Chiller",Font.BOLD,50));
		l1.setForeground(Color.red);
		l1.setBounds(600,10,500,50);
		p1.add(l1);
		
		l2 = new JLabel("Hero hp");
		l2.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l2.setForeground(Color.BLUE);
		l2.setBounds(460,100,300,60);
		p1.add(l2);
		
		
		
		l3 = new JLabel("Ememy hp");
		l3.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l3.setForeground(Color.red);
		l3.setBounds(460,160,300,60);
		p1.add(l3);
		
		
		l4 = new JLabel("Health poison");
		l4.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
		l4.setForeground(Color.BLUE);
		l4.setBounds(460,220,300,60);
		p1.add(l4);
		
		l8 = new JLabel("what do you want to do?");
		l8.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
		l8.setForeground(Color.blue);
		l8.setBounds(400,300,500,25);
		p1.add(l8);
		
		t1 = new JTextField();
		t1.setBounds(600,100,100,25);
		p1.add(t1);
		
		t2 = new JTextField();
		t2.setBounds(600,160,100,25);
		p1.add(t2);
		
		t3 = new JTextField( );
        t3.setBounds(600,220,100,25);
        p1.add(t3);
		
		b1 = new JButton("Attack");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setBackground(Color.black);
		b1.setForeground(Color.green);
		b1.setBounds(270,350,200,25);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("Health poison");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.green);
		b2.setBackground(Color.black);
		b2.setBounds(570,350,200,30);
		b2.addActionListener(this);
		p1.add(b2);
		
		b3 = new JButton("Run");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.setForeground(Color.green);
		b3.setBackground(Color.black);
		b3.setBounds(970,350,200,30);
		b3.addActionListener(this);
		p1.add(b3);
		
		b4 = new JButton("Back");
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b4.setForeground(Color.white);
		b4.setBackground(Color.green);
		b4.setBounds(250,650,80,30);
		b4.addActionListener(this);
		p1.add(b4);
		
		p2 = new JPanel();
		p2.setSize(new Dimension(1500,750));
		p2.setBackground(Color.gray);
		p2.setLayout(null);
	    
		l7 = new JLabel();
		l7.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l7.setForeground(Color.black);
		l7.setBounds(250,500,1000,100);
		p2.add(l7);
		
		
		
		
		this.add(p1);
		this.add(p2);
		
		
	}
	public void actionPerformed(ActionEvent ae)
		{
             
          final String hhp = t1.getText();
			 final String ehp=t2.getText();
             final String health = t3.getText(); 
           if(ae.getSource()==b1)
		   {
			   l7.setText("Enemy lost Hero hp 30");
			  
		   
		   }
            
            
             if(ae.getSource()==b2)
			{
				l7.setText("HERO gain 30hp");
			}			
             if(ae.getSource()==b3)
			{
				l7.setText("Enemy win");
			}
            if(ae.getSource()==b4)
			{
				Project f = new Project();
				this.setVisible(false);
				f.setVisible(true);
		    }			
		}			
}