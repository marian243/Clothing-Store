import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JOptionPane;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Selection {
	
	public static int item_index=0;
	public static ArrayList <P_Describtion> a= new ArrayList<P_Describtion>();
	public static String S;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Selection window = new Selection();
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
	public Selection() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 248, 220));
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        Image img1 = new ImageIcon(this.getClass().getResource("/home.png")).getImage();
        
        JLabel lblCS = new JLabel("R  (Clothing Store)");
		lblCS.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCS.setBounds(24, 11, 654, 80);
		frame.getContentPane().add(lblCS);
		Image img2 = new ImageIcon(this.getClass().getResource("/logo2.png")).getImage();
		lblCS.setIcon(new ImageIcon(img2));
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(0, 128, 128));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {			//back button
				a.clear();
				Products.arr.clear();
				
				Products.main(null);
				item_index=0;
				frame.dispose();
				//frame.setVisible(false);
			}
		});
		btnBack.setBounds(298, 508, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JTextPane textPane = new JTextPane();
		textPane.setText(a.get(item_index).toString());                   //big white box
		textPane.setBounds(195, 169, 299, 258);
		frame.getContentPane().add(textPane);
		
		Image img = new ImageIcon(this.getClass().getResource(Products.s)).getImage();
		textPane.insertIcon(new ImageIcon(img));
		
		JButton btnLeft = new JButton("<");
		btnLeft.setFont(new Font("Arial", Font.PLAIN, 35));
		btnLeft.setBackground(Color.WHITE);
		btnLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(item_index>0)
				{	
						item_index--;
						textPane.setText(a.get(item_index).toString());  ///white box e add
						textPane.insertIcon(new ImageIcon(img));
				}
			}
		});
		btnLeft.setBounds(107, 270, 72, 56);
		frame.getContentPane().add(btnLeft);
		
		JButton btnRight = new JButton(">");
		btnRight.setFont(new Font("Arial", Font.PLAIN, 35));
		btnRight.setBackground(Color.WHITE);
		btnRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(item_index<a.size()-1)
				{   
					 item_index++;
					 textPane.setText(a.get(item_index).toString());
					 Image img = new ImageIcon(this.getClass().getResource(Products.s1)).getImage();
					 textPane.insertIcon(new ImageIcon(img));
				}
			}
		});
		btnRight.setBounds(508, 265, 72, 56);
		frame.getContentPane().add(btnRight);
		
		JButton btnCart = new JButton(""+Cart.cart.size());
		btnCart.setHorizontalAlignment(SwingConstants.RIGHT);
		Image img3 = new ImageIcon(this.getClass().getResource("/cart.png")).getImage();
		btnCart.setIcon(new ImageIcon(img3));
		
		JButton btnSelect = new JButton("Purchase");
		btnSelect.setBackground(new Color(255, 69, 0));
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cart.cart.add(a.get(item_index));
				if(Products.purchase==true){                                               //Select
					Products.total=0;
				}
				Products.total+=a.get(item_index).getPrice();
				    btnCart.setText(""+ Cart.cart.size());
			}
		});
		
		
		btnCart.setBackground(new Color(255, 255, 255));
		btnCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cart.main(null);
				frame.dispose();
				frame.setVisible(false);
			}
		});
		btnCart.setBounds(688, 36, 77, 38);
		frame.getContentPane().add(btnCart);
		
		btnSelect.setBounds(299, 469, 89, 23);
		frame.getContentPane().add(btnSelect);
		
		JLabel lbl = new JLabel("New label");
		lbl.setBounds(-16, -3, 800, 600);
		frame.getContentPane().add(lbl);
		
		lbl.setIcon(new ImageIcon(img1));
		
		
	}
}
