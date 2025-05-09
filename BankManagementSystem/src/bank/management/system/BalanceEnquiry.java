package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.*;


@SuppressWarnings("serial")
public class BalanceEnquiry extends JFrame implements ActionListener{
	
	
	JButton back;
	String pinnumber;
	
	BalanceEnquiry(String pinnumber){
		this.pinnumber=pinnumber;
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0,0,900,900);
		add(image);
		
		
		
		back =new JButton("Back");
		back.setBounds(355,520,130,30);
		back.addActionListener(this);
		image.add(back);
		
		Conn c=new Conn();
		int balance=0;
		try {
			ResultSet rs=c.s.executeQuery("Select * from bank where pin='"+pinnumber+"'");
			
			while(rs.next()){
				if(rs.getString("Type").equals("Deposit")) {
					balance+=Integer.parseInt(rs.getString("Amount"));
				}
				else {
					balance-=Integer.parseInt(rs.getString("Amount"));
				}
				
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		JLabel text=new JLabel("Your Current Account balance is "+balance);
		text.setForeground(Color.white);
		text.setFont(new Font("System",Font.BOLD,16));
		text.setBounds(170,300,400,30);
		image.add(text);
		
		setSize(900,900);
		setLocation(300,0);
		setUndecorated(true);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		setVisible(false);
		new Transaction(pinnumber).setVisible(true);
		
	}

	public static void main(String[] args) {
		new BalanceEnquiry("");

	}

}
