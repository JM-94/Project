package Order;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class DPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JButton plus;
	private JButton plus2;
	private JButton plus3;
	private JButton plus4;
	private JButton plus5;
	private JButton plus6;
	private JButton plus7;
	private JButton min;
	private JButton min2;
	private JButton min3;
	private JButton min4;
	private JButton min5;
	private JButton min6;
	private JButton min7;
	private JLabel lblm;
	private JLabel lblm_1;
	private JLabel lblNbb_1;
	private JLabel lblN_1;
	private JLabel lblN_2;
	private JLabel lblN_3;
	private JLabel lblN_4;

	public DPanel() {
		setBackground(Color.ORANGE);
		setLayout(null);

		JButton menu1 = new JButton("");
		menu1.setIcon(new ImageIcon("D:\\icon insert\\30 31 32 33 soda.JPG"));
		menu1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				plus.setEnabled(true);
				min.setEnabled(true);
				textField.setText(""+Main.mount[30]);
			}
		});
		menu1.setBounds(40, 60, 100, 100);
		add(menu1);
		
		JButton menu2 = new JButton("");
		menu2.setIcon(new ImageIcon("D:\\icon insert\\31.JPG"));
		menu2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				plus2.setEnabled(true);
				min2.setEnabled(true);
				textField_1.setText(""+Main.mount[31]);
			}
		});
		menu2.setBounds(180, 60, 100, 100);
		add(menu2);
		
		JButton menu3 = new JButton("");
		menu3.setIcon(new ImageIcon("D:\\icon insert\\32.JPG"));
		menu3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				plus3.setEnabled(true);
				min3.setEnabled(true);
				textField_2.setText(""+Main.mount[32]);
			}
		});
		menu3.setBounds(320, 60, 100, 100);
		add(menu3);
		
		JButton menu4 = new JButton("New button");
		menu4.setIcon(new ImageIcon("D:\\icon insert\\30 31 32 33 soda.JPG"));
		menu4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				plus4.setEnabled(true);
				min4.setEnabled(true);
				textField_3.setText(""+Main.mount[33]);
			}
		});
		menu4.setBounds(460, 60, 100, 100);
		add(menu4);
		
		JButton menu5 = new JButton("");
		menu5.setIcon(new ImageIcon("D:\\icon insert\\34 Orange.JPG"));
		menu5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				plus5.setEnabled(true);
				min5.setEnabled(true);
				textField_4.setText(""+Main.mount[34]);
			}
		});
		menu5.setBounds(600, 60, 100, 100);
		add(menu5);
		
		JButton menu6 = new JButton("");
		menu6.setIcon(new ImageIcon("D:\\icon insert\\35 hotame.JPG"));
		menu6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				plus6.setEnabled(true);
				min6.setEnabled(true);
				textField_5.setText(""+Main.mount[35]);
			}
		});
		menu6.setBounds(40, 220, 100, 100);
		add(menu6);
		
		JButton menu7 = new JButton("");
		menu7.setIcon(new ImageIcon("D:\\icon insert\\36 iceame.JPG"));
		menu7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				plus7.setEnabled(true);
				min7.setEnabled(true);
				textField_6.setText(""+Main.mount[36]);
			}
		});
		menu7.setBounds(180, 220, 100, 100);
		add(menu7);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(65, 160, 50, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(205, 160, 50, 20);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(345, 160, 50, 20);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(485, 160, 50, 20);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(625, 160, 50, 20);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setColumns(10);
		textField_5.setBounds(65, 320, 50, 20);
		add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setColumns(10);
		textField_6.setBounds(205, 320, 50, 20);
		add(textField_6);
		
		
		
		/// @@@@@@@@@@@@@@@@@ ¤½,¤©·¯½º
		
		
		
		plus = new JButton("");
		plus.setIcon(new ImageIcon("D:\\icon insert\\add.JPG"));
		plus.setEnabled(false);
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[30] = Main.mount[30] + 1;
				textField.setText(""+Main.mount[30]);
			}
		});
		plus.setBounds(40, 160, 25, 20);
		add(plus);
		
		plus2 = new JButton("");
		plus2.setIcon(new ImageIcon("D:\\icon insert\\add.JPG"));
		plus2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[31] = Main.mount[31] + 1;
				textField_1.setText(""+Main.mount[31]);
			}
		});
		plus2.setBounds(180, 160, 25, 20);
		add(plus2);
		plus2.setEnabled(false);
		
		plus3 = new JButton("");
		plus3.setIcon(new ImageIcon("D:\\icon insert\\add.JPG"));
		plus3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[32] = Main.mount[32] + 1;
				textField_2.setText(""+Main.mount[32]);
			}
		});
		plus3.setBounds(320, 160, 25, 20);
		add(plus3);
		plus3.setEnabled(false);
		
		plus4 = new JButton("");
		plus4.setIcon(new ImageIcon("D:\\icon insert\\add.JPG"));
		plus4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[33] = Main.mount[33] + 1;
				textField_3.setText(""+Main.mount[33]);
			}
		});
		plus4.setBounds(460, 160, 25, 20);
		add(plus4);
		plus4.setEnabled(false);
		
		plus5 = new JButton("");
		plus5.setIcon(new ImageIcon("D:\\icon insert\\add.JPG"));
		plus5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[34] = Main.mount[34] + 1;
				textField_4.setText(""+Main.mount[34]);
			}
		});
		plus5.setBounds(600, 160, 25, 20);
		add(plus5);
		plus5.setEnabled(false);
		
		plus6 = new JButton("");
		plus6.setIcon(new ImageIcon("D:\\icon insert\\add.JPG"));
		plus6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[35] = Main.mount[35] + 1;
				textField_5.setText(""+Main.mount[35]);
			}
		});
		plus6.setBounds(40, 320, 25, 20);
		add(plus6);
		plus6.setEnabled(false);
		
		plus7 = new JButton("");
		plus7.setIcon(new ImageIcon("D:\\icon insert\\add.JPG"));
		plus7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[36] = Main.mount[36] + 1;
				textField_6.setText(""+Main.mount[36]);
			}
		});
		plus7.setBounds(180, 320, 25, 20);
		add(plus7);
		plus7.setEnabled(false);
		
		
		// @@@@@@@@@@@@@@@@ »©±â•û±â
		
		
		
		min = new JButton("");
		min.setIcon(new ImageIcon("D:\\icon insert\\sub.JPG"));
		min.setEnabled(false);
		min.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[30] > 0){
					Main.mount[30] = Main.mount[30] -1;
					textField.setText(""+Main.mount[30]);
					min.setEnabled(true);
				}
				if(Main.mount[30] < 0){
					min.setEnabled(false);
				}
			}
		});
		min.setBounds(115, 160, 25, 20);
		add(min);
		
		min2 = new JButton("");
		min2.setIcon(new ImageIcon("D:\\icon insert\\sub.JPG"));
		min2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[31] > 0){
					Main.mount[31] = Main.mount[31] -1;
					textField_1.setText(""+Main.mount[31]);
					min.setEnabled(true);
				}
				if(Main.mount[31] < 0){
					min.setEnabled(false);
				}
			}
		});
		min2.setBounds(255, 160, 25, 20);
		add(min2);
		min2.setEnabled(false);
		
		min3 = new JButton("");
		min3.setIcon(new ImageIcon("D:\\icon insert\\sub.JPG"));
		min3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[32] > 0){
					Main.mount[32] = Main.mount[32] -1;
					textField_2.setText(""+Main.mount[32]);
					min.setEnabled(true);
				}
				if(Main.mount[32] < 0){
					min.setEnabled(false);
				}
			}
		});
		min3.setBounds(395, 160, 25, 20);
		add(min3);
		min3.setEnabled(false);
		
		min4 = new JButton("");
		min4.setIcon(new ImageIcon("D:\\icon insert\\sub.JPG"));
		min4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[33] > 0){
					Main.mount[33] = Main.mount[23] -1;
					textField_3.setText(""+Main.mount[33]);
					min.setEnabled(true);
				}
				if(Main.mount[33] < 0){
					min.setEnabled(false);
				}
			}
		});
		min4.setEnabled(false);
		min4.setBounds(535, 159, 25, 20);
		add(min4);
		
		min5 = new JButton("");
		min5.setIcon(new ImageIcon("D:\\icon insert\\sub.JPG"));
		min5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[34] > 0){
					Main.mount[34] = Main.mount[34] -1;
					textField_4.setText(""+Main.mount[34]);
					min.setEnabled(true);
				}
				if(Main.mount[34] < 0){
					min.setEnabled(false);
				}
			}
		});
		min5.setBounds(675, 160, 25, 20);
		add(min5);
		min5.setEnabled(false);
		
		min6 = new JButton("");
		min6.setIcon(new ImageIcon("D:\\icon insert\\sub.JPG"));
		min6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[35] > 0){
					Main.mount[35] = Main.mount[35] -1;
					textField_5.setText(""+Main.mount[35]);
					min.setEnabled(true);
				}
				if(Main.mount[35] < 0){
					min.setEnabled(false);
				}
			}
		});
		min6.setBounds(115, 320, 25, 20);
		add(min6);
		min6.setEnabled(false);
		
		min7 = new JButton("");
		min7.setIcon(new ImageIcon("D:\\icon insert\\sub.JPG"));
		min7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[36] > 0){
					Main.mount[36] = Main.mount[36] -1;
					textField_6.setText(""+Main.mount[36]);
					min.setEnabled(true);
				}
				if(Main.mount[36] < 0){
					min.setEnabled(false);
				}
			}
		});
		min7.setBounds(255, 320, 25, 20);
		add(min7);
		min7.setEnabled(false);
		
		lblm = new JLabel("     \uD3A9\uC2DC\uCF5C\uB77C(M)");
		lblm.setFont(new Font("±¼¸²", Font.PLAIN, 11));
		lblm.setBounds(40, 190, 100, 15);
		add(lblm);
		
		lblm_1 = new JLabel("      \uC0AC\uC774\uB2E4(M)");
		lblm_1.setFont(new Font("±¼¸²", Font.PLAIN, 11));
		lblm_1.setBounds(180, 190, 100, 15);
		add(lblm_1);
		
		lblNbb_1 = new JLabel("\uD658\uD0C0\uC624\uB80C\uC9C0(M)");
		lblNbb_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNbb_1.setFont(new Font("±¼¸²", Font.PLAIN, 11));
		lblNbb_1.setBounds(320, 190, 100, 15);
		add(lblNbb_1);
		
		lblN_1 = new JLabel("     \uD3A9\uC2DC\uB9E5\uC2A4(M)");
		lblN_1.setFont(new Font("±¼¸²", Font.PLAIN, 11));
		lblN_1.setBounds(460, 190, 100, 15);
		add(lblN_1);
		
		lblN_2 = new JLabel("    \uC624\uB80C\uC9C0\uC8FC\uC2A4(M)");
		lblN_2.setFont(new Font("±¼¸²", Font.PLAIN, 11));
		lblN_2.setBounds(600, 190, 100, 15);
		add(lblN_2);
		
		lblN_3 = new JLabel("  \uC544\uBA54\uB9AC\uCE74\uB178(Hot)");
		lblN_3.setFont(new Font("±¼¸²", Font.PLAIN, 11));
		lblN_3.setBounds(40, 345, 100, 15);
		add(lblN_3);
		
		lblN_4 = new JLabel("  \uC544\uBA54\uB9AC\uCE74\uB178(Iced)");
		lblN_4.setFont(new Font("±¼¸²", Font.PLAIN, 11));
		lblN_4.setBounds(180, 345, 100, 15);
		add(lblN_4);
		
	}
	public void Clear(){
		for(int i = 30; i < Main.menu.length; i++){
			Main.mount[i] = 0;
		}
		textField.setText(""+Main.mount[30]);
		textField_1.setText(""+Main.mount[31]);
		textField_2.setText(""+Main.mount[32]);
		textField_3.setText(""+Main.mount[33]);
		textField_4.setText(""+Main.mount[34]);
		textField_5.setText(""+Main.mount[35]);
		textField_6.setText(""+Main.mount[36]);
		
		plus.setEnabled(false);
		plus2.setEnabled(false);
		plus3.setEnabled(false);
		plus4.setEnabled(false);
		plus5.setEnabled(false);
		plus6.setEnabled(false);
		plus7.setEnabled(false);
				
		min.setEnabled(false);
		min2.setEnabled(false);
		min3.setEnabled(false);
		min4.setEnabled(false);
		min5.setEnabled(false);
		min6.setEnabled(false);
		min7.setEnabled(false);
		
	}

}
