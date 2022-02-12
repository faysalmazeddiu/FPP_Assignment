package prog6_2;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.JFrame;



public class StringUtility extends JFrame{
	Button bt1=new Button("Count Letters");
	Button bt2=new Button("Reverse Letters");
	Button bt3=new Button("Remove Duplicate");
	TextField textOutputField= new TextField();
	TextField textInputField= new TextField();
	//Button bt4=new Button();
	
	public StringUtility() {
		// TODO Auto-generated constructor stub
		setTitle("String Utility");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,100,800,300);
		setResizable(false);
		setLayout(null);
		setCountButton();
		setInPutTextField();
		setOutPutTextField();
		setReverseButton();
		setDuplicateButton();
	}
	
	public static void main(String[] args) {
		StringUtility stringUtility=new StringUtility();
	}
	
	public void setCountButton() {
		bt1.setBounds(200, 70, 150, 20);
		bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String input = textInputField.getText();
				if (input == null)
					return;
				
				if (input.equals(""))
					return;
				
				textOutputField.setText(String.valueOf(input.length()));
				
			}
		});
		add(bt1);
	}
	
	public void setReverseButton() {
		bt2.setBounds(200, 110, 150, 30);
		bt2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String input = textInputField.getText();
				if (input == null)
					return;
				
				if (input.equals(""))
					return;
				StringBuilder sBuilder=new StringBuilder();
				char[] charArr=input.toCharArray();
				for(int i=charArr.length-1;i>=0;--i) {
					
					sBuilder.append(charArr[i]);
				}
				textOutputField.setText(sBuilder.toString());
				
				
			}
		});
		add(bt2);
	}
	
	public void setDuplicateButton() {
		bt3.setBounds(200, 150, 150, 30);
		bt3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String input = textInputField.getText();
				if (input == null)
					return;
				
				if (input.equals(""))
					return;
				textOutputField.setText(removeDuplicate(input));
				
			}
		});
		add(bt3);
	}
	
	public String removeDuplicate(String string) {
		char[] charArray = string.toCharArray();
		Set<Character> charecterSet = new LinkedHashSet<Character>();
		for (char cVal : charArray) {
			charecterSet.add(cVal);
		}

		StringBuilder sb = new StringBuilder();
		for (Character character : charecterSet) {
		    sb.append(character);
		}
		return sb.toString();
	}
	
	public void setInPutTextField() {
		textInputField.setBounds(380, 100, 150, 20);
		add(textInputField);
	}
	
	public void setOutPutTextField() {
		textOutputField.setBounds(380, 140, 150, 20);
		add(textOutputField);
	}
	
}
