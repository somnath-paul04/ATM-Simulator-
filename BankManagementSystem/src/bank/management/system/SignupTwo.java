package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SignupTwo extends JFrame implements ActionListener{
	
	
	JTextField pan,aadhar;
	JRadioButton syes,sno,eyes,eno;
	@SuppressWarnings("rawtypes")
	JComboBox religion,category,occupation,education,income;
	JButton next ;
	String formno;
	
	private static final long serialVersionUID = 1L;

	
	SignupTwo(String formno){
		this.formno=formno;
		
		setLayout(null);
		
		setTitle("New Account Application Form Page 2:");
		
		JLabel additionalDetails =new JLabel("Page 2: Additional Details");
		additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
		additionalDetails.setBounds(290,80,400,30);
		add(additionalDetails);
		
		JLabel name=new JLabel("Religion:");
		name.setFont(new Font("Raleway",Font.BOLD,22));
		name.setBounds(100,140,100,30);
		add(name);
		
		String[] valReligion= {"Hindu","Muslim","Sikh","Christian","Others"};
	    religion=new JComboBox(valReligion);
		religion.setBounds(300, 140, 400, 30);
		religion.setBackground(Color.white);
		add(religion);
		
		JLabel fname=new JLabel("Category:");
		fname.setFont(new Font("Raleway",Font.BOLD,22));
		fname.setBounds(100,190,200,30);
		add(fname);
		
	    String[] valCategory= {"General","ST","SC","OBC","Others"};
		category=new JComboBox(valCategory);
		category.setBounds(300, 190, 400, 30);
		category.setBackground(Color.white);
		add(category);
		
		
		JLabel dob=new JLabel("Income:");
		dob.setFont(new Font("Raleway",Font.BOLD,22));
		dob.setBounds(100,240,200,30);
		add(dob);
		
		String[] incomeCategory= {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
		income=new JComboBox(incomeCategory);
		income.setBounds(300, 240, 400, 30);
		income.setBackground(Color.white);
		add(income);

		
		JLabel gender=new JLabel("Educational");
		gender.setFont(new Font("Raleway",Font.BOLD,22));
		gender.setBounds(100,310,200,30);
		add(gender);
		
		
		JLabel email=new JLabel("Qualification:");
		email.setFont(new Font("Raleway",Font.BOLD,22));
		email.setBounds(100,335,200,30);
		add(email);
		
		String[] educationValues= {"Non-Graduation","Graduation","Post-Graduation","Doctrate"," Others"};
		education=new JComboBox(educationValues);
		education.setBounds(300, 335, 400, 30);
		education.setBackground(Color.white);
		add(education);
		
		
		JLabel marital=new JLabel("Occupation:");
		marital.setFont(new Font("Raleway",Font.BOLD,22));
		marital.setBounds(100,390,200,30);
		add(marital);
		
		String[] occupationValues= {"Salaried","Self-Employed","Business","Student","Retired","Others"};
		occupation=new JComboBox(occupationValues);
		occupation.setBounds(300, 390, 400, 30);
		occupation.setBackground(Color.white);
		add(occupation);
		
		
		JLabel address=new JLabel("PAN Number:");
		address.setFont(new Font("Raleway",Font.BOLD,22));
		address.setBounds(100,440,200,30);
		add(address);
		
		pan=new JTextField();
		pan.setFont(new Font("Raleway",Font.BOLD,14));
		pan.setBounds(300, 440, 400, 30);
		add(pan);
		
		JLabel city=new JLabel("Aadhar Number:");
		city.setFont(new Font("Raleway",Font.BOLD,22));
		city.setBounds(100,490,200,30);
		add(city);
		
		aadhar=new JTextField();
		aadhar.setFont(new Font("Raleway",Font.BOLD,14));
		aadhar.setBounds(300, 490, 400, 30);
		add(aadhar);
		
		
		JLabel state=new JLabel("Senior Citizen:");
		state.setFont(new Font("Raleway",Font.BOLD,22));
		state.setBounds(100,540,200,30);
		add(state);
		
		syes=new JRadioButton("Yes");
		syes.setBounds(300,540,60,30);
		syes.setBackground(Color.white);
		add(syes);
		
		sno=new JRadioButton("No");
		sno.setBounds(450,540,100,30);
		sno.setBackground(Color.white);
		add(sno);
		
		ButtonGroup citizenGroup=new ButtonGroup();
		citizenGroup.add(syes);
		citizenGroup.add(sno);
		
		
		JLabel pincode=new JLabel("Existing Account:");
		pincode.setFont(new Font("Raleway",Font.BOLD,22));
		pincode.setBounds(100,590,200,30);
		add(pincode);
		
		eyes=new JRadioButton("Yes");
		eyes.setBounds(300,590,60,30);
		eyes.setBackground(Color.white);
		add(eyes);
		
		eno=new JRadioButton("No");
		eno.setBounds(450,590,100,30);
		eno.setBackground(Color.white);
		add(eno);
		
		ButtonGroup existingAccountGroup=new ButtonGroup();
		existingAccountGroup.add(eyes);
		existingAccountGroup.add(eno);
		
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
		
		String sreligion=(String)religion.getSelectedItem();
		String scategory=(String)category.getSelectedItem();
		String sincome=(String)income.getSelectedItem();
		String seducation=(String)education.getSelectedItem();
		String soccupation=(String)occupation.getSelectedItem();
		String span=pan.getText();
		String saadhar=aadhar.getText();
		String srCitizen=null;
		if(syes.isSelected())
			srCitizen="Yes";
		else if(sno.isSelected())
			srCitizen="No";
		String eAccount=null;
		if(eyes.isSelected())
			eAccount="Yes";
		else if(eno.isSelected())
			eAccount="No";
		
		
		try{
		     Conn c=new Conn();
			 String query="insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+srCitizen+"','"+eAccount+"')";
			 c.s.executeUpdate(query);
			 //SignupThree object
			 setVisible(false);
			 new SignupThree(formno).setVisible(true);
		}catch(Exception e){
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		new SignupTwo("");

	}

}
