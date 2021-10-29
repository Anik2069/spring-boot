package com.user;
import com.location.Location;
public class User {
	

	public String id;
	public String firstname;
	public String lastname;
	public Location location;
	public String email;
	public User(String id, String firstname, String lastname, Location location, String email) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.location = location;
		this.email = email;
	}
  
    
}
