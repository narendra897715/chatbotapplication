package com.merilytics.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tbl_staitic_category")
public class StaiticCategoryBO {

	@Id
	@GenericGenerator(name = "gen", strategy = "native")
	@GeneratedValue(generator = "gen")
	private Integer pkCategoryID;

	private String category;
	
	private Boolean status;
	
	

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Transient
	private Integer slNumber;

	public Integer getSlNumber() {
		return slNumber;
	}

	public void setSlNumber(Integer slNumber) {
		this.slNumber = slNumber;
	}

	public Integer getPkCategoryID() {
		return pkCategoryID;
	}

	public void setPkCategoryID(Integer pkCategoryID) {
		this.pkCategoryID = pkCategoryID;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
