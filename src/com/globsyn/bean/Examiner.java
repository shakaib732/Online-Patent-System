package com.globsyn.bean;

public class Examiner {
	private int eid;
	private String name;
	private String code;
	private String password;
	private String role;
	private String email;
		
	
	public Examiner(int eid, String name, String code, String password, String role, String email) {
		super();
		this.eid = eid;
		this.name = name;
		this.code = code;
		this.password = password;
		this.role = role;
		this.email = email;
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
