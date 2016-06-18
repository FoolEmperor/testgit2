package demo.mcx.entity;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class Client {

	@Length(min=6,max=12,message="name在{min}到{max}位字符之间")
	private String name;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Past(message="birthday不在当前时间之前") @NotNull(message="birthday不为空")
	private Date birthday;
	
	@NotEmpty(message="sex不为空")
	private String sex;
	
	@Length(min=6,max=18,message="password长度在{min}到{max}位字符之间")
	private String password;
	
	@Email(message="邮箱格式错误")@NotEmpty(message="email不为空")
	private String email;

	public Client() {
		super();
	}
	
	public Client(String name, Date birthday, String sex, String password,
			String email) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.sex = sex;
		this.password = password;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
