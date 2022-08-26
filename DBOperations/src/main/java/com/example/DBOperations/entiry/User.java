package com.example.DBOperations.entiry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private Integer id;
	@Column(unique = true)
	private String userName;
	private String userAdress;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAdress() {
		return userAdress;
	}
	public void setUserAdress(String userAdress) {
		this.userAdress = userAdress;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userAdress=" + userAdress + "]";
	}
	

}
