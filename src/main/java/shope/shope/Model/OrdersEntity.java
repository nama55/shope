package shope.shope.Model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="\"orders\"")
@NamedQuery(name="Orders.findAll", query="SELECT m FROM OrdersEntity m")
public class OrdersEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"Id\"")
	    private Integer id;
	
		@Column(name="\"employeeId\"")
	    private Integer employeeId;
	    
		@Column(name="\"customerId\"")
	    private Integer customerId;
	    
		@Column(name="\"orderDate\"")
		@CreationTimestamp
	    private Timestamp  orderDate;
		
		@Column(name="\"shippedDate\"")
		@CreationTimestamp
	    private Timestamp    shippedDate;
	    
		@Column(name="\"paidDate\"")
		@CreationTimestamp
	    private Timestamp paidDate;
	    
		@Column(name="\"shipName\"")
	    private String  shipName;
	    
		@Column(name="\"shipAddress1\"")
	    private String  shipAddress1;
	    
		@Column(name="\"shipAddress2\"")
	    private String  shipAddress2;
	    
		@Column(name="\"shipCity\"")
	    private String  shipCity;
	    
		@Column(name="\"shipState\"")
	    private String  shipState;
	
		@Column(name="\"shipPostalCode\"")
	    private String  shipPostalCode;
	
		@Column(name="\"shipCountry\"")
	    private String  shipCountry;
		
		@Column(name="\"shippingFee\"")
	    private BigDecimal shippingFee;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Integer getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(Integer employeeId) {
			this.employeeId = employeeId;
		}

		public Integer getCustomerId() {
			return customerId;
		}
		public void setCustomerId(Integer customerId) {
			this.customerId = customerId;
		}


		public Timestamp getOrderDate() {
			return orderDate;
		}

		public void setOrderDate(Timestamp orderDate) {
			this.orderDate = orderDate;
		}


		public Timestamp getShippedDate() {
			return shippedDate;
		}

		public void setShippedDate(Timestamp shippedDate) {
			this.shippedDate = shippedDate;
		}

		public Timestamp getPaidDate() {
			return paidDate;
		}

		public void setPaidDate(Timestamp paidDate) {
			this.paidDate = paidDate;
		}

		public String getShipName() {
			return shipName;
		}

		public void setShipName(String shipName) {
			this.shipName = shipName;
		}

		public String getShipAddress1() {
			return shipAddress1;
		}

		public void setShipAddress1(String shipAddress1) {
			this.shipAddress1 = shipAddress1;
		}

		public String getShipAddress2() {
			return shipAddress2;
		}

		public void setShipAddress2(String shipAddress2) {
			this.shipAddress2 = shipAddress2;
		}

		public String getShipCity() {
			return shipCity;
		}

		public void setShipCity(String shipCity) {
			this.shipCity = shipCity;
		}

		public String getShipState() {
			return shipState;
		}

		public void setShipState(String shipState) {
			this.shipState = shipState;
		}

		public String getShipPostalCode() {
			return shipPostalCode;
		}

		public void setShipPostalCode(String shipPostalCode) {
			this.shipPostalCode = shipPostalCode;
		}

		public String getShipCountry() {
			return shipCountry;
		}

		public void setShipCountry(String shipCountry) {
			this.shipCountry = shipCountry;
		}

		public BigDecimal getShippingFee() {
			return shippingFee;
		}

		public void setShippingFee(BigDecimal shippingFee) {
			this.shippingFee = shippingFee;
		}


		public OrdersEntity(Integer id, Integer employeeId, Integer customerId, Timestamp orderDate,
				Timestamp shippedDate, Timestamp paidDate, String shipName, String shipAddress1, String shipAddress2,
				String shipCity, String shipState, String shipPostalCode, String shipCountry, BigDecimal shippingFee) {
			
			this.id = id;
			this.employeeId = employeeId;
			this.customerId = customerId;
			this.orderDate = orderDate;
			this.shippedDate = shippedDate;
			this.paidDate = paidDate;
			this.shipName = shipName;
			this.shipAddress1 = shipAddress1;
			this.shipAddress2 = shipAddress2;
			this.shipCity = shipCity;
			this.shipState = shipState;
			this.shipPostalCode = shipPostalCode;
			this.shipCountry = shipCountry;
			this.shippingFee = shippingFee;
		}

		@Override
		public String toString() {
			return "OrdersEntity [id=" + id + ", employeeId=" + employeeId + ", customerId=" + customerId
					+ ", orderDate=" + orderDate + ", shippedDate=" + shippedDate + ", paidDate=" + paidDate
					+ ", shipName=" + shipName + ", shipAddress1=" + shipAddress1 + ", shipAddress2=" + shipAddress2
					+ ", shipCity=" + shipCity + ", shipState=" + shipState + ", shipPostalCode=" + shipPostalCode
					+ ", shipCountry=" + shipCountry + ", shippingFee=" + shippingFee + "]";
		}
		
		

}
