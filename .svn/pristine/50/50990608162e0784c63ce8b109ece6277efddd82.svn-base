package com.merilytics.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tbl_static_fabrictype")
public class StaticFabrictypeBO {

	@Id
	@GenericGenerator(name = "gen", strategy = "native")
	@GeneratedValue(generator = "gen")
	private Integer pkFabricType;

	private String fabrictype;

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

	public Integer getPkFabricType() {
		return pkFabricType;
	}

	public void setPkFabricType(Integer pkFabricType) {
		this.pkFabricType = pkFabricType;
	}

	public String getFabrictype() {
		return fabrictype;
	}

	public void setFabrictype(String fabrictype) {
		this.fabrictype = fabrictype;
	}

}
