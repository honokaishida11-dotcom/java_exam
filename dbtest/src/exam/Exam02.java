package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exam02 {

    public static void main(String[] args) {
		// 接続情報
		String url = "jdbc:postgresql://localhost:5432/student";
		String user = "postgres";
		String password = "Hnk19980718";
		Connection con = null; // 使用する変数の宣言
		PreparedStatement pstmt = null;
        ResultSet rs = null;
		String sql = null;

		try {
			// (1)データベースに接続
			con = DriverManager.getConnection(url,user,password);

			// (2)SQL文を作成
			sql = "SELECT * FROM test_members WHERE dep_id = 2;";
			

			// (3)SQL実行準備
			pstmt = con.prepareStatement(sql);

			// (4)SQL実行
			  rs = pstmt.executeQuery();

			// (5)結果の操作
			while(rs.next()){
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
                int dep_id = rs.getInt("dep_id");
				System.out.println("id：" + id);
				System.out.println("name：" + name);
				System.out.println("age：" + age);
                System.out.println("dep_id:" + dep_id);
				//System.out.println();
			}

		} catch (SQLException ex) {
			System.out.println("SQL = " + sql);
			ex.printStackTrace();
		} finally {
			try {
				if(con != null){
				con.close();
                }
                if(pstmt != null){
                    pstmt.close();
                }
			} catch (SQLException ex) {
                ex.printStackTrace();
            }
		}
	
	}



    

}
