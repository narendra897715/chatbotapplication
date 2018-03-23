package com.merilytics.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tbl_static_noseason")
public class StaticNoseasonBO {

	@Id
	@GenericGenerator(name = "gen", strategy = "native")
	@GeneratedValue(generator = "gen")
	private Integer pkNOSeasonID;

	private String nOSeason;

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

	public Integer getPkNOSeasonID() {
		return pkNOSeasonID;
	}

	public void setPkNOSeasonID(Integer pkNOSeasonID) {
		this.pkNOSeasonID = pkNOSeasonID;
	}

	public String getnOSeason() {
		return nOSeason;
	}

	public void setnOSeason(String nOSeason) {
		this.nOSeason = nOSeason;
	}

}
