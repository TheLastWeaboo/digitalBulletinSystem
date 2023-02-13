package digitalBulletin;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class mainFrame implements ActionListener
{
	
	JFrame frame;
	JDialog QADialog;
	JDialog SDialog;
	JDialog AUDialog;
	
	public mainFrame() {
		
				
				Border border = BorderFactory.createLineBorder(Color.black, 3);
				
				JButton QAButton = new JButton("Q&A");
				QAButton.setBounds(50, 240, 140, 50);
				QAButton.setBackground(new Color(115, 112, 115));
				QAButton.setFont(new Font("Arial", Font.BOLD, 20));
				QAButton.setBorder(border);
				QAButton.addActionListener(this);
				
				JButton SButton = new JButton("Suggestions");
				SButton.setBounds(50, 340, 140, 50);
				SButton.setBackground(new Color(115, 112, 115));
				SButton.setFont(new Font("Arial", Font.BOLD, 20));
				SButton.setBorder(border);
				SButton.addActionListener(this);

				
				JButton AUButton = new JButton("About Us");
				AUButton.setBounds(30, 500, 140, 50);
				AUButton.setBackground(new Color(158, 163, 163));
				AUButton.setFont(new Font("Arial", Font.BOLD, 20));
				AUButton.setBorder(border);
				AUButton.addActionListener(this);

				
				JLabel label1 = new JLabel(); 
				label1.setText("<html>Announcement<br></html>\"");
				label1.setFont(new Font ("Tahoma", Font.BOLD, 20));
				label1.setBounds(300, -80, 250, 200);
				
				JLabel label2 = new JLabel();
				label2.setText("<html><br>We are having the english month! <br><br>"
						+ "Theme: The Importance of Taking Care of the Mother Nature <br><br> "
						+ "When: October 21, 2022 at 10:00 PM <br><br> Where: via GMEET <br><br><br><br> "
						+ "Details: <br><br> We are inviting you to join and celebrate with us the English month, participate on the activities prepared by the school and you may have the chance to win incredible prizes!</html>");
				label2.setFont(new Font ("Tahoma", Font.BOLD, 16));
				label2.setBounds(10, 10, 700, 400);
				
				JLabel label3 = new JLabel();
				label3.setText("<html>About our school <br></html>");
				label3.setFont(new Font("Tahoma", Font.BOLD, 20));
				label3.setBounds(10, 20, 300, 250);
				
				JLabel label4 = new JLabel();
				label4.setText("<html>Please click the button below to see more information</html>");
				label4.setFont(new Font("Tahoma", Font.BOLD, 17));
				label4.setBounds(10, 70, 190, 400);
				
				JLabel label5 = new JLabel();
				label5.setText("<html>This is where you can put additional information about the event like goals or moto</html>");
				label5.setFont(new Font("Tahoma", Font.BOLD, 12));
				label5.setBounds(10, 440, 200, 100);
				label5.setBackground(new Color(210, 96, 214));
				label5.setOpaque(true);
				label5.setBorder(border);
				
				JLabel label6 = new JLabel();
				label6.setText("<html>SVFC DIGITAL BULLETIN BOARD</html>");
				label6.setFont(new Font("Tahoma", Font.BOLD, 35));
				label6.setBounds(310, 50, 600, 70);
				
				
				ImageIcon image2 = new ImageIcon("C://Users//Jeff//Desktop//Codes//ALEX TUTORIALS//newsvfc.png");
				// IMPORT NOTE: change directory depending where you put the picture
				JLabel labelpic = new JLabel();
				labelpic.setIcon(image2);
				labelpic.setBounds(30, 20, 170, 175);
				//labelpic.setBorder(border);
				
				JPanel APanel = new JPanel();
				APanel.setBackground(new Color(222, 217, 222));
				APanel.setBounds(225, 140, 750, 500);
				APanel.setBorder(border);
				APanel.setLayout(null);
				
				JPanel ABPanel = new JPanel();
				ABPanel.setBackground(new Color(210, 96, 214));
				ABPanel.setBounds(1000, 70, 200, 600);
				ABPanel.setBorder(border);
				ABPanel.setLayout(null);
				
				frame = new JFrame("MainFrame");
				
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLayout(null);
				frame.setSize(1250, 750);
				frame.setVisible(true);
				APanel.add(label1);
				APanel.add(label2);
				ABPanel.add(label3);
				ABPanel.add(label4);
				ABPanel.add(AUButton);
				frame.add(APanel);
				frame.add(ABPanel);
				frame.add(QAButton);
				frame.add(SButton);
				frame.add(labelpic);
				frame.add(label5);
				frame.add(label6);
				
				
				ImageIcon image = new ImageIcon("C://Users//Jeff//Desktop//Codes//ALEX TUTORIALS//svfc.jpg"); 
				// IMPORT NOTE: change directory depending where you put the picture
				frame.getContentPane().setBackground(new Color(158, 163, 163));
				frame.setIconImage(image.getImage());
					
	}
	
	public static void main(String []args) 
	{
		
		new mainFrame();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Q&A")) 
		{	
			showFirstDialog();
		}
		else if(e.getActionCommand().equals("Suggestions")) 
		{
			showSecondDialog();
		}
		else if(e.getActionCommand().equals("About Us")) 
		{
			showThirdDialog();
		}
		
		
	}

	private void showFirstDialog() {
		
		Border border = BorderFactory.createLineBorder(Color.black, 3);
		
		JTextField tf = new JTextField();
		tf.setBounds(90, 605, 400, 40);
		tf.setBackground(Color.white);
		tf.setBorder(border);
		
		JButton enterButton1 = new JButton("Ask");
		enterButton1.setBounds(485, 605, 105, 40);
		enterButton1.setBackground(new Color(190, 223, 241));
		enterButton1.setBorder(border);
		
		JTextField tf2 = new JTextField();
		tf2.setBounds(640, 605, 400, 40);
		tf2.setBackground(Color.white);
		tf2.setBorder(border);
		
		JButton enterButton2 = new JButton("Answer");
		enterButton2.setBounds(1035, 605, 105, 40);
		enterButton2.setBackground(new Color(190, 223, 241));
		enterButton2.setBorder(border);
		
		JLabel label1 = new JLabel();
		label1.setBounds(370, 5, 500, 100);
		label1.setText("QUESTION AND ANSWER");
		label1.setFont(new Font("Tahoma", Font.BOLD, 35));
		label1.setForeground(Color.white);
		
		JLabel label2 = new JLabel();
		label2.setBounds(370, 5, 510, 110);
		label2.setText("QUESTION AND ANSWER");
		label2.setFont(new Font("Tahoma", Font.BOLD, 35));
		label2.setForeground(Color.black);
		
		ImageIcon icon = new ImageIcon("C:\\Users\\Jeff\\Desktop\\Codes\\ALEX TUTORIALS\\library.jpg");
		// IMPORT NOTE: change directory depending where you put the picture
	    JLabel labelpicture = new JLabel(icon);
		labelpicture.setSize(1250, 750);
		
		JTextArea textArea1 = new JTextArea();
		textArea1.setEditable(false);
		textArea1.setBounds(5, 5, 490, 490);
		textArea1.setBackground(new Color(235, 235, 235));	
        textArea1.setLineWrap(true);
		textArea1.setWrapStyleWord(true);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(90, 110, 500, 500);
		panel.setBackground(new Color(235, 235, 235));
		panel.setBorder(border);
		panel.add(textArea1);
		
		JTextArea textArea2 = new JTextArea();
		textArea2.setEditable(false);
		textArea2.setBounds(5, 5, 490, 490);
		textArea2.setBackground(new Color(235, 235, 235));
        textArea2.setLineWrap(true);
		textArea2.setWrapStyleWord(true);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(640, 110, 500, 500);
		panel2.setBackground(new Color(235, 235, 235));
		panel2.setBorder(border);
		panel2.add(textArea2);
		
		JFrame frame = new JFrame("Question and Answer");
		frame.setSize(1250, 750);
		frame.setLayout(null);	
		frame.setResizable(false);
		frame.add(enterButton1);
		frame.add(enterButton2);
		frame.add(tf);
		frame.add(tf2);
		frame.add(panel);
		frame.add(panel2);
		frame.add(label1);
		frame.add(label2);
		frame.add(labelpicture);
		//frame.setVisible(true);

		enterButton1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) 
			{

				textArea1.append(tf.getText()+"\n\n");
				
			}

		});
		
		enterButton2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e)
			{
		
				textArea2.append(tf2.getText()+"\n\n");
				
			}
		});

		frame.show();
}

	
	private void showSecondDialog() {
		
		
	Border border = BorderFactory.createLineBorder(Color.black, 3);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(5, 5, 990, 490);
		textArea.setBackground(new Color(235, 235, 235));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

		
		JTextField tf = new JTextField();
		tf.setBounds(2, 660, 1100, 50);
		tf.setBackground(Color.white);
		tf.setBorder(border);
		
		JLabel label1 = new JLabel();
		label1.setBounds(450, 10, 400, 100);
		label1.setText("SUGGESTION BOX");
		label1.setFont(new Font("Tahoma", Font.BOLD, 35));
		label1.setForeground(Color.white);
		
		JLabel label2 = new JLabel();
		label2.setBounds(450, 10, 410, 110);
		label2.setText("SUGGESTION BOX");
		label2.setFont(new Font("Tahoma", Font.BOLD, 35));
		label2.setForeground(Color.black);
		
		
		JButton enterButton = new JButton("Enter");
		enterButton.setBounds(1100, 660, 133, 50);
		enterButton.setBackground(new Color(190, 223, 241));
		enterButton.setBorder(border);
		
		JFrame frame = new JFrame("Suggestions");
		frame.setSize(1250, 750);
		frame.setLayout(null);
		//frame.setVisible(true);
		textArea.setEditable(false);
	
		ImageIcon icon = new ImageIcon("C:\\Users\\Jeff\\Desktop\\Codes\\ALEX TUTORIALS\\library.jpg");
		// IMPORT NOTE: change directory depending where you put the picture
	    JLabel labelpicture = new JLabel(icon);
		labelpicture.setSize(1250, 750);
		
		
		
		JPanel panel=new JPanel();
		panel.setLayout(null);
		panel.setBounds(110, 90, 1000, 500);
		panel.setBackground(new Color(235, 235, 235));
		panel.setBorder(border);
		panel.add(textArea);
		frame.add(tf);
		
		frame.add(enterButton);
		frame.add(panel);
		frame.add(label1);
		frame.add(label2);
		frame.add(labelpicture);
		

		enterButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) 
			{

				textArea.append(tf.getText()+"\n\n");
				

			}

		});

		frame.show();

		
		
		
	}
	
	private void showThirdDialog() {
		
		Dialog AUDialog = new JDialog(frame, "About Us");

		
				 	Border border = BorderFactory.createLineBorder(Color.black, 3);
				 	
				 	
				 	JPanel grayPanel = new JPanel();
				    grayPanel.setBackground(new Color(222, 217, 222));
				    grayPanel.setBounds(10, 20, 398, 418);
				    grayPanel.setBorder(border);
				    
				    JLabel AUlabel1 = new JLabel(); 
					AUlabel1.setText("<html>Philosophy<br></html>\"");
					AUlabel1.setFont(new Font ("Tahoma", Font.BOLD, 25));
					AUlabel1.setBounds(120, -80, 300, 200);
					
					JLabel AUlabel2= new JLabel();
					AUlabel2.setText("<html><br> The St. Vincent de Ferrer College, Inc.</html>");
					AUlabel2.setFont(new Font ("Tahoma", Font.BOLD, 16));
					AUlabel2.setBounds(50, -60, 340, 250);
					

					JLabel AUlabel3 = new JLabel();
					AUlabel3.setText("<html><pre>\tWas established to serve as a prime"
							+ "\ninstrument in educating and molding morally"
							+ "\nupright, self-relaint, God-fearing and community"
							+ "\n-oriented citiens of Camarin. This is to"
							+ "\nguarantee that those who have less in life will"
							+ "\nhave the opportunity  of wider access of quality"
							+ "\nyet affordable basic and tertiary education and"
							+ "\nskills training."
							+ "<br><br>"
							+ "\tThrough relevant curriculum developed by"
							+ "\ncore of component and committed roster of"
							+ "\nfaculty, the College develops young minds into"
							+ "\ncompetent graduates who can respond to the needs"
							+ "\nof Caloocan's business community and the"
							+ "\nPhilippine economy to become globally competitive"
							+ "\nin the new millennium. </html>");
					AUlabel3.setFont(new Font ("Tahoma", Font.TRUETYPE_FONT,12));
					AUlabel3.setBounds(30, 30, 700, 400);
					
					
						
					JPanel grayPanel2 = new JPanel();
					grayPanel2.setBackground(new Color(222, 217, 222));
					grayPanel2.setBounds(417,20,398,418);
					grayPanel2.setBorder(border);
					
					JLabel AUlabel4 = new JLabel();
					AUlabel4.setBackground(new Color(222, 217, 222));
					AUlabel4.setText("<html>Our Vision</html>");
					AUlabel4.setFont(new Font ("Tahoma", Font.BOLD, 25));
					AUlabel4.setBounds(120, -80, 300, 200);
					
					JLabel AUlabel5 = new JLabel();
					AUlabel5.setText("<html><pre>\n\n\n\tWe envision the <strong>St. Vicent de"
							+ "\nFerrer Inc. of Camarin </strong> as a leading learner"
							+ "\n-centered arts and traning skills instituition,"
							+ "\n bridging perseverance and practical wisdom in"
							+ "\nthe service of society, especially the poorest of"
							+ "\nthe poor Camarinans and the Filipino Youths in"
							+ "\ngeneral."
							+ "<br><br>"
							+ "\t&#8221;St. Vincent de Ferrer @ 2035&#8221;,envisions"
							+ "\nto be a premier Techological University"
							+ "\ncommitted to the upliftment of the quality of"
							+ "\nlives of the Filipinos, especially in the fields"
							+ "\nof technology, education, accountancy, liberal"
							+ "\narts, and sciences, which produce highliy"
							+ "\ncompetent and IT-enabled professionals who"
							+ "\nare God-fearing, creative, critical thinker,"
							+ "\ncollaborative and productive Filipino citize,"
							+ "\nready to respond.</html>");
					AUlabel5.setFont(new Font ("Tahoma", Font.TRUETYPE_FONT,12));
					AUlabel5.setBounds(30, 10, 700, 400);
					
					
					
					JPanel grayPanel3 = new JPanel();
					grayPanel3.setBackground(new Color(222,217,222));
					grayPanel3.setBounds(826,20,398,418);
					grayPanel3.setBorder(border);
					
					JLabel AUlabel6 = new JLabel();
					AUlabel6.setBackground(new Color(222, 217, 222));
					AUlabel6.setText("<html>Our Mission</html>");
					AUlabel6.setFont(new Font ("Tahoma", Font.BOLD, 25));
					AUlabel6.setBounds(120, -80, 300, 200);
					
					JLabel AUlabel7 = new JLabel();
					AUlabel7.setBackground(new Color(222,217,222));
					AUlabel7.setText("<html><pre>\n\n\n\tTo achieve its vision,<strong>St. Vicent de"
							+ "\nFerrer College of Camarin Inc.</strong> shall pursue"
							+ "\nand commit to develop highly competent, creative"
							+ "\nand competitive professionals and skilled workers"
							+ "\nfrom the children of poor Camarin residents by"
							+ "\nproviding accessible and holistic quality of"
							+ "\neducation and standard of instruction."
							+ "<br><br>"
							+ "\tIt also commits to provide a Center for"
							+ "\nExcellence and Development in research and"
							+ "\ntechnology in Caloocan and its neighboring"
							+ "\nlocalities; and to offer a haven for inculcating"
							+ "\nactive citizenship with integrity for the "
							+ "\nfulfillment of the nation's hope and dreams for"
							+ "\na progressive future for all."
							+ "\n</html>");
					AUlabel7.setFont(new Font ("Tahoma", Font.TRUETYPE_FONT,12));
					AUlabel7.setBounds(30, 0, 700, 400);
					
					
					ImageIcon image = new ImageIcon("C://Users//Jeff//Desktop//Codes//ALEX TUTORIALS//svfcau.jpg");
					// IMPORT NOTE: change directory depending where you put the picture
					JLabel AUlabel8 = new JLabel();
					AUlabel8.setIcon(image);
					AUlabel8.setBounds(10,448,866,252);
					AUlabel8.setBorder(border);
					
					JLabel AUlabel9 = new JLabel();
					AUlabel9.setText("<html><pre>Address: Area D, SVFC Compound, "
							+ "\nSan Vincente Ferrer St, Brgy 178"
							+ "\nCamarin, Caloocan, 1400 Metro Manila"
							+ "<br><br>"
							+ "Contact Information:"
							+ "\nLandline Number:0928 521 3110<"
							+ "\nEmail: info@svfc.com.ph"
							+ "<br><br>"
							+ "For more information, just visit:"
							+ "\nhttps://svfc.com.ph</html>");
					AUlabel9.setFont(new Font("Tahoma", Font.BOLD, 15));
					AUlabel9.setBounds(890, 365, 500, 400);
					

				    
				    AUDialog.setTitle("ALL ABOUT SVFC");
				    AUDialog.setLayout(null);
				    AUDialog.setResizable(false);
				    AUDialog.setSize(1250,750);
				    AUDialog.setVisible(true);
				   
				    AUDialog.add(AUlabel1);
				    AUDialog.add(grayPanel);
				    grayPanel.add(AUlabel1);
				    grayPanel.add(AUlabel2);
				    grayPanel.add(AUlabel3);
				    
				    AUDialog.add(grayPanel2);
				    grayPanel2.add(AUlabel4);
				    grayPanel2.add(AUlabel5);
				    
				    AUDialog.add(grayPanel3);
				    grayPanel3.add(AUlabel6);
				    grayPanel3.add(AUlabel7);
				    
				    
				   
					AUDialog.add(AUlabel8);
					AUDialog.add(AUlabel9);

				    
					((JDialog) AUDialog).getContentPane().setBackground(new Color(158, 163, 163));
				   
				   }
		
		
	}
	

