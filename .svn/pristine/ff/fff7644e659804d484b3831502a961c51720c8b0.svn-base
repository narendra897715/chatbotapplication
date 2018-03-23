package com.merilytics.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tbl_static_colorfamily")
public class StaticColorfamilyBO {

	@Id
	@GenericGenerator(name = "gen", strategy = "native")
	@GeneratedValue(generator = "gen")
	private Integer pkColorFamilyID;

	private String colorFamily;
	@Transient
	private Integer slNumber;

	private Boolean status;

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Integer getPkColorFamilyID() {
		return pkColorFamilyID;
	}

	public void setPkColorFamilyID(Integer pkColorFamilyID) {
		this.pkColorFamilyID = pkColorFamilyID;
	}

	public String getColorFamily() {
		return colorFamily;
	}

	public void setColorFamily(String colorFamily) {
		this.colorFamily = colorFamily;
	}

	public Integer getSlNumber() {
		return slNumber;
	}

	public void setSlNumber(Integer slNumber) {
		this.slNumber = slNumber;
	}

}
