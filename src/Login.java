import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import java.io.*;
//import java.util.*;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frame;
	private JPasswordField passwordField;
	public static String name1;
	public static String pass1;

	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(0, 100, 0));
		frame.getContentPane().setBackground(new Color(240, 255, 240));
		frame.setBounds(100, 100, 330, 320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		frame.getContentPane().add(label, BorderLayout.NORTH);
		
		JLabel lblCS = new JLabel("R (Clothing Store)");
		lblCS.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCS.setBounds(20, 11, 271, 47);
		frame.getContentPane().add(lblCS);
		Image img1 = new ImageIcon(this.getClass().getResource("/logo3.png")).getImage();
		lblCS.setIcon(new ImageIcon(img1));
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 104, 181, 22);
		frame.getContentPane().add(textArea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(10, 167, 181, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(new Color(245, 255, 250));
		lblUsername.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblUsername.setBounds(10, 79, 88, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(245, 255, 250));
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPassword.setBounds(10, 140, 88, 14);
		frame.getContentPane().add(lblPassword);
		
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {                              //LOGIN WINDOW
				try
				{
					FileReader fr = new FileReader("Customer.txt");
					BufferedReader br = new BufferedReader(fr);
					String p,n;
		            int flag=0;
		             String name;
		        	 String pass;
		                name=textArea.getText();
						pass=passwordField.getText();
						
					 if((textArea.getText()!=null&&!textArea.getText().equals(""))&& (passwordField.getText()!=null&&!passwordField.getText().equals(""))) {
		                while(true)
		                {
		                    n=br.readLine();
		                    if(n==null) break;
		                    p=br.readLine();


		                   if(n.equals(name) && p.equals(pass))
		                   {
		                       JOptionPane.showMessageDialog(null,"Succesfully Purchased");
		                       Products.purchase=true;
		                       Products.login=true;
		                       Cart.cart.clear();
		                       flag=1;
		                       Selection.a.clear();
		       				   Products.arr.clear();
		       				   Cart.cart.clear();
		                       Products.main(null);
			    			   frame.dispose();
			    			   frame.setVisible(false);
		                       break;
		                   }

		                }
		                 if(flag==0)
		                 {
		                    JOptionPane.showMessageDialog(null,"Wrong Username Password");
		                 }
					 }
					 
					 else
						 JOptionPane.showMessageDialog(null,"Please fill in the form first"); //Error

		            br.close();
		            fr.close();
		
				}
				catch(FileNotFoundException e){
					e.printStackTrace();
				}
				catch(IOException e){
					e.printStackTrace();
				}
			}
		});
		btnLogin.setBackground(new Color(144, 238, 144));
		btnLogin.setBounds(9, 198, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(192, 192, 192));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cart.main(null);
				frame.dispose();
				frame.setVisible(false);
			}
		});
		btnBack.setBounds(237, 123, 66, 51);
		frame.getContentPane().add(btnBack);
		
		
		JButton btnSignup = new JButton("SignUp");
		btnSignup.setBackground(new Color(238, 232, 170));                                            // SINGUP WINDOW
		btnSignup.addActionListener(new ActionListener(){
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg){
				
				try
				{
					FileWriter fw = new FileWriter("Customer.txt",true);
					BufferedWriter bw = new BufferedWriter(fw);
		                name1=textArea.getText();
						pass1=passwordField.getText();
						
						if((textArea.getText()!=null&&!textArea.getText().equals(""))&& (passwordField.getText()!=null&&!passwordField.getText().equals(""))) 
						{
						    bw.newLine();
						    bw.write(name1);
						    bw.newLine();
						    bw.write(pass1);
						    bw.newLine();
						
		                    JOptionPane.showMessageDialog(null,"Succesfully signed up");
		                    Details.main(null);
		    				frame.dispose();
		    				frame.setVisible(false);
						 }
						 else
				            	JOptionPane.showMessageDialog(null,"Please fill in the form first"); 

		            bw.close();
		            fw.close();
		
				}
				catch(FileNotFoundException e){
					e.printStackTrace();
				}
				catch(IOException e){
					e.printStackTrace();
				}
			}
		});
		btnSignup.setBounds(108, 198, 89, 23);
		frame.getContentPane().add(btnSignup);
		
		JLabel lblNewLabel = new JLabel("SingUp if you dont have any account");
		lblNewLabel.setForeground(new Color(245, 255, 250));
		lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		lblNewLabel.setBounds(10, 237, 194, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, 330, 320);
		frame.getContentPane().add(lblNewLabel_1);
		Image img = new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
	}
}
