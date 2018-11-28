package co.grandcircus.GCUniversity.entity;

public class Admin extends User{

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
