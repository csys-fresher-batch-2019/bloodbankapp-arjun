package com.chainsys.bloodapp.dao;

import com.chainsys.bloodapp.model.DonarDetailsIncludingState;
import com.chainsys.bloodapp.model.DonarsDetails;

public interface DonarDao {

	public boolean updateCity(String city,int userId);
	
	public boolean updateDonarStatus(boolean active,int userId);
	
	public int getCountInState(String state);
	
	public DonarsDetails findByBloodGroup(String bloodGroup);
	
	public DonarDetailsIncludingState findByStateDonarList(String bloodGroup,String state);
	
	//public DonarDetailsIncludingState 
}
