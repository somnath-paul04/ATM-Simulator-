package bank.management.system;

import java.awt.*;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;

@SuppressWarnings("serial")
public class SignupThree extends JFrame implements ActionListener{
	
	JRadioButton r1,r2,r3,r4;
	JCheckBox c1,c2,c3,c4,c5,c6,c7;
	JButton submit,cancel;
	String formno;
	
	
	SignupThree(String formno){
		this.formno=formno;
		
	  setLayout(null);
		
	  JLabel l1=new JLabel("Page 3:Account Details");
	  l1.setFont(new Font("Raleway",Font.BOLD,22));
	  l1.setBounds(280,40,400,40);
	  add(l1);
	  
	  
	  JLabel type=new JLabel("Account Type");
	  type.setFont(new Font("Raleway",Font.BOLD,22));
	  type.setBounds(100,140,200,30);
	  add(type);
	  
	  
	  r1=new JRadioButton("Savings Account");
	  r1.setFont(new Font("Raleway",Font.BOLD,16));
	  r1.setBackground(Color.white);
	  r1.setBounds(100,180,200,50);
	  add(r1);
	  
	  r2=new JRadioButton("Current Account");
	  r2.setFont(new Font("Raleway",Font.BOLD,16));
	  r2.setBackground(Color.white);
	  r2.setBounds(100,220,200,50);
	  add(r2);
	  
	  r3=new JRadioButton("Fixed Deposit");
	  r3.setFont(new Font("Raleway",Font.BOLD,16));
	  r3.setBackground(Color.white);
	  r3.setBounds(320,180,200,50);
	  add(r3);
	  
	  r4=new JRadioButton("Recurring Deposit");
	  r4.setFont(new Font("Raleway",Font.BOLD,16));
	  r4.setBackground(Color.white);
	  r4.setBounds(320,220,200,50);
	  add(r4);
	  
	  ButtonGroup buttonaccount =new ButtonGroup();
	  buttonaccount.add(r1);
	  buttonaccount.add(r2);
	  buttonaccount.add(r3);
	  buttonaccount.add(r4);
	  
	  JLabel cardno=new JLabel("Card Number");
	  cardno.setFont(new Font("Raleway",Font.BOLD,22));
	  cardno.setBounds(100,300,300,30);
	  add(cardno);
	  
	  JLabel no=new JLabel("xxxx-xxxx-xxxx-4125");
	  no.setFont(new Font("Raleway",Font.BOLD,22));
	  no.setBounds(330,300,300,30);
	  add(no);
	  
	  JLabel carddetails=new JLabel("Your 16 digit card number");
	  carddetails.setFont(new Font("Raleway",Font.BOLD,12));
	  carddetails.setBounds(100,315,300,40);
	  add(carddetails);
	  
	  JLabel pinno=new JLabel("PIN:");
	  pinno.setFont(new Font("Raleway",Font.BOLD,22));
	  pinno.setBounds(100,370,300,30);
	  add(pinno);
	  
	  JLabel pno=new JLabel("xxxx");
	  pno.setFont(new Font("Raleway",Font.BOLD,22));
	  pno.setBounds(330,370,300,30);
	  add(pno);
	  
	  JLabel pindetails=new JLabel("Your 4 digit pin number");
	  pindetails.setFont(new Font("Raleway",Font.BOLD,12));
	  pindetails.setBounds(100,385,300,40);
	  add(pindetails);
	  
	  JLabel services=new JLabel("Services Required");
	  services.setFont(new Font("Raleway",Font.BOLD,22));
	  services.setBounds(100,430,300,30);
	  add(services);
	  
	  c1=new JCheckBox("ATM CARD");
	  c1.setFont(new Font("Raleway",Font.BOLD,16));
	  c1.setBounds(100,460,250,30);
	  add(c1);
	  
	  c2=new JCheckBox("Check Book");
	  c2.setFont(new Font("Raleway",Font.BOLD,16));
	  c2.setBounds(100,500,250,30);
	  add(c2);
	  
	  c3=new JCheckBox("Mobile Banking");
	  c3.setFont(new Font("Raleway",Font.BOLD,16));
	  c3.setBounds(400,460,250,30);
	  add(c3);
	  
	  c4=new JCheckBox("Internet Banking");
	  c4.setFont(new Font("Raleway",Font.BOLD,16));
	  c4.setBounds(400,500,250,30);
	  add(c4);
	  
	  c5=new JCheckBox("EMAIL & SMS alerts");
	  c5.setFont(new Font("Raleway",Font.BOLD,16));
	  c5.setBounds(100,540,250,30);
	  add(c5);
	  
	  c6=new JCheckBox("E-Statement");
	  c6.setFont(new Font("Raleway",Font.BOLD,16));
	  c6.setBounds(400,540,250,30);
	  add(c6);
	  
	  c7=new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge");
	  c7.setFont(new Font("Raleway",Font.BOLD,12));
	  c7.setBounds(100,650,550,30);
	  add(c7);
	  
	  submit = new JButton("Submit");
	  submit.setFont(new Font("Raleway",Font.BOLD,14));
	  submit.setBackground(Color.black);
	  submit.setForeground(Color.white);
	  submit.setBounds(250,720,100,30);
	  submit.addActionListener(this);
	  add(submit);
	  
	  cancel = new JButton("Cancel");
	  cancel.setFont(new Font("Raleway",Font.BOLD,14));
	  cancel.setBackground(Color.black);
	  cancel.setForeground(Color.white);
	  cancel.setBounds(420,720,100,30);
	  cancel.addActionListener(this);

	  add(cancel);
	  
	  
	  getContentPane().setBackground(Color.white);
	  setSize(850,820);
	  setLocation(250,10);
	  setVisible(true);
	
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
	  if(ae.getSource()==submit) {
		String accountType=null;
		if(r1.isSelected())
			accountType="Savings Account";
		else if(r2.isSelected())
			accountType="Current Account";
		else if(r3.isSelected())
			accountType="Fixed Deposit Account";
		else if(r4.isSelected())
			accountType="Recurring Deposit Account";
		
		Random random=new Random();
		   String cardnumber=""+Math.abs(random.nextLong() % 90000000L+5040936000000000L);
		   
		   String pinnumber=""+Math.abs(random.nextLong() % 9000L+1000);
		   
		String facility="";
		if(c1.isSelected())
			facility=facility+"ATM CARD";
		else if(c2.isSelected())
			facility=facility+"Check Book";
		else if(c3.isSelected())
			facility=facility+"Mobile Banking";
		else if(c4.isSelected())
			facility=facility+"Internet Banking";
		else if(c5.isSelected())
			facility=facility+"EMAIL & SMS alerts";
		else if(c6.isSelected())
			facility=facility+"E-Statement";
		
		try {
			if(accountType.equals("")){
				JOptionPane.showMessageDialog(null,"Account type is required");
			}else {
				Conn conn=new Conn();
				String query1="insert into signupThree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
				String query2="insert into Login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
				conn.s.executeUpdate(query1); 
				conn.s.executeUpdate(query2);
				
				JOptionPane.showMessageDialog(null,"Card_Number: "+cardnumber+"\n Pin: "+pinnumber);
				
				setVisible(false);
				new Deposit(pinnumber).setVisible(true);
				
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	  }
	  else if(ae.getSource()==cancel) {
		  setVisible(false);
		  new Login().setVisible(true);
		   
	  }
		
		
	}
	
	
	public static void main(String[] args){
		new SignupThree("");
	}

}
