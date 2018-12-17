package models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table (name = "users")
public class User {
	
	@Id
	private int Id;
	
	private String username;
	
	private String password;
	
	private String role;
	
	
	public User(){}
	
	

	public User(int id, String username, String password, String role) {
		super();
		Id = id;
		this.username = username;
		this.password = password;
		this.role = role;
	}



	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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
	
	

}