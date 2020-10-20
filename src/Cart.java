import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
//import javax.swing.JTextPane;

public class Cart extends Selection{

	private JFrame frame;
	public int product;
	public int cart_count = 0;
	public static ArrayList<P_Describtion> cart= new ArrayList<>();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cart window = new Cart();
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
	public Cart() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 224));
		frame.setBounds(100, 100, 424, 297);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(169, 169, 169));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Selection.main(null);
				frame.dispose();
				frame.setVisible(false);
			}
		});
		
		JButton btnX = new JButton("X");                                                  //Delete
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 cart.clear();
				 Products.total=0;
				 textField.setText("Tk. "+String.valueOf(Products.total));
				 textField_1.setText(String.valueOf(cart.size()));
			}
		});
		btnX.setForeground(new Color(255, 0, 0));
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnX.setBackground(new Color(192, 192, 192));
		btnX.setBounds(210, 128, 51, 23);
		frame.getContentPane().add(btnX);
		btnBack.setBounds(131, 213, 89, 23);
		frame.getContentPane().add(btnBack);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setFont(new Font("Arial", Font.PLAIN, 13));
		textField.setBounds(289, 147, 80, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText("Tk. "+String.valueOf(Products.total));
		
		JButton btnCart = new JButton("BUY");
		btnCart.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCart.setForeground(new Color(0, 0, 0));
		btnCart.setBackground(new Color(255, 0, 0));
		btnCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//cart.get(item_index).getPrice();
				
				if(Products.login==false)
				{
					JOptionPane.showMessageDialog(null, "Please Login or SignUp to Purchase");
					Login.main(null);
					frame.dispose();                                                              //Purchase
					frame.setVisible(false);
				}else
				{
					Products.purchase=true;
					cart.clear();
					JOptionPane.showMessageDialog(null, "Purchased Successfully\nThank you!");
					Products.purchase=true;
					Cart.cart.clear();
					Products.login=true;
					Selection.a.clear();
					Products.arr.clear();
					Products.main(null);
					frame.dispose();
				}
				
			}
		});
		btnCart.setBounds(78, 113, 58, 54);
		frame.getContentPane().add(btnCart);
		
		JLabel lblCS = new JLabel("R  (Clothing Store)");
		lblCS.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCS.setBounds(10, 11, 388, 47);
		frame.getContentPane().add(lblCS);
		Image img1 = new ImageIcon(this.getClass().getResource("/logo3.png")).getImage();
		lblCS.setIcon(new ImageIcon(img1));
		
		JLabel lblNewLabel = new JLabel("Price:");
		lblNewLabel.setForeground(new Color(255, 248, 220));
		lblNewLabel.setFont(new Font("Arial Unicode MS", Font.BOLD, 14));
		lblNewLabel.setBounds(289, 113, 84, 23);
		frame.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_1.setBackground(new Color(255, 255, 255));
		textField_1.setBounds(156, 112, 42, 55);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		textField_1.setText(String.valueOf(cart.size()));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, -8, 424, 297);
		frame.getContentPane().add(lblNewLabel_1);
		Image img = new ImageIcon(this.getClass().getResource("/C.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		
	}
}
