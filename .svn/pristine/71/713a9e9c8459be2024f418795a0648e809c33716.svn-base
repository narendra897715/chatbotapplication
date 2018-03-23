package com.merilytics.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tbl_static_subcategory")
public class StaticSubCategoryBO {

	@Id
	@GenericGenerator(name = "gen", strategy = "native")
	@GeneratedValue(generator = "gen")
	private Integer pkSubCategoryID;

	private String subCategory;

	private Integer pkCategoryID;

	private Boolean status;

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Integer getPkSubCategoryID() {
		return pkSubCategoryID;
	}

	public void setPkSubCategoryID(Integer pkSubCategoryID) {
		this.pkSubCategoryID = pkSubCategoryID;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public Integer getPkCategoryID() {
		return pkCategoryID;
	}

	public void setPkCategoryID(Integer pkCategoryID) {
		this.pkCategoryID = pkCategoryID;
	}

}
