package com.globsyn.util;
import java.sql.*;

import com.globsyn.bean.Client;

public class ClientUtils {
	
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	public boolean addClient(Client client){
		boolean inserted = false;
		try{
			conn = DBUtils.getConnection("mydb");
			
			String sql = "insert into clients (cname,cemail,cpassword,cadharno,address,phone,dob) values (?,?,?,?,?,?,?)";
			
			pst = DBUtils.getPreparedStatement(sql);
			
			//pst.setInt(1, student.getSid());
			pst.setString(1, client.getCname());
			pst.setString(2, client.getCemail());
			pst.setString(3, client.getCpassword());
			pst.setString(4, client.getCadharno());
			pst.setString(5, client.getAddress());
			pst.setLong(6, client.getPhone());
			pst.setString(7, client.getDob());
			int r = pst.executeUpdate();
			
			if(r > 0){
				inserted = true;
			}
			
			DBUtils.closeResources();
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return inserted;
	}
	
	public Client getClient(int cid){
		Client cli = null;
		
		conn = DBUtils.getConnection("mydb");
		
		String sql = "select * from client where sid="+cid;
		
		stmt = DBUtils.getSimpleStatement();
		
		try{
			rs = stmt.executeQuery(sql);
			
			if(rs != null){
				while(rs.next()){
					cli = new Client(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getLong(7), rs.getString(8));
					//studentList.add(st);
				}
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		DBUtils.closeResources();
		
		return cli;
	}
	
	
	
}
