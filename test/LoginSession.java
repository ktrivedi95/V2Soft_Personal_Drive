package com.v2soft.training.model;
// Generated Oct 15, 2019 10:20:54 AM by Hibernate Tools 5.1.10.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * LoginSession generated by hbm2java
 */
@Entity
@Table(name = "login_session", catalog = "employee")
public class LoginSession implements java.io.Serializable {

	private LoginSessionId id;
	private EmployeeLogin employeeLogin;

	public LoginSession() {
	}

	public LoginSession(LoginSessionId id, EmployeeLogin employeeLogin) {
		this.id = id;
		this.employeeLogin = employeeLogin;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "username", column = @Column(name = "username", nullable = false, length = 50)),
			@AttributeOverride(name = "loginStatus", column = @Column(name = "login_status", nullable = false)) })
	public LoginSessionId getId() {
		return this.id;
	}

	public void setId(LoginSessionId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "username", nullable = false, insertable = false, updatable = false)
	public EmployeeLogin getEmployeeLogin() {
		return this.employeeLogin;
	}

	public void setEmployeeLogin(EmployeeLogin employeeLogin) {
		this.employeeLogin = employeeLogin;
	}

}
