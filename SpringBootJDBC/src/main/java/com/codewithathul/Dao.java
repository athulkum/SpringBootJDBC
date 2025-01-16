package com.codewithathul;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository
public class Dao {

	public String insertIPLTeam(IPLTeams iplTeams) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/archon", "root", "root");
			PreparedStatement pst = con.prepareStatement("insert into  iplteams values(?,?,?,?)");
			
			pst.setString(1,iplTeams.getTeamcaptainname());
			pst.setInt(2, iplTeams.getTrophies());
			pst.setString(3, iplTeams.getTeamownername());
			pst.setString(4, iplTeams.getTeamname());
			
			pst.executeUpdate();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return "data inserted";
	}
	
	ArrayList<IPLTeams> list = new ArrayList<IPLTeams>();
	public ArrayList<IPLTeams> getIPLTeam() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		     Connection con =	DriverManager.getConnection("jdbc:mysql://localhost:3306/archon", "root", "root");
             Statement stm = con.createStatement();
		     ResultSet rs =  stm.executeQuery("select * from iplteams");
		     
		     while(rs.next()) {
		    	 
		    	    String teamcaptainname =  rs.getString(1);
				   int trophies = rs.getInt(2);
				   String teamownername =   rs.getString(3);
				   String teamname = rs.getString(4);
				   
				   IPLTeams iplTeams = new IPLTeams(teamcaptainname, trophies, teamownername, teamname);
				   list.add(iplTeams);
		     }
		  
             
		}catch (Exception e) {
			// TODO: handle exception
		}
		return list;	
	}
	
	public String updateIPlTeam(String teamcaptaionname, String teamname) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/archon", "root","root");
			  PreparedStatement ps =  con.prepareStatement("update iplteams set teamcaptainname=? where teamname=?");
		            ps.setString(1, teamcaptaionname);
		            ps.setString(2, teamname);
		            
		            ps.executeUpdate();
		
		}catch (Exception e) {
			// TODO: handle exception
		}
		return "update successfully";
	}
	
	public String updateAll(IPLTeams iplTeams) {
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/archon", "root", "root");
	        // Fixed SQL query - removed the extra comma
	        PreparedStatement ps = con.prepareStatement("UPDATE iplteams SET teamcaptainname=?, trophies=?, teamownername=? WHERE teamname=?");
	        
	        // Set the parameters correctly
	        ps.setString(1, iplTeams.getTeamcaptainname());
	        ps.setInt(2, iplTeams.getTrophies());
	        ps.setString(3, iplTeams.getTeamownername());
	        ps.setString(4, iplTeams.getTeamname());
	        
	        // Execute the update
	        ps.executeUpdate();
	        
	    } catch (Exception e) {
	        e.printStackTrace();  // Log the exception
	    }
	    return "update data";
	}

	
	public String deleteData(String teamname) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/archon", "root", "root");
		    PreparedStatement ps = con.prepareStatement("delete from iplteams where teamname=?");
			ps.setString(1, teamname);
			
		int row =	ps.executeUpdate();
		System.out.println("Executing query with teamname: " + teamname);

		if(row>0) {
			return "data deleted successfully";
		}else {
			return "data not found";
		}
			
		}catch (Exception e) {
		    e.printStackTrace();  // Print stack trace for better debugging
		}
		return "deleted data";
	}
	
}
