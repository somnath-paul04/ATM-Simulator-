package bank.management.system;

import java.awt.*;

import javax.swing.*;
import java.sql.*;

@SuppressWarnings("serial")
public class MiniStatement extends JFrame {

	MiniStatement(String pinnumber){
		
		setTitle("Mini Statement");
		
		setLayout(null);
		
		JLabel mini=new JLabel();
		mini.setBounds(20,140,400,200);
		add(mini);
		
		JLabel bank=new JLabel("Indian Bank");
		bank.setBounds(150,20,100,20);
		add(bank);
		
		/*JLabel date=new JLabel("Date of Transactions");
		date.setBounds(40,150,150,20);
		add(date);
		
		JLabel type=new JLabel("Type");
		type.setBounds(230,150,50,20);
		add(type);
		
		JLabel amount=new JLabel("Transactions");
		amount.setBounds(300,150,100,20);
		add(amount);*/
		
		JLabel card=new JLabel();
		card.setBounds(20,80,300,20);
		add(card);
		
		JLabel bal=new JLabel();
		bal.setBounds(20,400,300,20);
		add(bal);
		
		try {
			Conn conn=new Conn();
			ResultSet rs=conn.s.executeQuery("select * from login where pin='"+pinnumber+"'");
			while(rs.next()) {
				card.setText("Card Number :"+rs.getString("Card_No").substring(0,4)+"XXXXXXXX"+rs.getString("Card_No").substring(12));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			Conn conn=new Conn();
			int balance=0;
			ResultSet rs=conn.s.executeQuery("select * from bank where pin='"+pinnumber+"'");
			while(rs.next()) {
				mini.setText(mini.getText()+"<html>"+rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("Amount")+"<br><br><html>");
				if(rs.getString("Type").equals("Deposit")) {
					balance+=Integer.parseInt(rs.getString("Amount"));
				}
				else {
					balance-=Integer.parseInt(rs.getString("Amount"));
				}
			}
			bal.setText("Your current account balance is :"+balance);
		} catch (Exception e) {
			System.out.println(e);
		}
		

		
		
		setSize(400,600);
		setLocation(20,20);
		getContentPane().setBackground(Color.white);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MiniStatement("");

	}

}
