package com.merilytics.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

// tbl_static_month

@Entity
@Table(name = "tbl_static_month")
public class StaticMonthBO {

	@Id
	@GenericGenerator(name = "gen", strategy = "native")
	@GeneratedValue(generator = "gen")
	private Integer pkMonth;

	private String month;

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

	public Integer getPkMonth() {
		return pkMonth;
	}

	public void setPkMonth(Integer pkMonth) {
		this.pkMonth = pkMonth;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

}
