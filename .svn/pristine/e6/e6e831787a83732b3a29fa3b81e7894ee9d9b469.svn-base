package com.merilytics.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tbl_static_productstyle")
public class StaticProductStyleBO {

	@Id
	@GenericGenerator(name = "gen", strategy = "native")
	@GeneratedValue(generator = "gen")
	private Integer pkProductStyleID;

	private String productStyle;

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

	public Integer getPkProductStyleID() {
		return pkProductStyleID;
	}

	public void setPkProductStyleID(Integer pkProductStyleID) {
		this.pkProductStyleID = pkProductStyleID;
	}

	public String getProductStyle() {
		return productStyle;
	}

	public void setProductStyle(String productStyle) {
		this.productStyle = productStyle;
	}

}
