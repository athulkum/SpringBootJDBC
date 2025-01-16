package com.codewithathul;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	Dao dao;
	
	public String insertIPLTeam(IPLTeams iplTeams) {
	return dao.insertIPLTeam(iplTeams);
	}
	
	public ArrayList<IPLTeams> getIPLTeam() {
	return	dao.getIPLTeam();
	}
	
	public String updateIPLTeam( String teamcaptainname, String teamname )  {
	return dao.updateIPlTeam(teamcaptainname, teamname);	
	}
	
	public String updateAll(IPLTeams iplTeams) {
		return dao.updateAll(iplTeams);
	}
	
	public String deleteData(String teamname) {
	return	dao.deleteData(teamname);
	}

}
