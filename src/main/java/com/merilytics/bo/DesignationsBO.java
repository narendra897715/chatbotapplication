package com.merilytics.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tbl_static_designations")
public class DesignationsBO {
	@Id
	@GenericGenerator(name = "gen", strategy = "native")
	@GeneratedValue(generator = "gen")
	private Integer designationID;
	private String designation;
	
	

	public Integer getDesignationID() {
		return designationID;
	}

	public void setDesignationID(Integer designationID) {
		this.designationID = designationID;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	
}
