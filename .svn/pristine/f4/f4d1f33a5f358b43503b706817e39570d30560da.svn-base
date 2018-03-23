package com.merilytics.bo;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_system_parameters")
public class SystemParametersBO {

	@Id
	@Column(name = "company_code")
	private String companyCode;

	@Column(name = "admin_contact_email")
	private String adminEmail;

	@Column(name = "it_support_email")
	private String itSupportEmail;
	
	@Column(name = "it_support_password")
	private String itSupportPassword;

	@Column(name = "smtp_port")
	private Integer SMTPPort;

	@Column(name = "smtp_server_ip")
	private String SMTPServerIp;

	@Column(name = "creation_date")
	private Timestamp creationDate;

	@Column(name = "updation_date")
	private Timestamp updationDate;

	@Column(name = "status")
	private String status;

	
	public String getItSupportPassword() {
		return itSupportPassword;
	}

	public void setItSupportPassword(String itSupportPassword) {
		this.itSupportPassword = itSupportPassword;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getItSupportEmail() {
		return itSupportEmail;
	}

	public void setItSupportEmail(String itSupportEmail) {
		this.itSupportEmail = itSupportEmail;
	}

	public Integer getSMTPPort() {
		return SMTPPort;
	}

	public void setSMTPPort(Integer sMTPPort) {
		SMTPPort = sMTPPort;
	}

	public String getSMTPServerIp() {
		return SMTPServerIp;
	}

	public void setSMTPServerIp(String sMTPServerIp) {
		SMTPServerIp = sMTPServerIp;
	}

	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public Timestamp getUpdationDate() {
		return updationDate;
	}

	public void setUpdationDate(Timestamp updationDate) {
		this.updationDate = updationDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

    
	

	
}
