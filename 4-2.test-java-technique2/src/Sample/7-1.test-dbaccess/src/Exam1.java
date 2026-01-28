import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exam1 {

   public static void main(String[] args) {
    
    String url = "jdbc:postgresql://localhost:5432/student";
	String user = "postgres";
	String password = "Hnk19980718";

    Connection con = null; // 使用する変数の宣言
	PreparedStatement pstmt = null;
	String sql = null;

    try {
			// (1)データベースに接続
			con = DriverManager.getConnection(url,user,password);

			// (2)SQL文を作成
			sql = "INSERT INTO test_deps(name,age) VALUES('山田太郎',62);";
            sql = "INSERT INTO test_deps(name,age) VALUES('佐藤花子',33);";
            sql = "INSERT INTO test_deps(name,age) VALUES('遠藤次郎',55);";

			// (3)SQL実行準備
			pstmt = con.prepareStatement(sql);

			// (4)SQL実行
			// ※ここにSQL実行処理を書く   
			int numOfupdate = pstmt.executeUpdate();                                              

			// (5)結果の操作
			// ※ここに結果の操作処理を書く
			System.out.println(numOfupdate + "件のデータを操作しました");
		
		} catch (SQLException ex) {
			System.err.println("SQL = " + sql);
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
