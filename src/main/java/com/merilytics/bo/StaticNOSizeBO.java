package com.merilytics.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tbl_static_nosize")
public class StaticNOSizeBO {

	@Id
	@GenericGenerator(name = "gen", strategy = "native")
	@GeneratedValue(generator = "gen")
	private Integer pkNoSizeID;

	private Integer pkSizeID;

	private String nOSize;

	private Boolean status;

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Integer getPkSizeID() {
		return pkSizeID;
	}

	public void setPkSizeID(Integer pkSizeID) {
		this.pkSizeID = pkSizeID;
	}

	public Integer getPkNoSizeID() {
		return pkNoSizeID;
	}

	public void setPkNoSizeID(Integer pkNoSizeID) {
		this.pkNoSizeID = pkNoSizeID;
	}

	public String getnOSize() {
		return nOSize;
	}

	public void setnOSize(String nOSize) {
		this.nOSize = nOSize;
	}

}
