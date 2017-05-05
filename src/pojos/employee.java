package pojos;

public class employee {

	private String username;
	private String pwd;
	private String email;

	public employee() {
		super();
	}

	public employee(String username, String pwd, String email) {
		super();
		this.username = username;
		this.pwd = pwd;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "employee [username=" + username + ", pwd=" + pwd + ", email=" + email + "]";
	}

}