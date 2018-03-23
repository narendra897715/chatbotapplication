package com.merilytics.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tbl_static_fabrication")
public class StaticFabricationBO {

	@Id
	@GenericGenerator(name = "gen", strategy = "native")
	@GeneratedValue(generator = "gen")
	private Integer pkFabricationID;

	private String fabrication;
	@Transient
	private Integer slNumber;

	private Boolean status;

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getFabrication() {
		return fabrication;
	}

	public void setFabrication(String fabrication) {
		this.fabrication = fabrication;
	}

	public Integer getPkFabricationID() {
		return pkFabricationID;
	}

	public void setPkFabricationID(Integer pkFabricationID) {
		this.pkFabricationID = pkFabricationID;
	}

	public Integer getSlNumber() {
		return slNumber;
	}

	public void setSlNumber(Integer slNumber) {
		this.slNumber = slNumber;
	}

}
