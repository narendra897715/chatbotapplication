package com.merilytics.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tbl_static_shade")
public class StaticShadeBO {

	@Id
	@GenericGenerator(name = "gen", strategy = "native")
	@GeneratedValue(generator = "gen")
	private Integer pkShadeID;

	private String shade;

	private Integer pkColorVariantID;

	private Integer pkColorFamilyID;

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

	public Integer getPkShadeID() {
		return pkShadeID;
	}

	public void setPkShadeID(Integer pkShadeID) {
		this.pkShadeID = pkShadeID;
	}

	public String getShade() {
		return shade;
	}

	public void setShade(String shade) {
		this.shade = shade;
	}

	public Integer getPkColorVariantID() {
		return pkColorVariantID;
	}

	public void setPkColorVariantID(Integer pkColorVariantID) {
		this.pkColorVariantID = pkColorVariantID;
	}

	public Integer getPkColorFamilyID() {
		return pkColorFamilyID;
	}

	public void setPkColorFamilyID(Integer pkColorFamilyID) {
		this.pkColorFamilyID = pkColorFamilyID;
	}

}
