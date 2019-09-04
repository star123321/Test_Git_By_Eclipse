package nuc.ss.entity;

public class Wz_User {

	private String wzUsername;
	private String wzPassword;
	
	public Wz_User() {}

	public Wz_User(String wzUsername, String wzPassword) {
		this.wzUsername = wzUsername;
		this.wzPassword = wzPassword;
	}

	public String getWzUsername() {
		return wzUsername;
	}

	public void setWzUsername(String wzUsername) {
		this.wzUsername = wzUsername;
	}

	public String getWzPassword() {
		return wzPassword;
	}

	public void setWzPassword(String wzPassword) {
		this.wzPassword = wzPassword;
	}
	
}
