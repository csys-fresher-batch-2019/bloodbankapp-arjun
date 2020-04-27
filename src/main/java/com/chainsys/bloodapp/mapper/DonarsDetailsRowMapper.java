package com.chainsys.bloodapp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.chainsys.bloodapp.model.DonarsDetails;

public class DonarsDetailsRowMapper implements RowMapper<DonarsDetails> {

	public DonarsDetails mapRow(ResultSet rs, int row) throws SQLException {
		
		DonarsDetails donar=new DonarsDetails();
		
		donar.setUserId(rs.getInt("user_id"));
		donar.setUserName(rs.getString("user_name"));
		//donar.setGender(rs.getChar("gender"));		//check
		donar.setDOB(rs.getDate("DOB").toLocalDate());
		donar.setAge(rs.getInt("age"));
		donar.setBloodGroup(rs.getString("blood_group"));
		donar.setActive(rs.getBoolean("active"));
		donar.setCity(rs.getString("city"));
		donar.setEmail(rs.getString("email"));
		donar.setMobileNumber(rs.getLong("mobile_number"));
		
		return donar;
	}

}
