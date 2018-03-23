package com.merilytics.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tbl_static_occasion")
public class StaticOccasionBO {

	@Id
	@GenericGenerator(name = "gen", strategy = "native")
	@GeneratedValue(generator = "gen")
	private Integer pkOccasionID;

	private String occasion;

	@Transient
	private Integer slNumber;

	private Boolean status;

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Integer getSlNumber() {
		return slNumber;
	}

	public void setSlNumber(Integer slNumber) {
		this.slNumber = slNumber;
	}

	public Integer getPkOccasionID() {
		return pkOccasionID;
	}

	public void setPkOccasionID(Integer pkOccasionID) {
		this.pkOccasionID = pkOccasionID;
	}

	public String getOccasion() {
		return occasion;
	}

	public void setOccasion(String occasion) {
		this.occasion = occasion;
	}

}
