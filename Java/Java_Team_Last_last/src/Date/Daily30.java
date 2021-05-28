package Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;


public class Daily30 extends JFrame{
	private String year;
	private String month;
	private String input_month;
	public Daily30(String year, String month, String input_month) {
		this.year=year;
		this.month=month;
		this.input_month=input_month;
		
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month.str = year+month+"01";
				new Sales(Month.str);
			}
		});
		btnNewButton.setBounds(28, 99, 50, 50);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month.str =year+month+"02";
				new Sales(Month.str);
			}
		});
		btnNewButton_2.setBounds(90, 99, 50, 50);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("3");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month.str =year+month+"03";
				new Sales(Month.str);
			}
		});
		btnNewButton_3.setBounds(152, 99, 50, 50);
		getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month.str =year+month+"04";
				new Sales(Month.str);
			}
		});
		btnNewButton_4.setBounds(214, 99, 50, 50);
		getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month.str =year+month+"05";
				new Sales(Month.str);
			}
		});
		btnNewButton_5.setBounds(276, 99, 50, 50);
		getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month.str =year+month+"06";
				new Sales(Month.str);
			}
		});
		btnNewButton_6.setBounds(338, 99, 50, 50);
		getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month.str =year+month+"07";
				new Sales(Month.str);
			}
		});
		btnNewButton_7.setBounds(400, 99, 50, 50);
		getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month.str =year+month+"08";
				new Sales(Month.str);
			}
		});
		btnNewButton_8.setBounds(28, 159, 50, 50);
		getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month.str =year+month+"09";
				new Sales(Month.str);
			}
		});
		btnNewButton_9.setBounds(90, 159, 50, 50);
		getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("10");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month.str =year+month+"10";
				new Sales(Month.str);
			}
		});
		btnNewButton_10.setBounds(152, 159, 50, 50);
		getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("11");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month.str =year+month+"11";
				new Sales(Month.str);
			}
		});
		btnNewButton_11.setBounds(214, 159, 50, 50);
		getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("12");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month.str =year+month+"12";
				new Sales(Month.str);
			}
		});
		btnNewButton_12.setBounds(276, 159, 50, 50);
		getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("13");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month.str =year+month+"13";
				new Sales(Month.str);
			}
		});
		btnNewButton_13.setBounds(338, 159, 50, 50);
		getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("14");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month.str =year+month+"14";
				new Sales(Month.str);
			}
		});
		btnNewButton_14.setBounds(400, 159, 50, 50);
		getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("15");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month.str =year+month+"15";
				new Sales(Month.str);
			}
		});
		btnNewButton_15.setBounds(28, 219, 50, 50);
		getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("16");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month.str =year+month+"16";
				new Sales(Month.str);
			}
		});
		btnNewButton_16.setBounds(90, 219, 50, 50);
		getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("17");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month.str =year+month+"17";
				new Sales(Month.str);
			}
		});
		btnNewButton_17.setBounds(152, 219, 50, 50);
		getContentPane().add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("18");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month.str =year+month+"18";
				new Sales(Month.str);
			}
		});
		btnNewButton_18.setBounds(214, 219, 50, 50);
		getContentPane().add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("19");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month.str =year+month+"19";
				new Sales(Month.str);
			}
		});
		btnNewButton_19.setBounds(276, 219, 50, 50);
		getContentPane().add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("20");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month.str =year+month+"20";
				new Sales(Month.str);
			}
		});
		btnNewButton_20.setBounds(338, 219, 50, 50);
		getContentPane().add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("21");
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month.str =year+month+"21";
				new Sales(Month.str);
			}
		});
		btnNewButton_21.setBounds(400, 219, 50, 50);
		getContentPane().add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton("22");
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month.str =year+month+"22";
				new Sales(Month.str);
			}
		});
		btnNewButton_22.setBounds(28, 279, 50, 50);
		getContentPane().add(btnNewButton_22);
		
		JButton btnNewButton_23 = new JButton("23");
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month.str =year+month+"23";
				new Sales(Month.str);
			}
		});
		btnNewButton_23.setBounds(90, 279, 50, 50);
		getContentPane().add(btnNewButton_23);
		
		JButton btnNewButton_24 = new JButton("24");
		btnNewButton_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month.str =year+month+"24";
				new Sales(Month.str);
			}
		});
		btnNewButton_24.setBounds(152, 279, 50, 50);
		getContentPane().add(btnNewButton_24);
		
		JButton btnNewButton_25 = new JButton("25");
		btnNewButton_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month.str =year+month+"25";
				new Sales(Month.str);
			}
		});
		btnNewButton_25.setBounds(214, 279, 50, 50);
		getContentPane().add(btnNewButton_25);
		
		JButton btnNewButton_26 = new JButton("26");
		btnNewButton_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month.str =year+month+"26";
			}
		});
		btnNewButton_26.setBounds(276, 279, 50, 50);
		getContentPane().add(btnNewButton_26);
		
		JButton btnNewButton_27 = new JButton("27");
		btnNewButton_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month.str =year+month+"27";
				new Sales(Month.str);
			}
		});
		btnNewButton_27.setBounds(338, 279, 50, 50);
		getContentPane().add(btnNewButton_27);
		
		JButton btnNewButton_28 = new JButton("28");
		btnNewButton_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month.str =year+month+"28";
				new Sales(Month.str);
			}
		});
		btnNewButton_28.setBounds(400, 279, 50, 50);
		getContentPane().add(btnNewButton_28);
		
		JButton btnNewButton_29 = new JButton("29");
		btnNewButton_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month.str =year+month+"29";
				new Sales(Month.str);
			}
		});
		btnNewButton_29.setBounds(28, 339, 50, 50);
		getContentPane().add(btnNewButton_29);
		
		JButton btnNewButton_30 = new JButton("30");
		btnNewButton_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month.str =year+month+"30";
				new Sales(Month.str);
			}
		});
		btnNewButton_30.setBounds(90, 339, 50, 50);
		getContentPane().add(btnNewButton_30);
		
		JLabel lblNewLabel = new JLabel(input_month);
		lblNewLabel.setFont(new Font("Sitka Small", Font.PLAIN, 26));
		lblNewLabel.setBounds(224, 35, 117, 52);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("´Ý±â");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(186, 413, 97, 23);
		getContentPane().add(btnNewButton_1);
		
		
		setSize(500, 500);
		setVisible(true);
	}

}
