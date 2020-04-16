package day24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcProg2 {
	public static void main(String[] args) {
		String jdbc_url = "jdbc:mysql://localhost:3306/comeng?userUnicode=true"
				+"&characterEncoding=UTF8&serverTimezone=Asia/Seoul"; /*serverTimezone=UTC 서버시간 Asia/Seoul로 지정*/
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //6.0버전 이후
			System.out.println("comeng 데이터베이스에 접속했습니다.");
			System.out.println("<< 학생명단 >>");
			System.out.println("[학번]\t\t[이름]");
			String sql = "SELECT * FROM student WHERE sex=? && address=? && dept=?";
			conn = DriverManager.getConnection(jdbc_url,"root","yt1234"); //연결하고
			pstmt = conn.prepareStatement(sql); //스테이트먼트를 만들어서
			pstmt.setString(1, "F"); //첫번째 매개변수(위에선 1번 물음표)
			pstmt.setString(2, "seoul"); //두번째 매개변수(2번 물음표)
			pstmt.setInt(3, 2);
			rs = pstmt.executeQuery();
			//쿼리문 실행(SELECT * FROM student WHERE sex=F && address=seoul),
			//그 결과물(F이고 seoul인 튜플)들을 ResultSet에 저장
			while(rs.next()) { 
				int stuNo = rs.getInt("stuNo"); //결과물의 stuNo를 가져온다 
				String name = rs.getString("name");
				System.out.println(stuNo+ "\t"+name);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException: "+e.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally { //다 썼으니까 닫자고
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
