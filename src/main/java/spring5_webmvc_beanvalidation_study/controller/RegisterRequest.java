package spring5_webmvc_beanvalidation_study.controller;

public class RegisterRequest {
	private String email;
	private String password;
	private String confirmPassword;
	private String name;
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password =password;
	}
	
	
	
	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String conformPassword) {
		this.confirmPassword = conformPassword;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public boolean isPasswordEqualToConfirmPassword() {
		return password.contentEquals(confirmPassword);
	}



	@Override
	public String toString() {
		return String.format("RegisterRequest [email=%s, password=%s, confirmPassword=%s, name=%s]", email, password,
				confirmPassword, name);
	}
	
	

}
