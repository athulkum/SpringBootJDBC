package com.codewithathul;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	Service service;
	
	@PostMapping("/ipl")
	public String insertIPLTeam(@RequestBody IPLTeams iplTeams) {
     return service.insertIPLTeam(iplTeams);
	}
	
	@GetMapping("/ipl")
	public ArrayList<IPLTeams> getIPLTeam() {
	return	service.getIPLTeam();
	}
	
	@PutMapping("/ipl/{teamcaptainname}/{teamname}")
	public String updateIPLTeam(@PathVariable String teamcaptainname, @PathVariable String teamname) {
	return	service.updateIPLTeam(teamcaptainname, teamname);	
	}
	
	@PutMapping("/ipl")
	public String updateAll(@RequestBody IPLTeams iplTeams) {
		return service.updateAll(iplTeams);
	}
	
	@DeleteMapping("/ipl/{teamname}")
	public String deleteData(@PathVariable  String teamname) {
	return service.deleteData(teamname);
	}

}
