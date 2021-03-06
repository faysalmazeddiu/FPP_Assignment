package prog13_2;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.xml.crypto.Data;

public class AddressForm extends JFrame {
    private JPanel firstPanel;
    private JPanel lastPanel;
    private JPanel addressPanel;
    private JPanel erPanel;
    private JButton searchButton;
    private JButton saveButton;
    private JButton clearButton;
    private JTextField idTextField;
    private JTextField firstTextNameField;
    private JTextField lastTextNameField;
    private JTextField ssnTextField;


    private JTextField streetTextField;
    private JTextField cityTextField;
    private JTextField stateTextField;
    private JTextField zipTextField;

    private JLabel errorText;
    private static final long serialVersionUID = 1L;
   // private InsertAndDeletePerson db;
    public static void main(String[] args) throws SQLException {
        AddressForm addressForm = new AddressForm();
        addressForm.setVisible(true);
        DBConnection dbCoonConnection=new DBConnection();
        dbCoonConnection.getConnection();
    }
    public AddressForm() {
        initializeWindow();
        JPanel mainPanel = new JPanel();
        JPanel centerPanel = new JPanel();
        callFirstPanel();
        //Center Panel
        callLastPanel();
        callErrorPanel();
        centerPanel.add(addressPanel, BorderLayout.NORTH);
        centerPanel.add(erPanel, BorderLayout.WEST);
        //Bottom Panel
        callBottomPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(firstPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(lastPanel, BorderLayout.SOUTH);
        getContentPane().add(mainPanel);
    }

    private void callFirstPanel() {
    	firstPanel = new JPanel();
        JLabel idLabel = new JLabel("ID");
        idLabel.setFont(makeSmallFont(idLabel.getFont()));
        idTextField = new JTextField(12);
        JPanel idPanel = createTextPanel(idLabel, idTextField);

        JLabel labelForFirstName = new JLabel("First Name");
        labelForFirstName.setFont(makeSmallFont(labelForFirstName.getFont()));
        firstTextNameField = new JTextField(12);
        JPanel panelForfirstName = createTextPanel(labelForFirstName, firstTextNameField);

        JLabel labelForLastName = new JLabel("Last Name");
        labelForLastName.setFont(makeSmallFont(labelForLastName.getFont()));
        lastTextNameField = new JTextField(12);
        JPanel panelForLastName = createTextPanel(labelForLastName, lastTextNameField);

        JLabel labelForSSN = new JLabel("SSN");
        labelForSSN.setFont(makeSmallFont(labelForSSN.getFont()));
        ssnTextField = new JTextField(12);
        JPanel panelForSSn = createTextPanel(labelForSSN, ssnTextField);

        firstPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        firstPanel.add(idPanel);
        firstPanel.add(panelForfirstName);
        firstPanel.add(panelForLastName);
        firstPanel.add(panelForSSn);

    }

    private void callLastPanel() {
        // implement
        addressPanel = new JPanel();

        JLabel labelforStreet = new JLabel("Street");
        labelforStreet.setFont(makeSmallFont(labelforStreet.getFont()));
        streetTextField = new JTextField(12);
        JPanel streetforPanel = createTextPanel(labelforStreet, streetTextField);

        JLabel labelforCity = new JLabel("City");
        labelforCity.setFont(makeSmallFont(labelforCity.getFont()));
        cityTextField = new JTextField(12);
        JPanel cityforPanel = createTextPanel(labelforCity, cityTextField);

        JLabel labelforState = new JLabel("State");
        labelforState.setFont(makeSmallFont(labelforState.getFont()));
        stateTextField = new JTextField(12);
        JPanel stateforPanel = createTextPanel(labelforState, stateTextField);

        JLabel labelforZip = new JLabel("Zip");
        labelforZip.setFont(makeSmallFont(labelforZip.getFont()));
        zipTextField = new JTextField(12);
        JPanel zipforPanel = createTextPanel(labelforZip, zipTextField);

        addressPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        addressPanel.add(streetforPanel);
        addressPanel.add(cityforPanel);
        addressPanel.add(stateforPanel);
        addressPanel.add(zipforPanel);

    }

    private void callBottomPanel() {
    	lastPanel = new JPanel();
    	lastPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        //Button
    	searchButton = new JButton("SEARCH");
    	searchButton.addActionListener(new SearchClickListener());

    	saveButton = new JButton("SAVE");
    	saveButton.addActionListener(new SaveClickListener());

    	clearButton = new JButton("CLEAR");
    	clearButton.addActionListener(new ClearClickListener());

        lastPanel.add(searchButton);
        lastPanel.add(saveButton);
        lastPanel.add(clearButton);

    }

    private void callErrorPanel() {
    	erPanel = new JPanel();
    	erPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        //OUTPUT
    	errorText = new JLabel();
    	errorText.setFont(new Font("SansSerif", Font.PLAIN, 16));
    	errorText.setForeground(Color.RED);


        erPanel.add(errorText);

    }

    private void showErrorMessage(String msgessage) {
    	errorText.setText(msgessage);
    }

    private static JPanel createTextPanel(JLabel label, JTextField textField) {

        JPanel first = new JPanel();
        JPanel last = new JPanel();
        first.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
        last.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));

        first.add(label);
        last.add(textField);

        JPanel panelForText = new JPanel();
        panelForText.setLayout(new BorderLayout());
        panelForText.add(first, BorderLayout.NORTH);
        panelForText.add(last, BorderLayout.CENTER);
        return panelForText;
    }

    private void initializeWindow() {
       
        setTitle("Address Form");
        setSize(700, 400);
        handleWindowClosing();
        centerFrameOnDesktop(this);
        setResizable(false);
    }

    public static Font makeSmallFont(Font f) {
        return new Font(f.getName(), f.getStyle(), (f.getSize() - 2));
    }

    private void handleWindowClosing() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent w) {
                dispose();
                // other clean-up
                System.exit(0);
            }
        });
    }

    private void clearFields() {
        //First  Line
    	idTextField.setText("");
    	firstTextNameField.setText("");
        lastTextNameField.setText("");
        ssnTextField.setText("");
        //Second  Line
        streetTextField.setText("");
        cityTextField.setText("");
        stateTextField.setText("");
        zipTextField.setText("");
    }

    class SearchClickListener implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
        	JOptionPane.showMessageDialog(null, "No Data Found");
            
        }
    }

    class SaveClickListener implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
        	JOptionPane.showMessageDialog(null, "Sorry !! Data Insertion Failed");
            
        }
    }

    class ClearClickListener implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            clearFields();
        }
    }


    public static void centerFrameOnDesktop(Component f) {
        final int SHIFT_AMOUNT = 0;
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int height = toolkit.getScreenSize().height;
        int width = toolkit.getScreenSize().width;
        int frameHeight = f.getSize().height;
        int frameWidth = f.getSize().width;
        f.setLocation(((width - frameWidth) / 2) - SHIFT_AMOUNT, (height - frameHeight) / 3);
    }

    
}
