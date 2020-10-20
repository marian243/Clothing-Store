import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Details {

	private JFrame frame;
	public String mobile;
	public String card;
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Details window = new Details();
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
	public Details() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(220, 20, 60));
		frame.getContentPane().setBackground(new Color(245, 245, 220));
		frame.setBounds(100, 100, 360, 190);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMobileNo = new JLabel("Mobile No.");
		lblMobileNo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblMobileNo.setBounds(10, 11, 77, 14);
		frame.getContentPane().add(lblMobileNo);
		
		textField = new JTextField();
		textField.setBounds(10, 36, 136, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCardNo = new JLabel("CreditCard no.");
		lblCardNo.setForeground(new Color(220, 20, 60));
		lblCardNo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCardNo.setBounds(10, 68, 154, 14);
		frame.getContentPane().add(lblCardNo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 93, 136, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Fill the blanks in to continue");
		lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		lblNewLabel.setBounds(10, 127, 136, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnDone = new JButton("DONE");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					FileWriter fw = new FileWriter("Customer1.txt",true);  //Details
					BufferedWriter bw = new BufferedWriter(fw);
		                mobile=textField.getText();
						card=textField_1.getText();
						
						bw.newLine();
						bw.write(mobile);
						bw.newLine();
						bw.write(card);
						bw.newLine();
						
						if((textField.getText()!=null&&!textField.getText().equals(""))&& (textField_1.getText()!=null&&!textField_1.getText().equals("")))
						{
							   JOptionPane.showMessageDialog(null,"Successfully Purchased");
							   Products.purchase=true;
							   Cart.cart.clear();
							   Products.login=true;
							   Selection.a.clear();
							   Products.arr.clear();
							   Cart.cart.clear();
							   Products.main(null);
							   frame.dispose();
						}
						else
							JOptionPane.showMessageDialog(null,"Please fill in the form first");

		            bw.close();
		            fw.close();
				}
				catch(FileNotFoundException e1){
					e1.printStackTrace();
				}
				catch(IOException e1){
					e1.printStackTrace();
				}
			}
		});
		btnDone.setBackground(new Color(0, 100, 0));
		btnDone.setBounds(213, 53, 89, 29);
		frame.getContentPane().add(btnDone);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, 360, 190);
		frame.getContentPane().add(lblNewLabel_1);
		Image img = new ImageIcon(this.getClass().getResource("/details.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
	}
}
