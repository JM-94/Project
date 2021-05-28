package Start;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import Create.*;
import Date.Month;
import Order.Main;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class login extends JFrame {
	Select s = new Select();
	Create c = new Create();
	Insert in = new Insert();
	private JPasswordField txtPass;
	public login() {
		getContentPane().setLayout(null);
		
		txtPass = new JPasswordField();
		txtPass.setBounds(132, 59, 120, 25);
		getContentPane().add(txtPass);
		txtPass.setColumns(10);
		
		JButton logBtn = new JButton("영업시작");
		logBtn.addActionListener( new ActionListener() {            
			public void actionPerformed(ActionEvent e) {
				String pass = "1234";
				if (pass.equals(txtPass.getText())) {
					SimpleDateFormat date = new SimpleDateFormat("yyyyMMdd");
					Calendar time = Calendar.getInstance();
					String name = date.format(time.getTime());

					try {
						c.create(name);
					} catch (Exception e2) {
					} finally {
						try {
							for (int i = 0; i < Main.menu.length; i++) {
								// 코드 가격 메뉴 날짜
								in.insert(i, Main.price[i], Main.menu[i], name);
							}
						} catch (Exception e2) {

						}
					}
					new Main();
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, " 관리자 번호가 아닙니다. ");
				}
			}
		});
		
		JLabel label = new JLabel("관리자번호");
		label.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		label.setBounds(155, 23, 82, 25);
		getContentPane().add(label);
		logBtn.setBounds(34, 94, 90, 25);
		getContentPane().add(logBtn);
		
		JButton btnNewButton = new JButton("매출");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                String pass = "1234";
                if(pass.equals(txtPass.getText())) {                	
                    	new Month();
                        } else {
                        	
                            JOptionPane.showMessageDialog( null , " 관리자 번호가 아닙니다. ");
                        }
                }
		});
		btnNewButton.setBounds(144, 94, 90, 25);
		getContentPane().add(btnNewButton);
		
		JButton exit = new JButton("종료");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		exit.setBounds(254, 95, 90, 23);
		getContentPane().add(exit);		
		
		setVisible(true);		 
        setSize(400 , 200); 
        setLocationRelativeTo(null); 
        setResizable(false); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	public static void main(String[] args) {
		new login();	

	}
}
