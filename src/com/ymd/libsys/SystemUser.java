package com.ymd.libsys;

public class SystemUser {
	
	private String userName;
	
	private String password;
	
	private enum Role{Administrator, Librarian, Super;}
	
	private Role role;
	
	SystemUser(String userName, String password,Role role){
		this.userName = userName;
		this.password = password;
		this.role = role;
	}
	
	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
	

	public Role getRole() {
		return role;
	}

	public int login(String userName, String password) {
		
		this.userName = userName;
		this.password = password;
		
		return 0;
	}

}
