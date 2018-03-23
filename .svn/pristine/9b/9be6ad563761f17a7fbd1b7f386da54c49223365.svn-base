package com.merilytics.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tbl_static_fashionpyramid")
public class StaticFashionPyramidBO {

	@Id
	@GenericGenerator(name = "gen", strategy = "native")
	@GeneratedValue(generator = "gen")
	private Integer pkFashionPyramidID;

	private String FashionPyramid;

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

	public Integer getPkFashionPyramidID() {
		return pkFashionPyramidID;
	}

	public void setPkFashionPyramidID(Integer pkFashionPyramidID) {
		this.pkFashionPyramidID = pkFashionPyramidID;
	}

	public String getFashionPyramid() {
		return FashionPyramid;
	}

	public void setFashionPyramid(String fashionPyramid) {
		FashionPyramid = fashionPyramid;
	}

}
