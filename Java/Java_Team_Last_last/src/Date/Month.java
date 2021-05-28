package Date;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridBagLayout;
import java.awt.Window;

import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.jgoodies.forms.factories.DefaultComponentFactory;

class year2check{
	year2check(String sa){
		int s = Integer.parseInt(sa);
		if((s%4)==0){
			Daily29 frame1 = new Daily29(sa,"02","FEB");
		}
		else{
			Daily28 frame2 = new Daily28(sa,"02","FEB");
		}
	}
}

public class Month extends JFrame{
	public static String str;
	public Month() {
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		JPanel MPanel = new JPanel();
		MPanel.setBounds(0, 0, 680, 650);
		getContentPane().add(MPanel);
		MPanel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
		comboBox.addItem("2021");
		String value = comboBox.getSelectedItem().toString();
		comboBox.setEditable(true);
		comboBox.setBounds(557, 71, 74, 38);
		MPanel.add(comboBox);
				
		JButton btnNewButton = new JButton("JAN");
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Daily31 frame1 = new Daily31(value,"01","JAN");
				
			}
		});
		btnNewButton.setBounds(20, 118, 200, 100);
		MPanel.add(btnNewButton);
		
		JButton btnNewButton_02 = new JButton("FEB");
		btnNewButton_02.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
		btnNewButton_02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				year2check y = new year2check(value);
				
			}
		});
		btnNewButton_02.setBounds(240, 118, 200, 100);
		MPanel.add(btnNewButton_02);
		
		JButton btnNewButton_03 = new JButton("MAR");
		btnNewButton_03.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
		btnNewButton_03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Daily31 frame1 = new Daily31(value,"03","MAR");
				
			}
		});
		btnNewButton_03.setBounds(460, 118, 200, 100);
		MPanel.add(btnNewButton_03);
		
		JButton btnNewButton_04 = new JButton("APR");
		btnNewButton_04.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
		btnNewButton_04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Daily30 frame1 = new Daily30(value,"04","APR");
				
			}
		});
		btnNewButton_04.setBounds(20, 246, 200, 100);
		MPanel.add(btnNewButton_04);
			
		JButton btnNewButton_05 = new JButton("MAY");
		btnNewButton_05.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
		btnNewButton_05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Daily31 frame1 = new Daily31(value,"05","MAY");
				
			}
		});
		btnNewButton_05.setBounds(240, 246, 200, 100);
		MPanel.add(btnNewButton_05);
		
		JButton btnNewButton_06 = new JButton("JUN");
		btnNewButton_06.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
		btnNewButton_06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Daily30 frame1 = new Daily30(value,"06","JUN");
				
			}
		});
		btnNewButton_06.setBounds(460, 246, 200, 100);
		MPanel.add(btnNewButton_06);
		
		JButton btnNewButton_07 = new JButton("JUL");
		btnNewButton_07.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
		btnNewButton_07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Daily31 frame1 = new Daily31(value,"07","JUL");
				
			}
		});
		btnNewButton_07.setBounds(20, 375, 200, 100);
		MPanel.add(btnNewButton_07);
		
		JButton btnNewButton_08 = new JButton("AUG");
		btnNewButton_08.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
		btnNewButton_08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Daily31 frame1 = new Daily31(value,"08","AUG");
				
			}
		});
		btnNewButton_08.setBounds(240, 375, 200, 100);
		MPanel.add(btnNewButton_08);
		
		JButton btnNewButton_09 = new JButton("SEP");
		btnNewButton_09.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
		btnNewButton_09.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Daily30 frame1 = new Daily30(value,"09","SEP");
				
			}
		});
		btnNewButton_09.setBounds(460, 375, 200, 100);
		MPanel.add(btnNewButton_09);
		
		JButton btnNewButton_10 = new JButton("OCT");
		btnNewButton_10.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Daily31 frame1 = new Daily31(value,"10","OCT");
				
			}
		});
		btnNewButton_10.setBounds(20, 507, 200, 100);
		MPanel.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("NOV");
		btnNewButton_11.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Daily30 frame1 = new Daily30(value,"11","NOV");
				
			}
		});
		btnNewButton_11.setBounds(240, 507, 200, 100);
		MPanel.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("DEC");
		btnNewButton_12.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Daily31 frame1 = new Daily31(value,"12","DEC");
				
			}
		});
		btnNewButton_12.setBounds(460, 507, 200, 100);
		MPanel.add(btnNewButton_12);
		
		JLabel lblNewLabel = new JLabel("YEAR");
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 30));
		lblNewLabel.setBounds(460, 73, 89, 31);
		MPanel.add(lblNewLabel);		
		
		JLabel lblMonthly = DefaultComponentFactory.getInstance().createLabel("MONTHLY");
		lblMonthly.setFont(new Font("Sylfaen", Font.PLAIN, 39));
		lblMonthly.setBounds(182, 38, 220, 52);
		MPanel.add(lblMonthly);
		
		JButton btnNewButton_1 = new JButton("´Ý±â");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(284, 617, 97, 33);
		MPanel.add(btnNewButton_1);
		
		setSize(700, 700);
		setVisible(true);
		
		setSize(700, 700);
		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Month();
		System.out.println();
	}
}
