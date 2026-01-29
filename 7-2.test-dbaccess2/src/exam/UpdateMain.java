package exam;

import common.DBManager;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateMain {
    public static void main(String[] args) {

        Connection con = DBManager.createConnection();
        String sql = "UPDATE test_members SET name = ?, age = ?, dep_id = ? WHERE id = ?";

        try {
            

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBManager.closeConnection(con);
        }

        
    }
}
