package day24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcProg2 {
	public static void main(String[] args) {
		String jdbc_url = "jdbc:mysql://localhost:3306/comeng?userUnicode=true"
				+"&characterEncoding=UTF8&serverTimezone=Asia/Seoul"; /*serverTimezone=UTC �����ð� Asia/Seoul�� ����*/
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //6.0���� ����
			System.out.println("comeng �����ͺ��̽��� �����߽��ϴ�.");
			System.out.println("<< �л���� >>");
			System.out.println("[�й�]\t\t[�̸�]");
			String sql = "SELECT * FROM student WHERE sex=? && address=? && dept=?";
			conn = DriverManager.getConnection(jdbc_url,"root","yt1234"); //�����ϰ�
			pstmt = conn.prepareStatement(sql); //������Ʈ��Ʈ�� ����
			pstmt.setString(1, "F"); //ù��° �Ű�����(������ 1�� ����ǥ)
			pstmt.setString(2, "seoul"); //�ι�° �Ű�����(2�� ����ǥ)
			pstmt.setInt(3, 2);
			rs = pstmt.executeQuery();
			//������ ����(SELECT * FROM student WHERE sex=F && address=seoul),
			//�� �����(F�̰� seoul�� Ʃ��)���� ResultSet�� ����
			while(rs.next()) { 
				int stuNo = rs.getInt("stuNo"); //������� stuNo�� �����´� 
				String name = rs.getString("name");
				System.out.println(stuNo+ "\t"+name);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException: "+e.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally { //�� �����ϱ� ���ڰ�
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
