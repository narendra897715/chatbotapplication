package com.merilytics.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tbl_static_nocategory")
public class StaticNocategoryBO {

	@Id
	@GenericGenerator(name = "gen", strategy = "native")
	@GeneratedValue(generator = "gen")
	private Integer pknOCategoryID;

	private String nOCategory;

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

	public Integer getPknOCategoryID() {
		return pknOCategoryID;
	}

	public void setPknOCategoryID(Integer pknOCategoryID) {
		this.pknOCategoryID = pknOCategoryID;
	}

	public String getnOCategory() {
		return nOCategory;
	}

	public void setnOCategory(String nOCategory) {
		this.nOCategory = nOCategory;
	}

}
