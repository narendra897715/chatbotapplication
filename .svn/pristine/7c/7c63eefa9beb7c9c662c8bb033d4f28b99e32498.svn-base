package com.merilytics.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tbl_static_bottomrise")
public class StaticBottomriseBO {

	@Id
	@GenericGenerator(name = "gen", strategy = "native")
	@GeneratedValue(generator = "gen")
	private Integer pkBottomRiseID;

	private String bottomRise;
	@Transient
	private Integer slNumber;
	
	private Boolean status;

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Integer getPkBottomRiseID() {
		return pkBottomRiseID;
	}

	public void setPkBottomRiseID(Integer pkBottomRiseID) {
		this.pkBottomRiseID = pkBottomRiseID;
	}

	public String getBottomRise() {
		return bottomRise;
	}

	public void setBottomRise(String bottomRise) {
		this.bottomRise = bottomRise;
	}

	public Integer getSlNumber() {
		return slNumber;
	}

	public void setSlNumber(Integer slNumber) {
		this.slNumber = slNumber;
	}

}
