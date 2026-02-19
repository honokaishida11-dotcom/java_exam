package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Member;

@Repository
public class MemberRepository {

	@Autowired
	private NamedParameterJdbcTemplate template;

	//問題２　RowMapperの実装
	private static final RowMapper<Member> MEMBER_ROW_MAPPER = (rs, i) -> {

		
		Member member = new Member();

		member.setId(rs.getInt("id"));
		member.setName(rs.getString("name"));
		member.setAge(rs.getInt("age"));
		
		member.setDepId(rs.getInt("dep_id"));

		return member;
		 
		
		//return null;
	};

	//問題３　findAllメソッドの作成
	public List<Member> findAll() {
		//String sql = "ここにSQL文を書く";

		
		String sql = "SELECT id, name, age, dep_id FROM test_members ORDER BY age";

		
		List<Member> memberList = template.query(sql, MEMBER_ROW_MAPPER);

		return memberList; 

		//♪List<Member> memberList = null; // ←ここに実行の処理を書く

		//return memberList;
	}

	//問題４　loadメソッドの作成
	public Member load(Integer id) {
		//♪String sql = "ここにSQL文を書く";

		
		String sql = "SELECT id, name, age, dep_id FROM test_members WHERE id = :id";

		
		org.springframework.jdbc.core.namedparam.SqlParameterSource param =
				new org.springframework.jdbc.core.namedparam.MapSqlParameterSource().addValue("id", id);

		
		Member member = template.queryForObject(sql, param, MEMBER_ROW_MAPPER);

		return member;

		//SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);

		//Member member = null; // ←ここに実行処理を書く

		//return member;
	}


	public Member save(Member member) {
		//SqlParameterSource param = new BeanPropertySqlParameterSource(member);

		//if (member == null) { // ←正しい条件に修正する
			//String insertSql = "ここにSQL文を書く";

			// ここに実行処理を書く

		//} else {
			//String updateSql = "ここにSQL文を書く";

			// ここに実行処理を書く
		//}

		//return member;

		//問題６　MemberRepositoryメソッド定義↓
		SqlParameterSource param = new BeanPropertySqlParameterSource(member);

		if (member.getId() == null) {

			String insertSql1 = "INSERT INTO test_members(name, age, dep_id) "
					+ "VALUES(:name, :age, :depId)";

			
			template.update(insertSql1, param);

		} else {

			String updateSql1 = "UPDATE test_members "
					+ "SET name = :name, age = :age, dep_id = :depId "
					+ "WHERE id = :id";

			template.update(updateSql1, param);
		}

		return member;
		
	}

}
