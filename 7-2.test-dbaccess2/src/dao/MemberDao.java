package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DBManager;
import dto.Member;

public class MemberDao {

    /**
     * 全件検索
     */
    public List<Member> findAll() {
        Connection con = DBManager.createConnection();
        String sql = "SELECT id, name, age, dep_id FROM test_members";

        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            List<Member> list = new ArrayList<>();

            while (rs.next()) {
                Member m = new Member();
                m.setId(rs.getInt("id"));
                m.setName(rs.getString("name"));
                m.setAge(rs.getInt("age"));
                m.setDepId(rs.getInt("dep_id"));
                list.add(m);
            }
            return list;

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("全件検索処理に失敗しました", e);
        } finally {
            DBManager.closeConnection(con);
        }
    }

    /**
     * 主キー検索
     */
    public Member load(int id) {
        Connection con = DBManager.createConnection();
        String sql = "SELECT id, name, age, dep_id FROM test_members WHERE id = ?";

        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, id);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return new Member(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("age"),
                    rs.getInt("dep_id")
                );
            }
            return null;

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("主キー検索処理に失敗しました", e);
        } finally {
            DBManager.closeConnection(con);
        }
    }

    /**
     * 登録
     */
    public void insert(Member member) {
        Connection con = DBManager.createConnection();
        String sql = "INSERT INTO test_members(name, age, dep_id) VALUES(?, ?, ?)";

        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, member.getName());
            pstmt.setInt(2, member.getAge());
            pstmt.setInt(3, member.getDepId());

            pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("登録処理に失敗しました", e);
        } finally {
            DBManager.closeConnection(con);
        }
    }
}
