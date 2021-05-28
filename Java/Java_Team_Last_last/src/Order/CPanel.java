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

public class CPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JButton plus;
	private JButton plus2;
	private JButton plus3;
	private JButton plus4;
	private JButton plus5;
	private JButton plus6;
	private JButton plus7;
	private JButton plus8;
	private JButton plus9;
	private JButton plus10;
	private JButton min;
	private JButton min2;
	private JButton min3;
	private JButton min4;
	private JButton min5;
	private JButton min6;
	private JButton min7;
	private JButton min8;
	private JButton min9;
	private JButton min10;
	private JLabel lblN;
	private JLabel lblNbb;
	private JLabel lblNbb_2;
	private JLabel lblN_1;
	private JLabel lblN_2;
	private JLabel lblN_4;
	private JLabel lblN_4_1;
	private JLabel lblN_4_2;
	private JLabel lblN_4_3;
	private JLabel lblN_4_4;

	public CPanel() {
		setBackground(Color.ORANGE);
		setLayout(null);

		JButton menu1 = new JButton("");
		menu1.setIcon(new ImageIcon("D:\\icon insert\\20 \uB178\uCE58\uD0A8\uB108\uAC9F.JPG"));
		menu1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				plus.setEnabled(true);
				min.setEnabled(true);
				textField.setText(""+Main.mount[20]);
			}
		});
		menu1.setBounds(40, 60, 100, 100);
		add(menu1);
		
		JButton menu2 = new JButton("");
		menu2.setIcon(new ImageIcon("D:\\icon insert\\21 Onion.JPG"));
		menu2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				plus2.setEnabled(true);
				min2.setEnabled(true);
				textField_1.setText(""+Main.mount[21]);
			}
		});
		menu2.setBounds(180, 60, 100, 100);
		add(menu2);
		
		JButton menu3 = new JButton("");
		menu3.setIcon(new ImageIcon("D:\\icon insert\\22 nuggetchic.JPG"));
		menu3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				plus3.setEnabled(true);
				min3.setEnabled(true);
				textField_2.setText(""+Main.mount[22]);
			}
		});
		menu3.setBounds(320, 60, 100, 100);
		add(menu3);
		
		JButton menu4 = new JButton("");
		menu4.setIcon(new ImageIcon("D:\\icon insert\\23 24 FrenchFries.JPG"));
		menu4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				plus4.setEnabled(true);
				min4.setEnabled(true);
				textField_3.setText(""+Main.mount[23]);
			}
		});
		menu4.setBounds(460, 60, 100, 100);
		add(menu4);
		
		JButton menu5 = new JButton("");
		menu5.setIcon(new ImageIcon("D:\\icon insert\\23 24 FrenchFries.JPG"));
		menu5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				plus5.setEnabled(true);
				min5.setEnabled(true);
				textField_4.setText(""+Main.mount[24]);
			}
		});
		menu5.setBounds(600, 60, 100, 100);
		add(menu5);
		
		JButton menu6 = new JButton("");
		menu6.setIcon(new ImageIcon("D:\\icon insert\\25 Injeolmi.JPG"));
		menu6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				plus6.setEnabled(true);
				min6.setEnabled(true);
				textField_5.setText(""+Main.mount[25]);
			}
		});
		menu6.setBounds(40, 220, 100, 100);
		add(menu6);
		
		JButton menu7 = new JButton("");
		menu7.setIcon(new ImageIcon("D:\\icon insert\\26 Saladchic.JPG"));
		menu7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				plus7.setEnabled(true);
				min7.setEnabled(true);
				textField_6.setText(""+Main.mount[26]);
			}
		});
		menu7.setBounds(180, 220, 100, 100);
		add(menu7);
		
		JButton menu8 = new JButton("");
		menu8.setIcon(new ImageIcon("D:\\icon insert\\27 Saladgreen.JPG"));
		menu8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				plus8.setEnabled(true);
				min8.setEnabled(true);
				textField_7.setText(""+Main.mount[27]);
			}
		});
		menu8.setBounds(320, 220, 100, 100);
		add(menu8);
		
		JButton menu9 = new JButton("");
		menu9.setIcon(new ImageIcon("D:\\icon insert\\28 29 \uC0C1\uD558\uC774\uD551\uAC70\uD3EC\uD06C.JPG"));
		menu9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				plus9.setEnabled(true);
				min9.setEnabled(true);
				textField_8.setText(""+Main.mount[28]);
			}
		});
		menu9.setBounds(460, 220, 100, 100);
		add(menu9);
		
		JButton menu10 = new JButton("");
		menu10.setIcon(new ImageIcon("D:\\icon insert\\28 29 \uC0C1\uD558\uC774\uD551\uAC70\uD3EC\uD06C.JPG"));
		menu10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				plus10.setEnabled(true);
				min10.setEnabled(true);
				textField_9.setText(""+Main.mount[29]);
			}
		});
		menu10.setBounds(600, 220, 100, 100);
		add(menu10);
		
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
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setColumns(10);
		textField_7.setBounds(345, 320, 50, 20);
		add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setColumns(10);
		textField_8.setBounds(485, 320, 50, 20);
		add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setColumns(10);
		textField_9.setBounds(625, 320, 50, 20);
		add(textField_9);
		
		
		
		/// @@@@@@@@@@@@@@@@@ ¤½,¤©·¯½º
		
		
		
		plus = new JButton("");
		plus.setIcon(new ImageIcon("D:\\icon insert\\add.JPG"));
		plus.setEnabled(false);
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[20] = Main.mount[20] + 1;
				textField.setText(""+Main.mount[20]);
			}
		});
		plus.setBounds(40, 160, 25, 20);
		add(plus);
		
		plus2 = new JButton("");
		plus2.setIcon(new ImageIcon("D:\\icon insert\\add.JPG"));
		plus2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[21] = Main.mount[21] + 1;
				textField_1.setText(""+Main.mount[21]);
			}
		});
		plus2.setBounds(180, 160, 25, 20);
		add(plus2);
		plus2.setEnabled(false);
		
		plus3 = new JButton("");
		plus3.setIcon(new ImageIcon("D:\\icon insert\\add.JPG"));
		plus3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[22] = Main.mount[22] + 1;
				textField_2.setText(""+Main.mount[22]);
			}
		});
		plus3.setBounds(320, 160, 25, 20);
		add(plus3);
		plus3.setEnabled(false);
		
		plus4 = new JButton("");
		plus4.setIcon(new ImageIcon("D:\\icon insert\\add.JPG"));
		plus4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[23] = Main.mount[23] + 1;
				textField_3.setText(""+Main.mount[23]);
			}
		});
		plus4.setBounds(460, 160, 25, 20);
		add(plus4);
		plus4.setEnabled(false);
		
		plus5 = new JButton("");
		plus5.setIcon(new ImageIcon("D:\\icon insert\\add.JPG"));
		plus5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[24] = Main.mount[24] + 1;
				textField_4.setText(""+Main.mount[24]);
			}
		});
		plus5.setBounds(600, 160, 25, 20);
		add(plus5);
		plus5.setEnabled(false);
		
		plus6 = new JButton("");
		plus6.setIcon(new ImageIcon("D:\\icon insert\\add.JPG"));
		plus6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[25] = Main.mount[25] + 1;
				textField_5.setText(""+Main.mount[25]);
			}
		});
		plus6.setBounds(40, 320, 25, 20);
		add(plus6);
		plus6.setEnabled(false);
		
		plus7 = new JButton("");
		plus7.setIcon(new ImageIcon("D:\\icon insert\\add.JPG"));
		plus7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[26] = Main.mount[26] + 1;
				textField_6.setText(""+Main.mount[26]);
			}
		});
		plus7.setBounds(180, 320, 25, 20);
		add(plus7);
		plus7.setEnabled(false);
		
		plus8 = new JButton("");
		plus8.setIcon(new ImageIcon("D:\\icon insert\\add.JPG"));
		plus8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[27] = Main.mount[27] + 1;
				textField_7.setText(""+Main.mount[27]);
			}
		});
		plus8.setBounds(320, 320, 25, 20);
		add(plus8);
		plus8.setEnabled(false);
		
		plus9 = new JButton("");
		plus9.setIcon(new ImageIcon("D:\\icon insert\\add.JPG"));
		plus9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[28] = Main.mount[28] + 1;
				textField_8.setText(""+Main.mount[28]);
			}
		});
		plus9.setBounds(460, 320, 25, 20);
		add(plus9);
		plus9.setEnabled(false);
		
		plus10 = new JButton("");
		plus10.setIcon(new ImageIcon("D:\\icon insert\\add.JPG"));
		plus10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.mount[29] = Main.mount[29] + 1;
				textField_9.setText(""+Main.mount[29]);
			}
		});
		plus10.setBounds(600, 320, 25, 20);
		add(plus10);
		plus10.setEnabled(false);
		
		
		// @@@@@@@@@@@@@@@@ »©±â•û±â
		
		
		
		min = new JButton("");
		min.setIcon(new ImageIcon("D:\\icon insert\\sub.JPG"));
		min.setEnabled(false);
		min.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[20] > 0){
					Main.mount[20] = Main.mount[20] -1;
					textField.setText(""+Main.mount[20]);
					min.setEnabled(true);
				}
				if(Main.mount[20] < 0){
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
				if(Main.mount[21] > 0){
					Main.mount[21] = Main.mount[21] -1;
					textField_1.setText(""+Main.mount[21]);
					min.setEnabled(true);
				}
				if(Main.mount[21] < 0){
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
				if(Main.mount[22] > 0){
					Main.mount[22] = Main.mount[22] -1;
					textField_2.setText(""+Main.mount[22]);
					min.setEnabled(true);
				}
				if(Main.mount[22] < 0){
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
				if(Main.mount[23] > 0){
					Main.mount[23] = Main.mount[23] -1;
					textField_3.setText(""+Main.mount[23]);
					min.setEnabled(true);
				}
				if(Main.mount[23] < 0){
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
				if(Main.mount[24] > 0){
					Main.mount[24] = Main.mount[24] -1;
					textField_4.setText(""+Main.mount[24]);
					min.setEnabled(true);
				}
				if(Main.mount[24] < 0){
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
				if(Main.mount[25] > 0){
					Main.mount[25] = Main.mount[25] -1;
					textField_5.setText(""+Main.mount[25]);
					min.setEnabled(true);
				}
				if(Main.mount[25] < 0){
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
				if(Main.mount[26] > 0){
					Main.mount[26] = Main.mount[26] -1;
					textField_6.setText(""+Main.mount[26]);
					min.setEnabled(true);
				}
				if(Main.mount[26] < 0){
					min.setEnabled(false);
				}
			}
		});
		min7.setBounds(255, 320, 25, 20);
		add(min7);
		min7.setEnabled(false);
		
		min8 = new JButton("");
		min8.setIcon(new ImageIcon("D:\\icon insert\\sub.JPG"));
		min8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[27] > 0){
					Main.mount[27] = Main.mount[27] -1;
					textField_7.setText(""+Main.mount[27]);
					min.setEnabled(true);
				}
				if(Main.mount[27] < 0){
					min.setEnabled(false);
				}
			}
		});
		min8.setBounds(395, 320, 25, 20);
		add(min8);
		min8.setEnabled(false);
		
		min9 = new JButton("");
		min9.setIcon(new ImageIcon("D:\\icon insert\\sub.JPG"));
		min9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[28] > 0){
					Main.mount[28] = Main.mount[28] -1;
					textField_8.setText(""+Main.mount[28]);
					min.setEnabled(true);
				}
				if(Main.mount[28] < 0){
					min.setEnabled(false);
				}
			}
		});
		min9.setBounds(535, 320, 25, 20);
		add(min9);
		min9.setEnabled(false);
		
		min10 = new JButton("");
		min10.setIcon(new ImageIcon("D:\\icon insert\\sub.JPG"));
		min10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mount[29] > 0){
					Main.mount[29] = Main.mount[29] -1;
					textField_9.setText(""+Main.mount[29]);
					min.setEnabled(true);
				}
				if(Main.mount[29] < 0){
					min.setEnabled(false);
				}
			}
		});
		min10.setBounds(675, 320, 25, 20);
		add(min10);
		min10.setEnabled(false);
		
		lblN = new JLabel("\uB178\uCE58\uD0A8\uB108\uAC9F(4\uAC1C\uC785)");
		lblN.setFont(new Font("±¼¸²", Font.PLAIN, 11));
		lblN.setBounds(40, 190, 100, 15);
		add(lblN);
		
		lblNbb = new JLabel("\uC5B4\uB2C8\uC5B8\uB3C4\uB11B(6\uAC1C\uC785)");
		lblNbb.setFont(new Font("±¼¸²", Font.PLAIN, 11));
		lblNbb.setBounds(180, 190, 100, 15);
		add(lblNbb);
		
		lblNbb_2 = new JLabel("NBB\uCE58\uD0A8\uB108\uAC9F(5\uAC1C\uC785)");
		lblNbb_2.setFont(new Font("±¼¸²", Font.PLAIN, 11));
		lblNbb_2.setBounds(320, 190, 110, 15);
		add(lblNbb_2);
		
		lblN_1 = new JLabel("     \uAC10\uC790\uD280\uAE40(M)");
		lblN_1.setFont(new Font("±¼¸²", Font.PLAIN, 11));
		lblN_1.setBounds(460, 190, 100, 15);
		add(lblN_1);
		
		lblN_2 = new JLabel("     \uAC10\uC790\uD280\uAE40(L)");
		lblN_2.setFont(new Font("±¼¸²", Font.PLAIN, 11));
		lblN_2.setBounds(600, 190, 100, 15);
		add(lblN_2);
		
		lblN_4 = new JLabel("\uC778\uC808\uBBF8\uCE58\uC988\uBCFC(3\uAC1C\uC785)");
		lblN_4.setFont(new Font("±¼¸²", Font.PLAIN, 11));
		lblN_4.setBounds(40, 345, 110, 15);
		add(lblN_4);
		
		lblN_4_1 = new JLabel("   \uCE58\uD0A8\uC2DC\uC800\uC0D0\uB7EC\uB4DC");
		lblN_4_1.setFont(new Font("±¼¸²", Font.PLAIN, 11));
		lblN_4_1.setBounds(180, 345, 100, 15);
		add(lblN_4_1);
		
		lblN_4_2 = new JLabel("      \uADF8\uB9B0\uC0D0\uB7EC\uB4DC");
		lblN_4_2.setFont(new Font("±¼¸²", Font.PLAIN, 11));
		lblN_4_2.setBounds(320, 345, 100, 15);
		add(lblN_4_2);
		
		lblN_4_3 = new JLabel(" \uC0C1\uD558\uC774\uD551\uAC70\uD3EC\uD06C(L)");
		lblN_4_3.setFont(new Font("±¼¸²", Font.PLAIN, 11));
		lblN_4_3.setBounds(460, 345, 100, 15);
		add(lblN_4_3);
		
		lblN_4_4 = new JLabel(" \uC0C1\uD558\uC774\uD551\uAC70\uD3EC\uD06C(S)");
		lblN_4_4.setFont(new Font("±¼¸²", Font.PLAIN, 11));
		lblN_4_4.setBounds(600, 345, 100, 15);
		add(lblN_4_4);
		
	}
	public void Clear(){
		for(int i = 20; i < 30; i++){
			Main.mount[i] = 0;
		}
		textField.setText(""+Main.mount[20]);
		textField_1.setText(""+Main.mount[21]);
		textField_2.setText(""+Main.mount[22]);
		textField_3.setText(""+Main.mount[23]);
		textField_4.setText(""+Main.mount[23]);
		textField_5.setText(""+Main.mount[25]);
		textField_6.setText(""+Main.mount[26]);
		textField_7.setText(""+Main.mount[27]);
		textField_8.setText(""+Main.mount[28]);
		textField_9.setText(""+Main.mount[29]);
		
		plus.setEnabled(false);
		plus2.setEnabled(false);
		plus3.setEnabled(false);
		plus4.setEnabled(false);
		plus5.setEnabled(false);
		plus6.setEnabled(false);
		plus7.setEnabled(false);
		plus8.setEnabled(false);
		plus9.setEnabled(false);
		plus10.setEnabled(false);
		
		min.setEnabled(false);
		min2.setEnabled(false);
		min3.setEnabled(false);
		min4.setEnabled(false);
		min5.setEnabled(false);
		min6.setEnabled(false);
		min7.setEnabled(false);
		min8.setEnabled(false);
		min9.setEnabled(false);
		min10.setEnabled(false);
	}

}
