package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Deposit extends JFrame implements ActionListener{
    
    JTextField amount;
    JButton deposit,back;
    JLabel l1,l2,image;
    String pinnumber;
    Deposit(String pinnumber){
        this.pinnumber = pinnumber;
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        setLayout(null);
        
        JLabel text= new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        text.setBounds(170,300,400,20);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);
        
        amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD, 22));
        amount.setBounds(170,350,320,25);
        image.add(amount);
        
        deposit = new JButton("DEPOSIT");
        deposit.setForeground(Color.black);
        deposit.setBounds(355,450,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        back = new JButton("BACK");
        back.setForeground(Color.black);
        back.setBounds(355,485,150,30);
        back.addActionListener(this);
        image.add(back);
        
        
        
        setLayout(null);
        
        
        setSize(900,900);
        //setUndecorated(true);
        setLocation(300,0);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
    	if(ae.getSource()==deposit) {
    		String number=amount.getText();
    		Date date =new Date();
    		if(number.equals("")) {
    			JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposit");
    		}else {
    			try {
    				Conn conn=new Conn();
        			String q="insert into bank values('"+pinnumber+"','"+date+"','Deposit','"+number+"')";
        			conn.s.executeUpdate(q);
        			JOptionPane.showMessageDialog(null,"Rs "+number+" is successfully deposited.");
				} catch (Exception e) {
					System.out.println(e);
				}
    			
    			
    		}
			//setVisible(false);
			//new Deposit(pinnumber).setVisible(true);
		}
		else if(ae.getSource()==back) {
			setVisible(false);
			new Transaction(pinnumber).setVisible(true);
			
		}
        try {
			
		} catch (Exception e) {
			System.out.println(e);
		}       
            
            
    }
    
    public static void main(String[] args){
        new Deposit("").setVisible(true);
    }
}