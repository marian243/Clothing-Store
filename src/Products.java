import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import java.awt.Color;

public class Products {

	public static ArrayList <P_Describtion> arr=new ArrayList<P_Describtion>();
	
	public static boolean login=false;
	public static boolean purchase=false;
	public static double total=0;
	
	private JFrame frame;

	public int click=0;
	public static String s;
	public static String s1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		P_Describtion temp=new P_Describtion("Denim","men","jeans","Blue","36",1600.00);
		arr.add(temp);
		temp=new P_Describtion("Woven", "women","tops","Black","36",600.00);
		arr.add(temp);
		temp=new P_Describtion("Denim", "women","jeans","White","36",1600.00);
		arr.add(temp);
		temp=new P_Describtion("Denim", "women","jeans","Blue","40",1600.00);
		arr.add(temp);
		temp=new P_Describtion("Denim", "men","jeans","Black","40",1600.0);
		arr.add(temp);
		temp=new P_Describtion("Silk", "women","saree","Orange","long",2000.0);
		arr.add(temp);
		temp=new P_Describtion("Christmas Kameez", "women","kameez","Pink","42",2500.0);
		arr.add(temp);
		temp=new P_Describtion("Cute", "women","dress","Green","40",2200.0);
		arr.add(temp);
		temp=new P_Describtion("Plain", "men","shirt","Mud","44",2300.0);
		arr.add(temp);
		temp=new P_Describtion("Premium jacquard", "men","panjabi","Fiery Orange","42",2600.0);
		arr.add(temp);
		temp=new P_Describtion("Bold", "men","suit","Grey","44",2800.0);
		arr.add(temp);
		temp=new P_Describtion("Tie", "accessory","scarf","Stripped Blue","long",900.0);
		arr.add(temp);
		temp=new P_Describtion("Scarf", "accessory","scarf","Floral Green","long",900.0);
		arr.add(temp);
		temp=new P_Describtion("Daniel Klein", "accessory","watch","Black","10",1500.0);
		arr.add(temp);
		temp=new P_Describtion("YouBella Bracelet", "accessory","accessory","Gold","12",1800.0);
		arr.add(temp);
		temp=new P_Describtion("Balanced Heels", "shoe","heel","Black","38",2000.0);
		arr.add(temp);
		temp=new P_Describtion("Lofer", "shoe","shoe","Brown","42",2100.0);
		arr.add(temp);
		temp=new P_Describtion("Flats", "shoe","flat","Brown","36",1600.0);
		arr.add(temp);
		temp=new P_Describtion("Sandal", "shoe","flat","Black","44",1500.0);
		arr.add(temp);
		temp=new P_Describtion("Mauboussin Perfume", "promotion","scent","Pink","medium",3000.0);
		arr.add(temp);
		temp=new P_Describtion("Givenchy Perfume", "promotion","scent","Dark","medium",3000.0);
		arr.add(temp);
		temp=new P_Describtion("Hoodie", "arrived","hoodie","black","36",1800.0);
		arr.add(temp);
		temp=new P_Describtion("TeeShirt", "arrived","tee","Sky Blue","36",400.0);
		arr.add(temp);
		temp=new P_Describtion("Floral Kameez", "women","kameez","Purple","40",2400.0);
		arr.add(temp);
		temp=new P_Describtion("Lurex thread embroiderd", "men","panjabi","Blue","42",2600.0);
		arr.add(temp);
		temp=new P_Describtion("Jasper Dobby", "men","shirt","Brown","42",2200.0);
		arr.add(temp);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Products window = new Products();
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
	public Products() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(245, 245, 220));
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCS = new JLabel("R  (Clothing Store)");
		lblCS.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCS.setBounds(21, 11, 733, 79);
		frame.getContentPane().add(lblCS);
        Image img1 = new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
		
		lblCS.setIcon(new ImageIcon(img1));
		
		JButton btnFlat = new JButton("Flat");
		btnFlat.setForeground(new Color(128, 128, 0));
		btnFlat.setBackground(new Color(189, 183, 107));
		JButton btnHeel = new JButton("Heel");
		btnHeel.setForeground(new Color(128, 128, 0));
		btnHeel.setBackground(new Color(189, 183, 107));
		JButton btnShoe = new JButton("Shoe");
		btnShoe.setForeground(new Color(128, 128, 0));
		btnShoe.setBackground(new Color(189, 183, 107));
		JButton btnAccessory = new JButton("Accessory");
		btnAccessory.setForeground(new Color(139, 69, 19));
		btnAccessory.setBackground(new Color(222, 184, 135));
		JButton btnWatch = new JButton("Watch");
		btnWatch.setForeground(new Color(139, 69, 19));
		btnWatch.setBackground(new Color(222, 184, 135));
		JButton btnScarf = new JButton("Scarf/Tie");                            //Buttons
		btnScarf.setForeground(new Color(139, 69, 19));
		btnScarf.setBackground(new Color(222, 184, 135));
		JButton btnSuit = new JButton("Blazer");
		btnSuit.setForeground(new Color(100, 149, 237));
		JButton btnPanjabi = new JButton("Panjabi");
		btnPanjabi.setForeground(new Color(100, 149, 237));
		JButton btnJeans_1 = new JButton("Jeans");
		btnJeans_1.setForeground(new Color(100, 149, 237));
		JButton btnShirt_1 = new JButton("Shirt");
		btnShirt_1.setForeground(new Color(100, 149, 237));
		JButton btnShirt = new JButton("Tops");
		btnShirt.setForeground(new Color(128, 0, 0));
		btnShirt.setBackground(Color.PINK);
		btnShirt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i=0;i<arr.size();i++)
				{	
					if(arr.get(i).getCategory1()=="tops")
					{
						Selection.a.add(arr.get(i));
						s="/tops.png";
					}
				}
				if(Selection.a.size()>0){
					Selection.main(null);
				    frame.dispose();
				}
					else 
						JOptionPane.showMessageDialog(null,"Sorry the item is unavailable right now\n Try again soon...");
			}
		});
		btnShirt.setBounds(123, 141, 96, 23);
		frame.getContentPane().add(btnShirt);
		
		JButton btnJeans = new JButton("Jeans");
		btnJeans.setForeground(new Color(128, 0, 0));
		btnJeans.setBackground(Color.PINK);
		btnJeans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				for(int i=0;i<arr.size();i++)
				{	
					frame.setVisible(false);
					if(arr.get(i).getCategory()=="women" && arr.get(i).getCategory1()=="jeans")
					{
						Selection.a.add(arr.get(i));
						s="/jeans.png";
						s1="/jeans-dk.png";
					}
				}
				if(Selection.a.size()>0){
					Selection.main(null);
				    frame.dispose();
				}
					else 
						JOptionPane.showMessageDialog(null,"Sorry the item is unavailable right now\n Try again soon...");
			}
		});
		btnJeans.setBounds(123, 162, 96, 23);
		frame.getContentPane().add(btnJeans);
		
		JButton btnKameez = new JButton("Kameez");
		btnKameez.setForeground(new Color(128, 0, 0));
		btnKameez.setBackground(Color.PINK);
		btnKameez.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i=0;i<arr.size();i++)
				{	
					if(arr.get(i).getCategory1()=="kameez")
					{
						Selection.a.add(arr.get(i));
						s= "/kameez.png";
						s1= "/kameez1.png";
					}
				}
				if(Selection.a.size()>0){
					Selection.main(null);
				    frame.dispose();
				}
				else 
					JOptionPane.showMessageDialog(null,"Sorry the item is unavailable right now\n Try again soon...");
			}
		});
		btnKameez.setBounds(123, 185, 96, 23);
		frame.getContentPane().add(btnKameez);
		
		JButton btnSaree = new JButton("Saree");
		btnSaree.setForeground(new Color(128, 0, 0));
		btnSaree.setBackground(Color.PINK);
		btnSaree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i=0;i<arr.size();i++)
				{	
					if(arr.get(i).getCategory1()=="saree")
					{
						Selection.a.add(arr.get(i));
						s="/saree.png";
					}
				}
				if(Selection.a.size()>0){
					Selection.main(null);
				    frame.dispose();
				}
					else 
						JOptionPane.showMessageDialog(null,"Sorry the item is unavailable right now\n Try again soon...");
			}
		});
		btnSaree.setBounds(123, 208, 96, 23);
		frame.getContentPane().add(btnSaree);
		
		JButton btnDress = new JButton("Dress");
		btnDress.setForeground(new Color(128, 0, 0));
		btnDress.setBackground(Color.PINK);
		btnDress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i=0;i<arr.size();i++)
				{	
					if(arr.get(i).getCategory1()=="dress")
					{
						Selection.a.add(arr.get(i));
						s="/dress.png";
					}
				}
				if(Selection.a.size()>0){
					Selection.main(null);
				    frame.dispose();
				}
					else 
						JOptionPane.showMessageDialog(null,"Sorry the item is unavailable right now\n Try again soon...");
			}
		});
		btnDress.setBounds(123, 230, 96, 23);
		frame.getContentPane().add(btnDress);
		
		btnShirt.setVisible(false);
		btnJeans.setVisible(false);
		btnKameez.setVisible(false);
		btnSaree.setVisible(false);
		btnDress.setVisible(false);
		
		JButton btnWomen = new JButton("Women");
		btnWomen.setForeground(Color.PINK);
		btnWomen.setBackground(new Color(139, 0, 0));
		btnWomen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(click%2==0){
				  btnShirt.setVisible(true);
				  btnJeans.setVisible(true);
				  btnKameez.setVisible(true);
				  btnSaree.setVisible(true);
				  btnDress.setVisible(true);
				  btnScarf.setVisible(false);
				  btnWatch.setVisible(false);
				  btnAccessory.setVisible(false);
				  btnShoe.setVisible(false);
				  btnHeel.setVisible(false);
				  btnFlat.setVisible(false);
				  btnShirt_1.setVisible(false);
				  btnJeans_1.setVisible(false);
				  btnPanjabi.setVisible(false);
				  btnSuit.setVisible(false);
				}
				else{
					btnShirt.setVisible(false);
					btnJeans.setVisible(false);
					btnKameez.setVisible(false);
					btnSaree.setVisible(false);
					btnDress.setVisible(false);
				}
				click++;
				
			}
		});
		btnWomen.setBounds(92, 101, 155, 41);
		frame.getContentPane().add(btnWomen);
		
		btnShirt_1.setBackground(new Color(0, 0, 128));
		btnShirt_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i=0;i<arr.size();i++)
				{	
					if(arr.get(i).getCategory1()=="shirt"&& arr.get(i).getCategory()=="men")
					{
						Selection.a.add(arr.get(i));
						s="/shirt.png";
						s1="/shirt1.png";
					}
				}
				if(Selection.a.size()>0){
					Selection.main(null);
				    frame.dispose();
				}
					else 
						JOptionPane.showMessageDialog(null,"Sorry the item is unavailable right now\n Try again soon...");
			}
		});
		btnShirt_1.setBounds(270, 141, 88, 23);
		frame.getContentPane().add(btnShirt_1);
		
		btnJeans_1.setBackground(new Color(0, 0, 128));
		btnJeans_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i=0;i<arr.size();i++)
				{	
					if(arr.get(i).getCategory1()=="jeans"&& arr.get(i).getCategory()=="men")
					{
						Selection.a.add(arr.get(i));
						s="/jeans1.png";
						s1="/jeans2.png";
					}
				}
				if(Selection.a.size()>0){
					Selection.main(null);
				    frame.dispose();
				}
					else 
						JOptionPane.showMessageDialog(null,"Sorry the item is unavailable right now\n Try again soon...");
			}
		});
		btnJeans_1.setBounds(270, 161, 88, 23);
		frame.getContentPane().add(btnJeans_1);
		
		btnPanjabi.setBackground(new Color(0, 0, 128));
		btnPanjabi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i=0;i<arr.size();i++)
				{	
					if(arr.get(i).getCategory1()=="panjabi")
					{
						Selection.a.add(arr.get(i));
						s="/panjabi.png";
						s1="/panjabi1.png";
					}
				}
				if(Selection.a.size()>0){
					Selection.main(null);
				    frame.dispose();
				}
					else 
						JOptionPane.showMessageDialog(null,"Sorry the item is unavailable right now\n Try again soon...");
			}
		});
		btnPanjabi.setBounds(270, 185, 88, 23);
		frame.getContentPane().add(btnPanjabi);
		
		btnSuit.setBackground(new Color(0, 0, 128));
		btnSuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i=0;i<arr.size();i++)
				{	
					if(arr.get(i).getCategory1()=="suit")
					{
						Selection.a.add(arr.get(i));
						s="/blazer.png";
					}
				}
				if(Selection.a.size()>0){
					Selection.main(null);
				    frame.dispose();
				}
					else 
						JOptionPane.showMessageDialog(null,"Sorry the item is unavailable right now\n Try again soon...");
			}
		});
		btnSuit.setBounds(270, 208, 88, 23);
		frame.getContentPane().add(btnSuit);
		
		btnShirt_1.setVisible(false);
		btnJeans_1.setVisible(false);
		btnPanjabi.setVisible(false);
		btnSuit.setVisible(false);
		
		JButton btnMen = new JButton("Men");
		btnMen.setForeground(new Color(152, 251, 152));
		btnMen.setBackground(new Color(0, 128, 0));
		btnMen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(click%2==0)
				    {
					  btnShirt_1.setVisible(true);
					  btnJeans_1.setVisible(true);
					  btnPanjabi.setVisible(true);
					  btnSuit.setVisible(true);
					  btnShirt.setVisible(false);
					  btnJeans.setVisible(false);
					  btnKameez.setVisible(false);
					  btnSaree.setVisible(false);
					  btnDress.setVisible(false);
					  btnScarf.setVisible(false);
					  btnWatch.setVisible(false);
					  btnAccessory.setVisible(false);
					  btnShoe.setVisible(false);
					  btnHeel.setVisible(false);
					  btnFlat.setVisible(false);
					}
					else{
						btnShirt_1.setVisible(false);
						btnJeans_1.setVisible(false);
						btnPanjabi.setVisible(false);
						btnSuit.setVisible(false);
					}
					click++;
			}
		});
		btnMen.setBounds(245, 101, 155, 41);
		frame.getContentPane().add(btnMen);
		
		btnScarf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i=0;i<arr.size();i++)
				{	
					if(arr.get(i).getCategory()=="accessory"&& arr.get(i).getCategory1()=="scarf")
					{
						Selection.a.add(arr.get(i));
						s="/tie.png";
						s1="/scarf.png";
					}
				}
				if(Selection.a.size()>0){
					Selection.main(null);
				    frame.dispose();
				}
					else 
						JOptionPane.showMessageDialog(null,"Sorry the item is unavailable right now\n Try again soon...");
			}
		});
		btnScarf.setBounds(422, 141, 96, 23);
		frame.getContentPane().add(btnScarf);
	
		btnWatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<arr.size();i++)
				{	
					if(arr.get(i).getCategory()=="accessory"&& arr.get(i).getCategory1()=="watch")
					{
						Selection.a.add(arr.get(i));
						s="/watch.png";
					}
				}
				if(Selection.a.size()>0){
					Selection.main(null);
				    frame.dispose();
				}
					else 
						JOptionPane.showMessageDialog(null,"Sorry the item is unavailable right now\n Try again soon...");
			}
		});
		btnWatch.setBounds(422, 162, 96, 23);
		frame.getContentPane().add(btnWatch);

		btnAccessory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<arr.size();i++)
				{	
					if(arr.get(i).getCategory()=="accessory"&& arr.get(i).getCategory1()=="accessory")
					{
						Selection.a.add(arr.get(i));
						s="/bracelet.png";
					}
				}
				if(Selection.a.size()>0){
					Selection.main(null);
				    frame.dispose();
				}
					else 
						JOptionPane.showMessageDialog(null,"Sorry the item is unavailable right now\n Try again soon...");
			}
		});
		btnAccessory.setBounds(422, 185, 96, 23);
		frame.getContentPane().add(btnAccessory);
		
		btnScarf.setVisible(false);
		btnWatch.setVisible(false);
		btnAccessory.setVisible(false);
		
		JButton btnAccessories = new JButton("Accessories");
		btnAccessories.setForeground(new Color(160, 82, 45));
		btnAccessories.setBackground(new Color(244, 164, 96));
		btnAccessories.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(click%2==0){
					  btnScarf.setVisible(true);
					  btnWatch.setVisible(true);
					  btnAccessory.setVisible(true);
					  btnShoe.setVisible(false);
					  btnHeel.setVisible(false);
					  btnFlat.setVisible(false);
					  btnShirt_1.setVisible(false);
					  btnJeans_1.setVisible(false);
					  btnPanjabi.setVisible(false);
					  btnSuit.setVisible(false);
					  btnShirt.setVisible(false);
					  btnJeans.setVisible(false);
					  btnKameez.setVisible(false);
					  btnSaree.setVisible(false);
					  btnDress.setVisible(false);
					}
					else{
						btnScarf.setVisible(false);
						btnWatch.setVisible(false);
						btnAccessory.setVisible(false);
					}
					click++;
			}
		});
		btnAccessories.setBounds(397, 101, 140, 41);
		frame.getContentPane().add(btnAccessories);
		
		btnShoe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<arr.size();i++)
				{	
					if(arr.get(i).getCategory()=="shoe"&& arr.get(i).getCategory1()=="shoe")
					{
						Selection.a.add(arr.get(i));
						s="/shoe.png";
					}
				}
				if(Selection.a.size()>0){
					Selection.main(null);
				    frame.dispose();
				}
					else 
						JOptionPane.showMessageDialog(null,"Sorry the item is unavailable right now\n Try again soon...");
			}
		});
		btnShoe.setBounds(559, 141, 89, 23);
		frame.getContentPane().add(btnShoe);
		
		btnHeel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<arr.size();i++)
				{	
					if(arr.get(i).getCategory()=="shoe"&& arr.get(i).getCategory1()=="heel")
					{
						Selection.a.add(arr.get(i));
						s="/heels.png";
					}
				}
				if(Selection.a.size()>0){
					Selection.main(null);
				    frame.dispose();
				}
					else 
						JOptionPane.showMessageDialog(null,"Sorry the item is unavailable right now\n Try again soon...");
			}
		});
		btnHeel.setBounds(559, 162, 89, 23);
		frame.getContentPane().add(btnHeel);
		
		btnFlat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<arr.size();i++)
				{	
					if(arr.get(i).getCategory()=="shoe"&& arr.get(i).getCategory1()=="flat")
					{
						Selection.a.add(arr.get(i));
						s="/flat.png";
						s1="/sandal.png";
					}
				}
				if(Selection.a.size()>0){
					Selection.main(null);
				    frame.dispose();
				}
					else 
						JOptionPane.showMessageDialog(null,"Sorry the item is unavailable right now\n Try again soon...");
			}
		});
		btnFlat.setBounds(559, 185, 89, 23);
		frame.getContentPane().add(btnFlat);
		
		btnShoe.setVisible(false);
		btnHeel.setVisible(false);
		btnFlat.setVisible(false);
		
		JButton btnShoes = new JButton("Shoes");
		btnShoes.setForeground(new Color(189, 183, 107));
		btnShoes.setBackground(new Color(128, 128, 0));
		btnShoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(click%2==0){
					  btnShoe.setVisible(true);
					  btnHeel.setVisible(true);
					  btnFlat.setVisible(true);
					  btnShirt_1.setVisible(false);
					  btnJeans_1.setVisible(false);
					  btnPanjabi.setVisible(false);
					  btnSuit.setVisible(false);
					  btnShirt.setVisible(false);
					  btnJeans.setVisible(false);
					  btnKameez.setVisible(false);
					  btnSaree.setVisible(false);
					  btnDress.setVisible(false);
					  btnScarf.setVisible(false);
					  btnWatch.setVisible(false);
					  btnAccessory.setVisible(false);
					}
					else{
						btnShoe.setVisible(false);
						btnHeel.setVisible(false);
						btnFlat.setVisible(false);
					}
					click++;
			}
		});
		btnShoes.setBounds(538, 101, 137, 41);
		frame.getContentPane().add(btnShoes);
		
		JButton btnPromo = new JButton("Promo");
		btnPromo.setForeground(new Color(0, 0, 0));
		btnPromo.setBackground(new Color(255, 0, 0));
		btnPromo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i=0;i<arr.size();i++)
				{	
					if(arr.get(i).getCategory()=="promotion")
					{
						Selection.a.add(arr.get(i));
						s="/perfume.png";
						s1="/perfume1.png";
					}
				}
				if(Selection.a.size()>0){
					Selection.main(null);
				    frame.dispose();
				}
					else 
						JOptionPane.showMessageDialog(null,"Sorry! No Promotions are there\n Try again soon...");
			}
		});
		btnPromo.setBounds(319, 397, 89, 35);
		frame.getContentPane().add(btnPromo);
		
		JButton btnNewArrival = new JButton("New Arrival");
		btnNewArrival.setBackground(new Color(255, 165, 0));
		btnNewArrival.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i=0;i<arr.size();i++)
				{	
					if(arr.get(i).getCategory()=="arrived")
					{
						Selection.a.add(arr.get(i));
						s="/hoodie.png";
						s1="/tee.png";
					}
				}
				if(Selection.a.size()>0){
					Selection.main(null);
				    frame.dispose();
				}
					else 
						JOptionPane.showMessageDialog(null,"Sorry! No  new Arrivals are there\n Try again soon...");
			}
		});
		btnNewArrival.setBounds(450, 397, 126, 35);
		frame.getContentPane().add(btnNewArrival);
		
		JButton btnCosmetics = new JButton("Cosmetics");
		btnCosmetics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i=0;i<arr.size();i++)
				{	
					if(arr.get(i).getCategory1()=="cosmetics")
					{
						Selection.a.add(arr.get(i));
					}
				}
				if(Selection.a.size()>0){
					Selection.main(null);
				    frame.dispose();
				}
					else 
						JOptionPane.showMessageDialog(null,"Sorry the item is unavailable right now\n Try again soon...");
			}
		});
		btnCosmetics.setBackground(new Color(255, 228, 225));
		btnCosmetics.setBounds(172, 397, 102, 35);
		frame.getContentPane().add(btnCosmetics);
		
		JLabel lblNewLabel = new JLabel("Our products are free of VAT");
		lblNewLabel.setForeground(new Color(238, 232, 170));
		lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		lblNewLabel.setBounds(392, 508, 184, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Products can be exchanged within 7 days of purchase");
		lblNewLabel_1.setForeground(new Color(238, 232, 170));
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(391, 522, 265, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Products will be delivered with a day or two of purchase, no shipment");
		lblNewLabel_2.setForeground(new Color(238, 232, 170));
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(391, 536, 352, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel dummy = new JLabel("New label");
		dummy.setBounds(0, 0, 800, 600);
		frame.getContentPane().add(dummy);
		
		Image img = new ImageIcon(this.getClass().getResource("/main.png")).getImage();
		
		dummy.setIcon(new ImageIcon(img));
		
	}
}
