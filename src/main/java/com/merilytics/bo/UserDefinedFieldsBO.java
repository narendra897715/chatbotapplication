package com.merilytics.bo;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tbl_user_defined_fields")
public class UserDefinedFieldsBO {
	
	@Id
	@GenericGenerator(name = "gen", strategy = "native")
	@GeneratedValue(generator = "gen")
	private Integer pkID;
	private String uDF;
	private String columnName;
	private Boolean status;
	private Timestamp createdDate;
	@Transient
	private Integer sNo;
	
	
	
	
	public Integer getsNo() {
		return sNo;
	}
	public void setsNo(Integer sNo) {
		this.sNo = sNo;
	}
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
	public Integer getPkID() {
		return pkID;
	}
	public void setPkID(Integer pkID) {
		this.pkID = pkID;
	}
	public String getuDF() {
		return uDF;
	}
	public void setuDF(String uDF) {
		this.uDF = uDF;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
}
