package day24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConprog {
	public static void main(String[] args) {
		String jdbc_url = "jdbc:mysql://localhost:3306/my_database?userUnicode=true"
				+"&characterEncoding=UTF8&serverTimezone=Asia/Seoul"; /*serverTimezone=UTC 서버시간 Asia/Seoul로 지정*/
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //6.0버전 이후
			conn = DriverManager.getConnection(jdbc_url,"root","yt1234");
			System.out.println("my_database 데이터베이스에 접속했습니다.");
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
					// TODO 자동 생성된 catch 블록
					e.printStackTrace();
				}
		}
		
	}

}
