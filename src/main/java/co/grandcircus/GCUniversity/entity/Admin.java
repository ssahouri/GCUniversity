package co.grandcircus.GCUniversity.entity;

import javax.persistence.Column;

public class Admin extends User{
	
	@Column
	Long id;
	@Column
	String firstName;
	@Column
	String lastName; 
	@Column
	String userName; 
	@Column
	String password;
	
	
	
	
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	@Override
	public String toString() {
		return "Admin [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
				+ ", password=" + password + "]";
	}
	
	

	public Admin(Long id, String firstName, String lastName, String userName, String password) {
		super(id, password, password, password, password);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isAdmin() {
		// TODO Auto-generated method stub
		return true;
	}

}
