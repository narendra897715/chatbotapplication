package com.merilytics.bo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user_Applications")
public class UserApplicationsBO {
	@Id
	private Integer ID;
	private String  applicationName;
	private String url;
	private String logo;
	private String acronym;
	public String getAcronym() {
		return acronym;
	}
	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getApplicationName() {
		return applicationName;
	}
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	

}
