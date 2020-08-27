package shope.shope.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="\"customers\"")
@NamedQuery(name="Customers.findAll", query="SELECT m FROM CustomersEntity m")
public class CustomersEntity {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"Id\"")
     private String Id;
	
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

	
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
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

	public CustomersEntity(String id, String password, String company, String firstName, String lastName, String email,
			String phone, String address1, String address2, String city, String state, String postalCode,
			String country) {
		
		this.Id = id;
		this.password = password;
		this.company = company;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
	}

	@Override
	public String toString() {
		return "CustomersEntity [Id=" + Id + ", password=" + password + ", company=" + company + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email + ", phone=" + phone + ", address1="
				+ address1 + ", address2=" + address2 + ", city=" + city + ", state=" + state + ", postalCode="
				+ postalCode + ", country=" + country + "]";
	}
   
   

}
