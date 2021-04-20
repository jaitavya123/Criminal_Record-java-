
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.border.MatteBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class GUI {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passField;
	private JCheckBox CB1=new JCheckBox() ;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
			
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			
		
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 730, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);                          //Disable maximize button
		
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		btnNewButton.setOpaque(false);
		btnNewButton.setBackground(new Color(97,106,161));   /*change color in RGB format*/
		btnNewButton.addActionListener(new ActionListener() // submit button action listener
		{
			public void actionPerformed(ActionEvent arg0) {
							
	String name=textField.getText();
	String code=passField.getText() ;
	//JOptionPane.showMessageDialog(null," Your credentials are:"+" \n User= "+name+"  \n Password= " +passField.getPassword()+"\n"+passField.getText());
	//In above line getPassword() give entered data in encrypted form.
	
	if(name.equals("Jaitavya") && code.equals("Me@123"))
	{
		
		JFrame2 frame2= new JFrame2();
		frame2.show();
		//close(); // Close Home page and open JFrame2 
		
		
	}
	else { JOptionPane.showMessageDialog(null,"Invalid user name or password. ");}
			}
		});
		btnNewButton.setBounds(745, 242, 89, 22);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();                         // Text field for user name
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e)
			{
			 // TextField will accept alphabet,space, backspace,delete keys only
	          char c=e.getKeyChar();              // e is object of KeyEvent Class
	          
				if(Character.isLetter(c)|| Character.isWhitespace(c)|| Character.isISOControl(c))
				{
					textField.setEditable(true);
				}
				else { textField.setEditable(false);}
					
				
			}
		});
		textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		textField.setBounds(539, 111, 154, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passField=new JPasswordField();                      // Password field
		passField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		passField.setBounds(539, 165, 154,23);
		frame.getContentPane().add(passField);
		textField.setColumns(30);
		CB1.setForeground(Color.WHITE);
		CB1.setBackground(Color.BLACK);
		
		CB1.addActionListener(new ActionListener() {         // CheckBox to show and hide password
			public void actionPerformed(ActionEvent e) {
				if(CB1.isSelected())
				{
					passField.setEchoChar((char)0);
					
				}
				else {  passField.setEchoChar('*');}
				
			}
		});
		
		CB1.setText("View");
		CB1.setBounds(806,212,53,13);
		frame.getContentPane().add(CB1);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(519, 90, 89, 22);
		frame.getContentPane().add(lblNewLabel);
		frame.setTitle("NIA Criminal Record");
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(549, 144, 81, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		
		
		
		JLabel background_img = new JLabel("");
		ImageIcon img1=new ImageIcon(this.getClass().getResource("/nia.jpg"));
		background_img.setIcon(img1);
		background_img.setBounds(-51, 11, 900, 500);
		frame.getContentPane().add(background_img);
		
		
	}
}
