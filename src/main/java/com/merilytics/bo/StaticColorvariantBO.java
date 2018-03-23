package com.merilytics.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tbl_static_colorvariant")
public class StaticColorvariantBO {

	@Id
	@GenericGenerator(name = "gen", strategy = "native")
	@GeneratedValue(generator = "gen")
	private Integer pkColorVariantID;

	private String colorVariant;

	private Integer pkColorFamilyID;

	private Boolean status;

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Integer getPkColorVariantID() {
		return pkColorVariantID;
	}

	public void setPkColorVariantID(Integer pkColorVariantID) {
		this.pkColorVariantID = pkColorVariantID;
	}

	public String getColorVariant() {
		return colorVariant;
	}

	public void setColorVariant(String colorVariant) {
		this.colorVariant = colorVariant;
	}

	public Integer getPkColorFamilyID() {
		return pkColorFamilyID;
	}

	public void setPkColorFamilyID(Integer pkColorFamilyID) {
		this.pkColorFamilyID = pkColorFamilyID;
	}

}
