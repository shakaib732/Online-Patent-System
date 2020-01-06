package com.globsyn.bean;

public class Request {
	private int rid;
	private Client client;
	private String r_desc;
	private String r_date;
	private String r_status;
	private String r_file;
	
	public Request(int rid, Client client, String r_desc, String r_date, String r_status, String r_file) {
		super();
		this.rid = rid;
		this.client = client;
		this.r_desc = r_desc;
		this.r_date = r_date;
		this.r_status = r_status;
		this.r_file = r_file;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public String getR_desc() {
		return r_desc;
	}
	public void setR_desc(String r_desc) {
		this.r_desc = r_desc;
	}
	public String getR_date() {
		return r_date;
	}
	public void setR_date(String r_date) {
		this.r_date = r_date;
	}
	public String getR_status() {
		return r_status;
	}
	public void setR_status(String r_status) {
		this.r_status = r_status;
	}
	public String getR_file() {
		return r_file;
	}
	public void setR_file(String r_file) {
		this.r_file = r_file;
	}
	
	
}
