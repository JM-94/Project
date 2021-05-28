package Create;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;

public class Select {
	
	public void select(String name){
	//a = 주문량
	//b = 메뉴 코드
		Connection conn = null;
		PreparedStatement pstmt = null;
		// try 구문안에 있는 내용을 실행하다가 에러가 발생하면 catch로 빠진다
		try {
			// 연결
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1234");
			System.out.println("DB 연결 성공");
			pstmt = conn.prepareStatement(
							"Select * form no_"+name+""
									);
			pstmt.executeUpdate();
			System.out.println("여기");
		} catch (Exception e) {
			e.printStackTrace();
			// 연결 실패시
			System.out.println("에러");
		} finally {
			try {
				// 연결 후 종료
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
