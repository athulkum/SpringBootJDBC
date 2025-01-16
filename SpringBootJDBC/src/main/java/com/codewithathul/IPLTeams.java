package com.codewithathul;

public class IPLTeams {

	private String teamcaptainname;
	
	private int trophies;
	
	private String teamownername;
	
	private String teamname;

	public IPLTeams() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IPLTeams(String teamcaptainname, int trophies, String teamownername, String teamname) {
		super();
		this.teamcaptainname = teamcaptainname;
		this.trophies = trophies;
		this.teamownername = teamownername;
		this.teamname = teamname;
	}

	public String getTeamcaptainname() {
		return teamcaptainname;
	}

	public void setTeamcaptainname(String teamcaptainname) {
		this.teamcaptainname = teamcaptainname;
	}

	public int getTrophies() {
		return trophies;
	}

	public void setTrophies(int trophies) {
		this.trophies = trophies;
	}

	public String getTeamownername() {
		return teamownername;
	}

	public void setTeamownername(String teamownername) {
		this.teamownername = teamownername;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	@Override
	public String toString() {
		return "IPLTeams [teamcaptainname=" + teamcaptainname + ", trophies=" + trophies + ", teamownername="
				+ teamownername + ", teamname=" + teamname + "]";
	}
	
	
	
	
}
