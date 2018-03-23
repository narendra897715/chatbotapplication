package com.merilytics.bo;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tbl_role_to_screen_mapping")
public class ScreenToRoleMappingBO {
	@Id
	@GenericGenerator(name = "gen", strategy = "native")
	@GeneratedValue(generator = "gen")
	@Column(name = "mapping_id",length=8)
	private Integer mappingId;

	@Column(name = "screen_id")
	private Integer ScreenId; 

	@Column(name = "role_id")
	private Integer roleId;
	

	
	@Column(name="parent_id")
	private Integer parentId;
	
	@Column(name="screen_name")
	private String screenName;
	
	
	
	@Column(name = "createdby")
	private String createdBy;

	@Column(name = "modifiedby")
	private String modifiedBy;

	@Column(name = "creation_date")
	private Timestamp creation_date;

	@Column(name = "updation_date")
	private Timestamp updation_date;

	@Column(name = "status")
	private Boolean status;

	

	public Integer getMappingId() {
		return mappingId;
	}

	public void setMappingId(Integer mappingId) {
		this.mappingId = mappingId;
	}

	public Integer getScreenId() {
		return ScreenId;
	}

	public void setScreenId(Integer screenId) {
		ScreenId = screenId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	
	

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(Timestamp creation_date) {
		this.creation_date = creation_date;
	}

	public Timestamp getUpdation_date() {
		return updation_date;
	}

	public void setUpdation_date(Timestamp updation_date) {
		this.updation_date = updation_date;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	
}
