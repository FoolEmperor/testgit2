package demo.mcx.entity;

public class User {
	private String userName;
	private String password;
	private String age;
	private String sex;
	
	public User() {
		super();
	}
	
	public User(String userName, String password, String age, String sex) {
		super();
		this.userName = userName;
		this.password = password;
		this.age = age;
		this.sex = sex;
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
