package bank.management.system;

import java.awt.*;
import java.awt.event.*;


import javax.swing.*;

@SuppressWarnings("serial")
public class Transaction extends JFrame implements ActionListener {
	
	JButton deposit,withdrawl,balanceenquiry,exit,fastcash,pinchange,ministatement;
	String pinnumber;
	
	Transaction(String pinnumber){
		this.pinnumber=pinnumber;
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0,0,900,900);
		add(image);
		
		JLabel text=new JLabel("Please select your Transaction");
		text.setBounds(205,300,300,50);
		text.setForeground(Color.white);
		text.setFont(new Font("System",Font.BOLD,18));
		image.add(text);
		
	    deposit=new JButton("Deposit");	
	    deposit.setBounds(170,415,150,30);
	    deposit.addActionListener(this);
	    image.add(deposit);
	    
	    withdrawl=new JButton("Cash Withdrawl");	
	    withdrawl.setBounds(355,415,150,30);
	    withdrawl.addActionListener(this);
	    image.add(withdrawl);
	    
	    fastcash=new JButton("Fast Cash");	
	    fastcash.setBounds(170,450,150,30);
	    fastcash.addActionListener(this);
	    image.add(fastcash);
	    
	    ministatement=new JButton("Mini Statement");	
	    ministatement.setBounds(355,450,150,30);
	    ministatement.addActionListener(this);
	    image.add(ministatement);
	    
	    balanceenquiry=new JButton("Balance Enquiry");	
	    balanceenquiry.setBounds(170,485,150,30);
	    balanceenquiry.addActionListener(this);
	    image.add(balanceenquiry);
	    
	    pinchange=new JButton("Pin Change");	
	    pinchange.setBounds(355,485,150,30);
	    pinchange.addActionListener(this);
	    image.add(pinchange);
	    
	    
	    exit=new JButton("Exit");	
	    exit.setBounds(355,520,150,30);
	    exit.addActionListener(this);
	    image.add(exit);
	    
	    
		setSize(900,900);
		setLocation(300,0);
		setUndecorated(true);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==deposit) {
			setVisible(false);
			new Deposit(pinnumber).setVisible(true);
		}
		else if(ae.getSource()==withdrawl) {
			setVisible(false);
			new Withdrawl(pinnumber).setVisible(true);
		}
		else if(ae.getSource()==balanceenquiry) {
		    setVisible(false);
		    new BalanceEnquiry(pinnumber).setVisible(true);
	    }
		else if(ae.getSource()==pinchange) {
			setVisible(false);
			new PinChange(pinnumber).setVisible(true);
	    	
		}
	    else if(ae.getSource()==ministatement) {
			new MiniStatement(pinnumber).setVisible(true);
		}
		else if(ae.getSource()==fastcash) {
			setVisible(false);
			new FastCash(pinnumber).setVisible(true);
			
		}
		else if(ae.getSource()==exit) {
			System.exit(0);
		}
		
	}
	public static void main(String[] args) {
		new Transaction("");
	}

}
