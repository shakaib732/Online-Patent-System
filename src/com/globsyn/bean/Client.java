package com.globsyn.bean;

public class Client {
	private int cid;
	private String cname;
	private String cemail;
	private String cpassword;
	private String cadharno;
	private String address;
	private long phone;
	
	public Client(int cid, String cname, String cemail, String cpassword, String cadharno, String address, long phone,
			String dob) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cemail = cemail;
		this.cpassword = cpassword;
		this.cadharno = cadharno;
		this.address = address;
		this.phone = phone;
		this.dob = dob;
	}
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public String getCadharno() {
		return cadharno;
	}
	public void setCadharno(String cadharno) {
		this.cadharno = cadharno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	private String dob;
}
