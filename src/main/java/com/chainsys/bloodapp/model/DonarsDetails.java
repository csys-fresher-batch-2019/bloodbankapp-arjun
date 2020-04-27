package com.chainsys.bloodapp.model;

import java.time.LocalDate;

public class DonarsDetails {
	private int userId;
	private String userName;
	private char gender;
	private LocalDate DOB;
	private int age;
	private String bloodGroup;
	private boolean active;
	private String city;
	private String email;
	private long mobileNumber;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public LocalDate getDOB() {
		return DOB;
	}
	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DOB == null) ? 0 : DOB.hashCode());
		result = prime * result + (active ? 1231 : 1237);
		result = prime * result + age;
		result = prime * result + ((bloodGroup == null) ? 0 : bloodGroup.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + gender;
		result = prime * result + (int) (mobileNumber ^ (mobileNumber >>> 32));
		result = prime * result + userId;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DonarsDetails other = (DonarsDetails) obj;
		if (DOB == null) {
			if (other.DOB != null)
				return false;
		} else if (!DOB.equals(other.DOB))
			return false;
		if (active != other.active)
			return false;
		if (age != other.age)
			return false;
		if (bloodGroup == null) {
			if (other.bloodGroup != null)
				return false;
		} else if (!bloodGroup.equals(other.bloodGroup))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (gender != other.gender)
			return false;
		if (mobileNumber != other.mobileNumber)
			return false;
		if (userId != other.userId)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "DonarsDetails [userId=" + userId + ", userName=" + userName + ", gender=" + gender + ", DOB=" + DOB
				+ ", age=" + age + ", bloodGroup=" + bloodGroup + ", active=" + active + ", city=" + city + ", email="
				+ email + ", mobileNumber=" + mobileNumber + "]";
	}

	

}

/*
 * create table donars_details( user_id number, user_name varchar2(35) not null,
 * gender CHAR(1) not null, DOB date not null, age number not null, blood_group
 * varchar2(10), active number default 1, city varchar2(30) not null, email
 * varchar2(30) unique not null, mobile_number number unique not null,
 * constraint gender_ch check(gender in('M','F')), constraint age_ce
 * check(age>=18), constraint blood_group_cc check(blood_group
 * in('A+ve','A-ve','B+ve','B-ve','AB+ve','AB-ve','O+ve','O-ve')), constraint
 * city_fk foreign key(city) references city_state_tracker(city) );
 */