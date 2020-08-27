package shope.shope.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="\"employee\"")
@NamedQuery(name="Employee.findAll", query="SELECT m FROM EmployeeEntity m")
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"id\"")
    private Integer id;
	
	@Column(name="\"firstName\"")
    private String firstName;
	
	@Column(name="\"lastName\"")
    private String lastName;
	
	@Column(name="\"email\"")
    private String email;
	
	@Column(name="\"avatar\"")
    private String  avatar;
    
	@Column(name="\"jobTitle\"")
    private String  jobTitle;
    
	@Column(name="\"department\"")
    private String  department;
	
	@Column(name="\"managerId\"")
    private Integer managerId;
    
	@Column(name="\"phone\"")
    private String  phone;

	@Column(name="\"address1\"")
    private String  address1;
	
	@Column(name="\"address2\"")
    private String  address2;

	@Column(name="\"city\"")
    private String  city;
	
	@Column(name="\"state\"")
    private String  state;
	
	@Column(name="\"postalCode\"")
    private String  postalCode;
	
	@Column(name="\"country\"")
    private String  country;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", avatar=" + avatar + ", jobTitle=" + jobTitle + ", department=" + department + ", managerId="
				+ managerId + ", phone=" + phone + ", address1=" + address1 + ", address2=" + address2 + ", city="
				+ city + ", state=" + state + ", postalCode=" + postalCode + ", country=" + country + "]";
	}

	public EmployeeEntity(Integer id, String firstName, String lastName, String email, String avatar, String jobTitle,
			String department, Integer managerId, String phone, String address1, String address2, String city,
			String state, String postalCode, String country) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.avatar = avatar;
		this.jobTitle = jobTitle;
		this.department = department;
		this.managerId = managerId;
		this.phone = phone;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
	}
	
	
}
