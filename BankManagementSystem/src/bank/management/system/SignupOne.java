package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener{
	
	long random ;
	JTextField nameTextField,fnameTextField,emailTextField,addressTextField,cityTextField,stateTextField,pincodeTextField;
	JDateChooser datechooser;
	JRadioButton male,female,married,unmarried,other;
	JButton next ;
	
	private static final long serialVersionUID = 1L;

	SignupOne(){
		
		setLayout(null);
		
		Random ran=new Random();
		random =Math.abs((ran.nextLong()%9000L)+1000L);
		
		JLabel formno =new JLabel("APPLICATION FORM NO. "+random);
		formno.setFont(new Font("RAleway",Font.BOLD,38));
		formno.setBounds(120,20,600,40);
		add(formno);
		
		JLabel personalDetails =new JLabel("Page 1:Personal Details");
		personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
		personalDetails.setBounds(290,80,400,30);
		add(personalDetails);
		
		JLabel name=new JLabel("Name:");
		name.setFont(new Font("Raleway",Font.BOLD,22));
		name.setBounds(100,140,100,30);
		add(name);
		
		nameTextField=new JTextField();
		nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
		nameTextField.setBounds(300, 140, 400, 30);
		add(nameTextField);
		
		JLabel fname=new JLabel("Fathers Name:");
		fname.setFont(new Font("Raleway",Font.BOLD,22));
		fname.setBounds(100,190,200,30);
		add(fname);
		
	    fnameTextField=new JTextField();
		fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
		fnameTextField.setBounds(300, 190, 400, 30);
		add(fnameTextField);
		
		
		JLabel dob=new JLabel("Date Of Birth:");
		dob.setFont(new Font("Raleway",Font.BOLD,22));
		dob.setBounds(100,240,200,30);
		add(dob);
		
		datechooser=new JDateChooser();
		datechooser.setBounds(300,240,400,30);
		add(datechooser);

		
		JLabel gender=new JLabel("Gender:");
		gender.setFont(new Font("Raleway",Font.BOLD,22));
		gender.setBounds(100,290,200,30);
		add(gender);
		
		male=new JRadioButton("Male");
		male.setBounds(300,290,60,30);
		male.setBackground(Color.white);
		add(male);
		
		female=new JRadioButton("Female");
		female.setBounds(450,290,100,30);
		female.setBackground(Color.white);
		add(female);
		
		ButtonGroup genderGroup=new ButtonGroup();
		genderGroup.add(female);
		genderGroup.add(male);
		
		
		JLabel email=new JLabel("Email Address:");
		email.setFont(new Font("Raleway",Font.BOLD,22));
		email.setBounds(100,340,200,30);
		add(email);
		
		emailTextField=new JTextField();
		emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
		emailTextField.setBounds(300, 340, 400, 30);
		add(emailTextField);
		
		
		JLabel marital=new JLabel("Marital Status:");
		marital.setFont(new Font("Raleway",Font.BOLD,22));
		marital.setBounds(100,390,200,30);
		add(marital);
		
		married=new JRadioButton("Married");
		married.setBounds(300,390,70,30);
		married.setBackground(Color.white);
		add(married);
		
		unmarried=new JRadioButton("Unmarried");
		unmarried.setBounds(450,390,100,30);
		unmarried.setBackground(Color.white);
		add(unmarried);
		
		other=new JRadioButton("Other");
		other.setBounds(600,390,100,30);
		other.setBackground(Color.white);
		add(other);
		
		ButtonGroup maritalGroup=new ButtonGroup();
		maritalGroup.add(married);
		maritalGroup.add(unmarried);
		maritalGroup.add(other);
		
		
		JLabel address=new JLabel("Address:");
		address.setFont(new Font("Raleway",Font.BOLD,22));
		address.setBounds(100,440,200,30);
		add(address);
		
		addressTextField=new JTextField();
		addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
		addressTextField.setBounds(300, 440, 400, 30);
		add(addressTextField);
		
		JLabel city=new JLabel("City:");
		city.setFont(new Font("Raleway",Font.BOLD,22));
		city.setBounds(100,490,200,30);
		add(city);
		
		cityTextField=new JTextField();
		cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
		cityTextField.setBounds(300, 490, 400, 30);
		add(cityTextField);
		
		
		JLabel state=new JLabel("State:");
		state.setFont(new Font("Raleway",Font.BOLD,22));
		state.setBounds(100,540,200,30);
		add(state);
		
		stateTextField=new JTextField();
		stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
		stateTextField.setBounds(300, 540, 400, 30);
		add(stateTextField);
		
		
		JLabel pincode=new JLabel("Pin Code:");
		pincode.setFont(new Font("Raleway",Font.BOLD,22));
		pincode.setBounds(100,590,200,30);
		add(pincode);
		
		pincodeTextField=new JTextField();
		pincodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
		pincodeTextField.setBounds(300, 590, 400, 30);
		add(pincodeTextField);
		
		next =new JButton("Next");
		next.setBackground(Color.black);
		next.setForeground(Color.white);
		next.setFont(new Font("Raleway",Font.BOLD,14));
		next.setBounds(620,660,80,30);
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(Color.white);
		setSize(850,800);
		setLocation(250,10);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String formno=""+random;
		String name=nameTextField.getText();
		String fname=fnameTextField.getText();
		String dob=((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
		String gender=null;
		if(male.isSelected())
			gender="Male";
		else if(female.isSelected())
			gender="Female";
		String email=emailTextField.getText();
		String marital=null;
		if(married.isSelected())
			marital="Married";
		else if(unmarried.isSelected())
			marital="Unmarried";
		else if(other.isSelected())
			marital="Other";
		String address=addressTextField.getText();
		String city=cityTextField.getText();
		String state=stateTextField.getText();
		String pin=pincodeTextField.getText();
		
		try{
			if(name.equals(""))
			 JOptionPane.showMessageDialog(null,"Name is Required");
			else {
				Conn c=new Conn();
				String query="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
			    c.s.executeUpdate(query);
			    
			    setVisible(false);
			    new SignupTwo(formno).setVisible(true);
			}
		}catch(Exception e){
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		new SignupOne();

	}

}
