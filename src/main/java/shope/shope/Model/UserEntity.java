package shope.shope.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="\"mstUser\"")
@NamedQuery(name="MstUser.findAll", query="SELECT m FROM UserEntity m")
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"userId\"")
     private String userId;
	
	@Column(name="\"password\"")
     private String password = "";
	
	@Column(name="\"company\"")
     private String company;
	
	@Column(name="\"firstName\"")
     private String firstName;
	
	@Column(name="\"lastName\"")
     private String lastName;
	
	@Column(name="\"email\"")
     private String email;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", password=" + password + ", company=" + company + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}

	public UserEntity(String userId, String password, String company, String firstName, String lastName, String email) {
		
		this.userId = userId;
		this.password = password;
		this.company = company;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	

}
