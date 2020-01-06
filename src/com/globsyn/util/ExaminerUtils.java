package com.globsyn.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.globsyn.bean.Examiner;

public class ExaminerUtils {
	
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	public boolean addClient(Examiner examiner){
		boolean inserted = false;
		try{
			conn = DBUtils.getConnection("mydb");
			
			String sql = "insert into examiner (name,code,password,role,email) values (?,?,?,?,?)";
			
			pst = DBUtils.getPreparedStatement(sql);
			
			//pst.setInt(1, student.getSid());
			pst.setString(1, examiner.getName());
			pst.setString(2, examiner.getCode());
			pst.setString(3, examiner.getPassword());
			pst.setString(4, examiner.getRole());
			pst.setString(5, examiner.getEmail());
			
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
	
	public Examiner getClient(int eid){
		Examiner ex = null;
		
		conn = DBUtils.getConnection("mydb");
		
		String sql = "select * from client where sid="+eid;
		
		stmt = DBUtils.getSimpleStatement();
		
		try{
			rs = stmt.executeQuery(sql);
			
			if(rs != null){
				while(rs.next()){
					ex = new Examiner(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
					//studentList.add(st);
				}
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		DBUtils.closeResources();
		
		return ex;
	}
	
	
	
}
