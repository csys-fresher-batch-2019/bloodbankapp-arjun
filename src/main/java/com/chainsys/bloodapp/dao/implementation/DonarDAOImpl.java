package com.chainsys.bloodapp.dao.implementation;

import org.springframework.jdbc.core.JdbcTemplate;

import com.chainsys.bloodapp.dao.DonarDao;
import com.chainsys.bloodapp.mapper.DonarDetailsIncludingStateRowMapper;
import com.chainsys.bloodapp.mapper.DonarsDetailsRowMapper;
import com.chainsys.bloodapp.model.DonarDetailsIncludingState;
import com.chainsys.bloodapp.model.DonarsDetails;
import com.chainsys.bloodapp.util.ConnectionTemplate;

public class DonarDAOImpl implements DonarDao {

	JdbcTemplate jdbcTemplate = ConnectionTemplate.getJdbcTemplate();
	public boolean updateCity(String city,int userId) {
	String sql="update donars_details set city=? where user_id=?";
	int row = jdbcTemplate.update(sql, city, userId);
	if (row == 1)
		return true;
	else
		return false;	
	}
	public boolean updateDonarStatus(boolean active, int userId) {
	String sql="update donars_details set active=? where user_id=?";
	int row = jdbcTemplate.update(sql, active, userId);
	if (row == 1)
		return true;
	else
		return false;	
	}
	public int getCountInState(String state) {
	String sql="select count(user_id) from donars_details where city in(select city from city_state_tracker where state_of_city=?) and active=1";
	int count = jdbcTemplate.queryForObject(sql, Integer.class,state);
	return count;
	}
	public DonarsDetails findByBloodGroup(String bloodGroup) {
		
		String sql="select * from donars_details where blood_group=?";
		DonarsDetails donar=new DonarsDetails();
		DonarsDetailsRowMapper rowMapper1=new DonarsDetailsRowMapper();
		donar= jdbcTemplate.queryForObject(sql, rowMapper1,bloodGroup);
		return donar;
	}
	public DonarDetailsIncludingState findByStateDonarList(String bloodGroup,String state) {
		
		String sql="select * from donars_details where blood_group=? and city in(select city from city_state_tracker where city_state_tracker.state_of_city=?)";
		DonarDetailsIncludingState stateDonarList=new DonarDetailsIncludingState();
		DonarDetailsIncludingStateRowMapper rowMapper1=new DonarDetailsIncludingStateRowMapper();
		stateDonarList= jdbcTemplate.queryForObject(sql, rowMapper1,bloodGroup,state); //check
		return stateDonarList;
		
	}
	
	}


