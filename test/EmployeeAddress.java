package com.v2soft.training.model;
// Generated Oct 14, 2019 10:09:27 AM by Hibernate Tools 5.1.10.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * EmployeeAddress generated by hbm2java
 */
@Entity
@Table(name = "employee_address", catalog = "employee")
public class EmployeeAddress implements java.io.Serializable {

	private EmployeeAddressId id;
	private AddressType addressType;
	private Employee Employee;
	private String addressLineOne;
	private String addressLineTwo;
	private String city;
	private String state;
	private String zipcode;
	private String zipfour;

	public EmployeeAddress() {
	}

	public EmployeeAddress(EmployeeAddressId id, AddressType addressType, Employee Employee,
			String addressLineOne, String city, String state, String zipcode) {
		this.id = id;
		this.addressType = addressType;
		this.Employee = Employee;
		this.addressLineOne = addressLineOne;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public EmployeeAddress(EmployeeAddressId id, AddressType addressType, Employee Employee,
			String addressLineOne, String addressLineTwo, String city, String state, String zipcode, String zipfour) {
		this.id = id;
		this.addressType = addressType;
		this.Employee = Employee;
		this.addressLineOne = addressLineOne;
		this.addressLineTwo = addressLineTwo;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.zipfour = zipfour;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "employeeId", column = @Column(name = "employee_id", nullable = false, length = 12)),
			@AttributeOverride(name = "addressTypeId", column = @Column(name = "address_type_id", nullable = false)) })
	public EmployeeAddressId getId() {
		return this.id;
	}

	public void setId(EmployeeAddressId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "address_type_id", nullable = false, insertable = false, updatable = false)
	@JsonIgnore
	public AddressType getAddressType() {
		return this.addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id", nullable = false, insertable = false, updatable = false)
	@JsonIgnore
	public Employee getEmployee() {
		return this.Employee;
	}

	public void setEmployee(Employee Employee) {
		this.Employee = Employee;
	}

	@Column(name = "address_line_one", nullable = false, length = 50)
	public String getAddressLineOne() {
		return this.addressLineOne;
	}

	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}

	@Column(name = "address_line_two", length = 50)
	public String getAddressLineTwo() {
		return this.addressLineTwo;
	}

	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
	}

	@Column(name = "city", nullable = false, length = 30)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "state", nullable = false, length = 30)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "zipcode", nullable = false, length = 5)
	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Column(name = "zipfour", length = 4)
	public String getZipfour() {
		return this.zipfour;
	}

	public void setZipfour(String zipfour) {
		this.zipfour = zipfour;
	}

}