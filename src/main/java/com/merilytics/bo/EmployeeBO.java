package com.merilytics.bo;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "tbl_Employee")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeBO {

	@Id
	@Column(name = "ID")
	private Integer iD;

	@Column(name = "FirstName")
	private String firstName;

	@Column(name = "LastName")
	private String lastName;

	@Column(name = "EmailID")
	private String email;

	@Column(name = "ContactNO")
	private String contactNo;

	@Column(name = "Date_of_Joining")
	private Timestamp date_of_Joining;

	@Column(name = "JobType")
	private String jobType;

	@Column(name = "RoleID")
	private Integer role_id;

	private Integer PMCycleID;

	@Column(name = "doaminID")
	private Integer workStreamID;

	@Column(name = "Status")
	private boolean status;

	@Column(name = "Relieving_Date")
	private Timestamp releaving_date;

	@Column(name = "Eligibility_for_Appraisal")
	private boolean eligibility_for_appraisal;

	@Column(name = "Eligibility_to_provide_feedback")
	private boolean eligibility_to_provide_feedback;

	@Column(name = "Password")
	private String password;

	@Column(name = "PrevPassword1")
	private String prepassword1;

	@Column(name = "PrevPassword2")
	private String prepassword2;

	@Column(name = "PrevPassword3")
	private String prepassword3;

	@Column(name = "Last_Login_Datetime")
	private Timestamp last_login_datetime;

	@Column(name = "ForcePasswordChange")
	private Boolean forcePasswordChange;

	@Column(name = "Last_Password_Change_Date")
	private Timestamp last_Password_Change_Date;

	@Column(name = "Immediate_Reporting_Manager_ID")
	private Integer immediate_Reporting_Manager_ID;

	@Column(name = "CreatedDate")
	private Timestamp createdDate;

	@Column(name = "CreatedBy")
	private Integer createdBy;

	@Column(name = "ModifiedDate")
	private Timestamp modifiedDate;

	@Column(name = "ModifiedBy")
	private Integer modifiedBy;

	@Column(name = "DesignationID")
	private Integer designationID;
	
	private String userToken;
	
	private Timestamp tokenCreationDate;
	
	private String OTP;
	
	private Timestamp OTPModifiedDate;

	public Timestamp getOTPModifiedDate() {
		return OTPModifiedDate;
	}

	public void setOTPModifiedDate(Timestamp oTPModifiedDate) {
		OTPModifiedDate = oTPModifiedDate;
	}

	public String getOTP() {
		return OTP;
	}

	public void setOTP(String oTP) {
		OTP = oTP;
	}

	public Timestamp getTokenCreationDate() {
		return tokenCreationDate;
	}

	public void setTokenCreationDate(Timestamp tokenCreationDate) {
		this.tokenCreationDate = tokenCreationDate;
	}

	public Integer getPMCycleID() {
		return PMCycleID;
	}

	public void setPMCycleID(Integer pMCycleID) {
		PMCycleID = pMCycleID;
	}

	public Integer getDesignationID() {
		return designationID;
	}

	public void setDesignationID(Integer designationID) {
		this.designationID = designationID;
	}

	public Integer getiD() {
		return iD;
	}

	public void setiD(Integer iD) {
		this.iD = iD;
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

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public Timestamp getDate_of_Joining() {
		return date_of_Joining;
	}

	public void setDate_of_Joining(Timestamp date_of_Joining) {
		this.date_of_Joining = date_of_Joining;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public Integer getRole_id() {
		return role_id;
	}

	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}

	public Integer getWorkStreamID() {
		return workStreamID;
	}

	public void setWorkStreamID(Integer workStreamID) {
		this.workStreamID = workStreamID;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Timestamp getReleaving_date() {
		return releaving_date;
	}

	public void setReleaving_date(Timestamp releaving_date) {
		this.releaving_date = releaving_date;
	}

	public boolean isEligibility_for_appraisal() {
		return eligibility_for_appraisal;
	}

	public void setEligibility_for_appraisal(boolean eligibility_for_appraisal) {
		this.eligibility_for_appraisal = eligibility_for_appraisal;
	}

	public boolean isEligibility_to_provide_feedback() {
		return eligibility_to_provide_feedback;
	}

	public void setEligibility_to_provide_feedback(boolean eligibility_to_provide_feedback) {
		this.eligibility_to_provide_feedback = eligibility_to_provide_feedback;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPrepassword1() {
		return prepassword1;
	}

	public void setPrepassword1(String prepassword1) {
		this.prepassword1 = prepassword1;
	}

	public String getPrepassword2() {
		return prepassword2;
	}

	public void setPrepassword2(String prepassword2) {
		this.prepassword2 = prepassword2;
	}

	public String getPrepassword3() {
		return prepassword3;
	}

	public void setPrepassword3(String prepassword3) {
		this.prepassword3 = prepassword3;
	}

	public Timestamp getLast_login_datetime() {
		return last_login_datetime;
	}

	public void setLast_login_datetime(Timestamp last_login_datetime) {
		this.last_login_datetime = last_login_datetime;
	}

	public Boolean getForcePasswordChange() {
		return forcePasswordChange;
	}

	public void setForcePasswordChange(Boolean forcePasswordChange) {
		this.forcePasswordChange = forcePasswordChange;
	}

	public Timestamp getLast_Password_Change_Date() {
		return last_Password_Change_Date;
	}

	public void setLast_Password_Change_Date(Timestamp last_Password_Change_Date) {
		this.last_Password_Change_Date = last_Password_Change_Date;
	}

	public Integer getImmediate_Reporting_Manager_ID() {
		return immediate_Reporting_Manager_ID;
	}

	public void setImmediate_Reporting_Manager_ID(Integer immediate_Reporting_Manager_ID) {
		this.immediate_Reporting_Manager_ID = immediate_Reporting_Manager_ID;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Integer getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(Integer modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getUserToken() {
		return userToken;
	}

	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

	

}
