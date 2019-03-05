package com.ymd.libsys;

public class SystemUser extends Person {
	
	private String userName;
	
	private String password;
	
	private enum Role{Administrator, Librarian, Super;}
	
	private Role role;
	
	SystemUser(String firstName, String lastName, String phoneNum, Address address,Role role){
		super(firstName, lastName, phoneNum, address);
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
