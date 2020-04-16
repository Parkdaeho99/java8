package day24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConprog {
	public static void main(String[] args) {
		String jdbc_url = "jdbc:mysql://localhost:3306/my_database?userUnicode=true"
				+"&characterEncoding=UTF8&serverTimezone=Asia/Seoul"; /*serverTimezone=UTC �����ð� Asia/Seoul�� ����*/
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //6.0���� ����
			conn = DriverManager.getConnection(jdbc_url,"root","yt1234");
			System.out.println("my_database �����ͺ��̽��� �����߽��ϴ�.");
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException: "+e.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
				try {
					if( conn != null )
						conn.close();
				} catch (SQLException e) {
					// TODO �ڵ� ������ catch ���
					e.printStackTrace();
				}
		}
		
	}

}
