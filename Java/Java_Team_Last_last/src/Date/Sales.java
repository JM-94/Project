package Date;



import Create.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sales extends JDialog{
	private JTable table = new JTable();
	Connection conn = null;
	Connection conn2 = null;
	PreparedStatement ps = null;
	PreparedStatement ps2 = null;
	ResultSet rs = null; // 셀렉 출력
	ResultSet rs2 = null; // 셀렉 출력
	private JTable table_1;
	
	public Sales(String name){
		setSize(571,556);
		setLocation(100,500);
		getContentPane().setLayout(null);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"코드", "메뉴", "가격", "수량", "합계"
			}
		));
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(14, 69, 525, 395);
		getContentPane().add(scrollPane);
//		new Ex01();
		
		table.setBounds(0, 0, 1, 1);
		
		
		
		



		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1234");
			ps = conn.prepareStatement("select * from no_" + name + " where amount not in(0) order by amount desc");
			

			rs = ps.executeQuery();
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.setNumRows(0);
			String str[] = new String[5];
			while (rs.next()) {
				str[0]=rs.getString(1);
				str[1]=rs.getString(2);
				str[2]=rs.getString(3);
				str[3]=rs.getString(4);
				str[4]=rs.getString(5);
				model = (DefaultTableModel) table.getModel();
				model.addRow(str);
			}

		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (ps != null)
					ps.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {

			}
		}
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(14, 458, 525, 31);
		getContentPane().add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"", "", "", "", ""
			}
		));
		
		JButton btnNewButton_1 = new JButton("닫기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(228, 492, 97, 23);
		getContentPane().add(btnNewButton_1);
		
		
		JLabel lblNewLabel = new JLabel(name);
		lblNewLabel.setFont(new Font("Yu Mincho", Font.PLAIN, 22));
		lblNewLabel.setBounds(228, 27, 135, 18);
		getContentPane().add(lblNewLabel);
		DefaultTableModel model = (DefaultTableModel) table_1.getModel();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn2 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1234");
			ps2 = conn2.prepareStatement("SELECT to_char(ROUND(SUM(amount)),'999,999,999,999'), to_char(ROUND(SUM(sales)),'999,999,999,999') FROM no_" + name);
			
			
			

			rs2 = ps2.executeQuery();
			model.setNumRows(0);
			String str2[] = new String[5];
			while (rs2.next()) {
				str2[0]="총합계";
				str2[1]="";				
				str2[2]="";				
				str2[3]=rs2.getString(1);				
				str2[4]=rs2.getString(2);				
				model = (DefaultTableModel) table_1.getModel();
				model.addRow(str2);
			}

		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		} finally {
			try {
				if (rs2 != null)
					rs2.close();
				if (ps2 != null)
					ps2.close();
				if (conn2 != null)
					conn2.close();
			} catch (Exception e) {

			}
		}
		
		
		
		
//		getContentPane().add(table);
		setVisible(true);
		
	}
}
