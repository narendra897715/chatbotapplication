package com.merilytics.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tbl_static_nocategorycode")
public class StaticNocategoryCodeBO {

	@Id
	@GenericGenerator(name = "gen", strategy = "native")
	@GeneratedValue(generator = "gen")
	private Integer pkNOCategoryCode;

	private String nOCategoryCode;

	private Integer pknOCategoryID;

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

	public Integer getPkNOCategoryCode() {
		return pkNOCategoryCode;
	}

	public void setPkNOCategoryCode(Integer pkNOCategoryCode) {
		this.pkNOCategoryCode = pkNOCategoryCode;
	}

	public String getnOCategoryCode() {
		return nOCategoryCode;
	}

	public void setnOCategoryCode(String nOCategoryCode) {
		this.nOCategoryCode = nOCategoryCode;
	}

}
