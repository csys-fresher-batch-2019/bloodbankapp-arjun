package com.chainsys.bloodapp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.chainsys.bloodapp.model.DonarDetailsIncludingState;

public class DonarDetailsIncludingStateRowMapper implements RowMapper<DonarDetailsIncludingStateRowMapper> {

	public DonarDetailsIncludingStateRowMapper mapRow(ResultSet rs, int row) throws SQLException {
		
		DonarDetailsIncludingState stateDonarList=new DonarDetailsIncludingState();
		
		stateDonarList.setUserId(rs.getInt("user_id"));
		stateDonarList.setUserName(rs.getString("user_name"));
		//stateDonarList.setGender(rs.getChar("gender"));		//check
		stateDonarList.setDOB(rs.getDate("DOB").toLocalDate());
		stateDonarList.setAge(rs.getInt("age"));
		stateDonarList.setBloodGroup(rs.getString("blood_group"));
		stateDonarList.setActive(rs.getBoolean("active"));
		stateDonarList.setCity(rs.getString("city"));
		stateDonarList.setEmail(rs.getString("email"));
		stateDonarList.setMobileNumber(rs.getLong("mobile_number"));

		return stateDonarList;
	}

}
