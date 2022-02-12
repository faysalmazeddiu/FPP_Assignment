package prog6_1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class AddressForm extends JFrame{
	JLabel nameLable=new JLabel();
	JLabel streetLable=new JLabel();
	JLabel cityLable=new JLabel();
	JLabel stateLable=new JLabel();
	JLabel zipLable=new JLabel();
	TextField nameTextField=new TextField();
	TextField streetTextField=new TextField();
	TextField cityTextField=new TextField();
	TextField stateTextField=new TextField();
	TextField zipTextField=new TextField();
	Button btButton=new Button("Submit");
	public AddressForm() {
		setTitle("Address Form");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLocation(200,0);
		//setSize(1000, 500);
		//setLocationRelativeTo(null);
		setBounds(200,0,1000,500);
		setResizable(false);
		setLayout(null);
		setNameLabe();
		setNameTextField();
		setStreetLable();
		setStreetTextField();
		setCityLable();
		setCityTextField();
		setStateLable();
		setStateTextField();
		setZipLable();
		zipTextField();
		setButton();
	}
	
	
	
	
	public void setNameLabe() {
		nameLable.setText("Name");
		Font font =new Font("Aril",Font.PLAIN,10);
		nameLable.setFont(font);
		nameLable.setBounds(100,10 ,100,20);
		add(nameLable);
	}
	
	public void setNameTextField() {
		nameTextField.setBounds(100,40,150,20);
		add(nameTextField);
	}
	
	public void setStreetLable() {
		streetLable.setText("Street");
		Font font =new Font("Aril",Font.PLAIN,10);
		streetLable.setFont(font);
		streetLable.setBounds(350,10,100,20);
		add(streetLable);
	}
	
	public void setStreetTextField() {
		streetTextField.setBounds(350,40,150,20);
		add(streetTextField);
	}
	
	public void setCityLable() {
		cityLable.setText("City");
		Font font =new Font("Aril",Font.PLAIN,10);
		cityLable.setFont(font);
		cityLable.setBounds(550,10 ,100,20);
		add(cityLable);
	}
	
	public void setCityTextField() {
		cityTextField.setBounds(550,40,150,20);
		add(cityTextField);
	}
	
	public void setStateLable() {
		stateLable.setText("State");
		Font font =new Font("Aril",Font.PLAIN,10);
		stateLable.setFont(font);
		stateLable.setBounds(250,80 ,100,20);
		add(stateLable);
	}
	
	public void setStateTextField() {
		stateTextField.setBounds(250,100,150,20);
		add(stateTextField);
	}
	
	public void setZipLable() {
		zipLable.setText("ZipCode");
		Font font =new Font("Aril",Font.PLAIN,10);
		zipLable.setFont(font);
		zipLable.setBounds(450,80,100,20);
		add(zipLable);
	}
	
	public void zipTextField() {
		zipTextField.setBounds(450,100,150,20);
		add(zipTextField);
	}
	
	public void setButton() {
		
		btButton.setBounds(400,150,100,20);
		btButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(nameTextField.getText().equals("") || streetTextField.getText().equals("")
						|| cityTextField.getText().equals("") || zipTextField.getText().equals("")) {
					new AddressForm();
					
				}else {
					System.out.println(nameTextField.getText());
					System.out.println(streetTextField.getText());
					System.out.println(stateTextField.getText());
					System.out.print(cityTextField.getText()+", "+zipTextField.getText());
				}
				
				
			}
		});
		add(btButton);
	}
	
		public static void main(String[] args) {
			AddressForm myFrame=new AddressForm();
		}
		

}
