package com.merilytics.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tbl_static_scale")
public class StaticScaleBO {

	@Id
	@GenericGenerator(name = "gen", strategy = "native")
	@GeneratedValue(generator = "gen")
	private Integer pkScaleID;

	private String scale;

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

	public Integer getPkScaleID() {
		return pkScaleID;
	}

	public void setPkScaleID(Integer pkScaleID) {
		this.pkScaleID = pkScaleID;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

}
